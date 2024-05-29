package mysort.sort;

public class InsertionSort extends Sort {

	@Override
	public void sort(int[] dataList) {
		// 파라미터로 받은 데이터 set
		setData(dataList);

		for (int i = 1; i < sortedData.length; i++) {
			int loc = findLessFromLast(sortedData, sortedData[i], i - 1); // 삽입할 인덱스 구하기
			if (loc != i - 1) // 삽입할 엔덱스와 읽은 인덱스가 같지 않을 때
				insertData(sortedData, loc + 1, i);
		}

	}

    // 삽입할 인덱스와 현재 읽은 인덱스를 받고 삽입하는 메서드
	private void insertData(int[] dataList, int target, int source) {
		// 일시적으로 값을 저장할 temp 선언
		int temp = dataList[source]; // 현재 읽은 값 저장
		for (int i = source; i > target; i--) { // 현재 읽은 값의 인덱스 부터 삽입을 할 인덱스 전까지 한칸씩 당기기
			dataList[i] = dataList[i - 1];								
		}														
		dataList[target] = temp; // 삽입할 인덱스에 현재 읽었던 값 삽입
	}

	// 읽는 데이터와 읽는 데이터의 인덱스 - 1을 받고 인덱스 - 1부터 0까지 읽은 데이터와 같거나 작은 값이 있는 인덱스를 구하는 메서드
	private int findLessFromLast(int[] dataList, int data, int last) {
		for (int i = last; i >= 0; i--) {
			if (dataList[i] <= data)
				return i; // i 기준으로 왼쪽으로 읽으며 data 보다 작거나 같은 값의 인덱스 반환
		}
		return -1;
	}

}
