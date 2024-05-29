package mysort.sort;

public class QuickSort extends Sort {

	@Override
	public void sort(int[] dataList) {
		// 파라미터로 받은 데이터 set
		setData(dataList);
		quickSort(sortedData, 0, sortedData.length - 1); // 첫번째 인덱스, 마지막 인덱스 받기

		
	}

	void quickSort(int[] dataList, int start, int end) {
		if (start >= end) // 처음 부터 끝까지 다 돌았을 경우 return
			return;
		
		int p = partition(dataList, start, end);

		quickSort(dataList, start, p - 1);
		quickSort(dataList, p + 1, end);
	}									
												
	int partition(int[] dataList, int start, int end) {
		int pivot = dataList[end];		
		int leftEnd = start - 1; // left
		for (int i = start; i <= end - 1; i++) {
			if (dataList[i] < pivot) { // pivot 보다 작을 경우  
				swap(dataList, ++leftEnd, i); // 가장 왼쪽부터 스왑
			}													
		}															
		swap(dataList, leftEnd + 1, end); //pivot 중앙으로 				
		return leftEnd + 1;														
	}																				
																						
}										
										