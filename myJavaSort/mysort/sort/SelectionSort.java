package mysort.sort;

public class SelectionSort extends Sort {

	@Override
	public void sort(int[] dataList) { // Sort 클래스의 sort 메서드 오버라이링
		// 파라미터로 받은 데이터 set
		setData(dataList);
		
		// last(배열의 마지막 인덱스)부터 last 가 1일 때 까지(selectMax에서 기본 비교값을 0으로 설정했기 때문에) 반복
		for (int last = sortedData.length - 1; last >= 1; last--) {
			// 최대값이 있는 인덱스 구하기
			int maxIndex = selectMax(sortedData, last);
			// last 와 maxIndex가 같지 않으면 last 인덱스의 값과 maxIndex의 값 swap
			if (maxIndex != last)
				swap(sortedData, maxIndex, last);
		}
	}
	// 최댓값의 인덱스를 구하는 메서드
	int selectMax(int[] dataList, int last) {
		// 최댓값과 최댓값의 인덱스 선언(초기 비교값 0과 인덱스 0으로)
		int max = dataList[0];       
		int maxIndex = 0;              
										 
		// 인덱스 1부터 last 중에서 최댓값 구하기  
		for (int i = 1; i <= last; i++) { 
			if (dataList[i] > max) {      
				max = dataList[i]; // 최댓값
				maxIndex = i; // 최댓값 인덱스
			}
		}
		return maxIndex; // 최댓값 인덱스 반환
	}

}


 
   
    
     
      












