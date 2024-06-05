package javasort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraySortTest {
	public static void main(String[] args) {
		sortInteger();
		sortString();
	}

	static void sortInteger() {
		Integer[] dataList = { 40, 15, 34, 21, 66, 53 };
		System.out.println("원본 : " + Arrays.toString(dataList));

		Arrays.sort(dataList); // 파라미터값에 데이터만 있으면 기본적으로 오름차순 정렬
		System.out.println("오름차순 : " + Arrays.toString(dataList));

		Arrays.sort(dataList, Comparator.reverseOrder()); // Comparator.reverseOrder() 내림차순 정렬
		System.out.println("내림차순 : " + Arrays.toString(dataList));
	}

	static void sortString() {
		String[] dataList = { "d", "A", "C", "F", "a" };
		System.out.println("원본 : " + Arrays.toString(dataList));

		Arrays.sort(dataList); // 오름차순
		System.out.println("오름차순 : " + Arrays.toString(dataList));

		Arrays.sort(dataList, Comparator.reverseOrder()); // 내림차순
		System.out.println("내림차순 : " + Arrays.toString(dataList));

		Arrays.sort(dataList, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분 없이 정렬
		System.out.println("대소문자무시 : " + Arrays.toString(dataList));
 
		Arrays.sort(dataList, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER)); // 대소문자 구분 없이 내림차순 정렬
		System.out.println("대소문자무시 내림차순 : " + Arrays.toString(dataList));

	}
}
