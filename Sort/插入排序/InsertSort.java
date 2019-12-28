/*
直接插入排序
*/
void insertSort(int[] arr) {
	for (int i=1; i<arr.length; i++) {
		int key = arr[i], j;
		for (j=i-1; j>=0 && arr[j]>key; j--)
			arr[j+1] = arr[j];
		arr[j+1] = key;
	}
}

/*
折半插入排序
*/
void binaryInsertSort(int arr[]) {
	for (i=1; i<arr.length; i++) {
		int L=0, R=i-1;
		int key = arr[i];
		while (L <= R) {
			int m = L + (R-L)/2;
			if (arr[m] > arr[i]) {
				R = m - 1;
			} else {
				L = m + 1;
			}
		}
		for (int j=i-1; j >= L; j--) {
			arr[j+1] = arr[j];
		}
		arr[L] = key;
	}
}

/*
希尔排序
*/