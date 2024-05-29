package mysort.sort;

public class MergeSort extends Sort {

	@Override
	public void sort(int[] dataList) {
		// 파라미터로 받은 데이터 set
		setData(dataList);
		mergeSort(sortedData, 0, sortedData.length - 1);
	}

	void mergeSort(int[] dataList, int start, int end) {
		if (start >= end) // 처음 부터 끝까지 다 돌았을 경우 return
			return;

		int mid = (start + end) / 2; // 중간 인덱스 선언
		 // 중간 인덱스 기준으로 분할(리컬시브
		mergeSort(dataList, start, mid);
		mergeSort(dataList, mid + 1, end);
		merge(dataList, start, mid, end);
	}

	void merge(int[] dataList, int start, int mid, int end) {
		int[] tempList = new int[end - start + 1]; //분할 한 부분크기의 임시 배열
		int i = start, j = mid + 1, k = 0;
		// 분할 된 구간에서 첫번째 값과 중간의 값 부터 비교하여 작으면 왼쪽, 크면 오른쪽으로
		while (i <= mid && j <= end) {
			if (dataList[i] <= dataList[j]) // 비교했을 때 작은값을 tempList에 먼저 넣기
				tempList[k++] = dataList[i++];
			else
				tempList[k++] = dataList[j++];
		}
		// 나머지
		while (i <= mid)
			tempList[k++] = dataList[i++];
		while (j <= end)
			tempList[k++] = dataList[j++];

		for (i = start, k = 0; k < tempList.length; i++, k++)
			dataList[i] = tempList[k];
		// System.arraycopy(dataList, start, tempList, 0, end-start+1);
	}

}
