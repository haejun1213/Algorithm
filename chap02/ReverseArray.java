package chap02;

import java.util.Random;
import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		System.out.print("배열 자릿수를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		int[] numArr = new int[sc.nextInt()]; 
		
		randonArray(numArr, 100);
		
		reverseArray(numArr);

		displayArray(numArr);

	}

	static void randonArray(int[] numArr, int num) {
		Random rd = new Random();
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = rd.nextInt(num);
			System.out.print(numArr[i] + " ");
		}System.out.println();
	}

	static void reverseArray(int[] numArr) {
		for (int i = 0; i < numArr.length / 2; i++) {
			swap(numArr, i, numArr.length - 1 - i);

		}
	}

	static void swap(int[] numArr, int src, int trg) {
		int temp = numArr[src];
		numArr[src] = numArr[trg];
		numArr[trg] = temp;

	}

	static void displayArray(int[] numArr) {
		for (int i = 0; i < numArr.length; i++) {
			System.out.print(numArr[i] + " ");

		}
	}

}
