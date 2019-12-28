//A[0]为哨兵

/*
直接插入排序
*/
void insertSort(ElemType A[], int n)
{
	int i, j;
	for (i=2; i<=n; i++)
	{
		if (A[i].key < A[i-1].key)
		{
			A[0] = A[i];
			for (j=i-1; A[0].key<A[j].key; --j)//比A[j]大的往后移
			{
				A[j+1] = A[j];
			}
			A[j+1] = A[0];
		}
	}
}

/*
折半插入排序
*/
void binaryInsertSort(ElemType A[], int n)
{
	int i, j, low, high, mid;
	for (i=2; i<=n; i++) {
		A[0] = A[i];
		low = 1;  high = i-1;
		while (low <= high) {
			mid = (low + high) / 2;
			if (A[mid].key > A[0].key) 
				high = mid - 1;
			else 
				low = mid + 1;
		}
		for (j=i-1; j>=high+1; --j) {
			A[j+1] = A[j];
		}
		A[high+1] = A[0];
	}
}

/*
希尔排序
*/