static void swap(int[] arr, int a, int b) {
	int t = arr[a];
	arr[a] = arr[b];
	arr[b] = arr[a];
}

static void bubleSort(int arr[]) {
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