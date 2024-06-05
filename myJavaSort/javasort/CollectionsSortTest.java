package javasort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import comparable.CFruit;
import comparator.Fruit;
import comparator.FruitNameComparator;
import comparator.FruitPriceComparator;

public class CollectionsSortTest {
	public static void main(String[] args) {
		sortInteger(); // 정수를 정렬하는 메서드 호출
        sortString(); // 문자열을 정렬하는 메서드 호출
        sortComparableFruit(); // Comparable을 구현한 CFruit 객체를 정렬하는 메서드 호출
        sortFruit(); // Comparator를 사용하여 Fruit 객체를 정렬하는 메서드 호출
	}

	private static void sortFruit() { // Fruit 객체를 정렬하는 메서드 정의
        System.out.println("====  Sort Comparable Fruit ===="); // 정렬 시작 메시지 출력
        ArrayList<Fruit> dataList = new ArrayList<>(Arrays.asList(new Fruit("apple", 1000), new Fruit("tomato", 4000), new Fruit("banana", 3000))); // Fruit 객체로 구성된 ArrayList 생성
        System.out.println("원본 : " + dataList); // 원본 데이터 출력

        Collections.sort(dataList, new FruitPriceComparator()); // 가격 기준 오름차순 정렬
        System.out.println("오름차순 : " + dataList); // 오름차순 정렬 결과 출력

        Collections.sort(dataList, new FruitNameComparator()); // 이름 기준 내림차순 정렬
        System.out.println("내림차순 : " + dataList); // 내림차순 정렬 결과 출력
    }

    private static void sortComparableFruit() { // Comparable을 구현한 CFruit 객체를 정렬하는 메서드 정의
        System.out.println("====  Sort Comparable Fruit ===="); // 정렬 시작 메시지 출력
        ArrayList<CFruit> dataList = new ArrayList<>(
                Arrays.asList(new CFruit("apple", 1000), new CFruit("tomato", 4000), new CFruit("banana", 3000))); // CFruit 객체로 구성된 ArrayList 생성
        System.out.println("원본 : " + dataList); // 원본 데이터 출력

        Collections.sort(dataList); // 오름차순 정렬 (기본 정렬)
        System.out.println("오름차순 : " + dataList); // 오름차순 정렬 결과 출력

        Collections.sort(dataList, Comparator.reverseOrder()); // 내림차순 정렬
        System.out.println("내림차순 : " + dataList); // 내림차순 정렬 결과 출력
    }

    static void sortInteger() { // 정수를 정렬하는 메서드 정의
        ArrayList<Integer> dataList = new ArrayList<>(Arrays.asList(40, 15, 34, 21, 66, 53)); // 정수로 구성된 ArrayList 생성
        System.out.println("원본 : " + dataList); // 원본 데이터 출력

        Collections.sort(dataList); // 오름차순 정렬
        System.out.println("오름차순 : " + dataList); // 오름차순 정렬 결과 출력

        Collections.sort(dataList, Comparator.reverseOrder()); // 내림차순 정렬
        System.out.println("내림차순 : " + dataList); // 내림차순 정렬 결과 출력
    }

    static void sortString() { // 문자열을 정렬하는 메서드 정의
        List<String> dataList = Arrays.asList("d", "A", "C", "F", "a"); // 문자열로 구성된 List 생성
        System.out.println("원본 : " + dataList); // 원본 데이터 출력

        Collections.sort(dataList); // 오름차순 정렬
        System.out.println("오름차순 : " + dataList); // 오름차순 정렬 결과 출력

        Collections.sort(dataList, Comparator.reverseOrder()); // 내림차순 정렬
        System.out.println("내림차순 : " + dataList); // 내림차순 정렬 결과 출력

        Collections.sort(dataList, String.CASE_INSENSITIVE_ORDER); // 대소문자 무시 오름차순 정렬
        System.out.println("대소문자무시 : " + dataList); // 대소문자 무시 오름차순 정렬 결과 출력

        Collections.sort(dataList, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER)); // 대소문자 무시 내림차순 정렬
        System.out.println("대소문자무시 내림차순 : " + dataList); // 대소문자 무시 내림차순 정렬 결과 출력
    }
}
