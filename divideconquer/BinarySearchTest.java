package divideconquer;

import java.util.Scanner;

public class BinarySearchTest {

	public static void main(String[] args) {

		int[] numArr = {2, 5, 7, 9, 11, 14, 17, 22, 26};
		
		Scanner sc = new Scanner(System.in);
		System.out.print("찾을 숫자 : ");
		int num = sc.nextInt();
		
		System.out.println(binarySearch(num, numArr));
//		System.out.print("인덱스 번호 : " + binarySearchRec(num, numArr, 0, numArr.length-1));
	}
	static int binarySearch(int num, int[] numArr) {
		int start = 0;
		int end = numArr.length - 1;
		
		while(start <= end) {
			int mid = (start + end) / 2;
			if(num == numArr[mid]) return mid;
			else if(num < numArr[mid]) end = mid -1;
			else start = mid + 1;
		}
		return -1;
	}

	private static int binarySearchRec(int num, int[] numArr, int start, int end) {
		//base condition
		if(start > end) {
			return -1;
		}
		//divide
		int mid = (start + end) / 2;
		
		//conquer
		if(num == numArr[mid]) return mid;
		
		if(num < numArr[mid]) {
			end = mid - 1;
		} else {
			start = mid + 1;
		}

		return binarySearchRec(num, numArr, start, end);

	}

}
