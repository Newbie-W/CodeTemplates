void bubbleSort(ElemType A[], int n)
{
	for (i=0; i<n-1; i++)
	{
		flag = false;
		for (j=n-1; j>i; j--)
		{
			if (A[j-1].key > A[j].key)
			{
				swap(A[j-1],A[j]);
				flag = true;
			}
		}
		if (flag == false) return;
	}
}