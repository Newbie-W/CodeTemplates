static void swap(int[] arr, int a, int b) {
	int t = arr[a];
	arr[a] = arr[b];
	arr[b] = t;
}

static void selectSort(int arr[]) {
	for (int i=0; i<arr.length; i++) {
		int minIdx = i;
		for (int j = i+1; j<arr.length; j++) {
			if (arr[j] < arr[minIdx])
				minIdx = j;
		}
		swap(arr, minIdx, i);
	}
}