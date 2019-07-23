static void swap(int[] arr, int a, int b) {
	int t = arr[a];
	arr[a] = arr[b];
	arr[b] = arr[a];
}

static void bubbleSort1(int arr[]) {
	/*
	* end为 还未排好序（最终顺序）的数中，最后一位的序号。为-1则说明，顺序排好。
	* 从0-end依次相邻间比较，谁大谁放后面（swap），从而将最大的选出来
	* 每一轮（每次将未排好序的数中最大的，都放在未排好序数的最后的过程）
	* 都先设已排好序为最终序。如果进入了被嵌套循环的循环体，说明当前仍不确保是最终序。
	* 直到某一轮，未进入被嵌套循环体，说明当前已是最终序，也不需要后续交换比较等了，因此直接break
	*/
	
	for (int end=arr.length-1; end>0; end--) {
		boolean isSort = true;
		for (int i=0; i<end; i++) {
			if (arr[i] > arr[i+1]) {
				swap(arr[i], arr[i+1]);
				isSort = false;
			}
		}
		if (isSort) break;
	}
}

void bubbleSort2(int arr[]) {
	/*
	* 思路与前同，少了isSort，如果早找到最终排序，也不会停下。
	* i为已经排好的数的个数
	*/
	int n = arr.length;
	for (int i=0; i<n-1; i++) {
		for (int j=0; i<n-i-1; j++) {
			if (arr[j] > arr[j+1]) {
				swap(arr[j], arr[j+1]);
			}
		}
	}
}