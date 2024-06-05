package javasort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortTest {

	public static void main(String[] args) {
		sortInteger();
		sortString();
	}
	
	static void sortInteger() { // 정수를 정렬하는 메서드 정의
	    ArrayList<Integer> dataList = new ArrayList<>(Arrays.asList(40, 15, 34, 21, 66, 53)); // 정수로 구성된 ArrayList 생성
	    System.out.println("원본 : " + dataList); // 원본 데이터 출력

	    dataList.sort(Comparator.naturalOrder()); // 오름차순 정렬
	    System.out.println("오름차순 : " + dataList); // 오름차순 정렬 결과 출력

	    dataList.sort(Comparator.reverseOrder()); // 내림차순 정렬
	    System.out.println("내림차순 : " + dataList); // 내림차순 정렬 결과 출력
	}

	static void sortString() { // 문자열을 정렬하는 메서드 정의
	    List<String> dataList = Arrays.asList("d", "A", "C", "F", "a"); // 문자열로 구성된 List 생성
	    System.out.println("원본 : " + dataList); // 원본 데이터 출력

	    dataList.sort(Comparator.naturalOrder()); // 오름차순 정렬
	    System.out.println("오름차순 : " + dataList); // 오름차순 정렬 결과 출력

	    dataList.sort(Comparator.reverseOrder()); // 내림차순 정렬
	    System.out.println("내림차순 : " + dataList); // 내림차순 정렬 결과 출력

	    dataList.sort(String.CASE_INSENSITIVE_ORDER); // 대소문자 무시 오름차순 정렬
	    System.out.println("대소문자무시 : " + dataList); // 대소문자 무시 오름차순 정렬 결과 출력

	    dataList.sort(Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER)); // 대소문자 무시 내림차순 정렬
	    System.out.println("대소문자무시 내림차순 : " + dataList); // 대소문자 무시 내림차순 정렬 결과 출력
	}
}
