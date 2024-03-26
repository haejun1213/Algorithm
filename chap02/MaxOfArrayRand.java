package chap02;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {

	public static void main(String[] args) {

		int num = getPositiveNumber("사람 수 : ");

		int[] height = new int[num];
		getRandArray(height, 100, 200);

		int max = maxOf(height);
		System.out.println("가장 큰 키는 : " + max + "cm 입니다");

	}

	static int getPositiveNumber(String string) {
		Scanner sc = new Scanner(System.in);
		int number;
		do {
			System.out.print(string);
			number = sc.nextInt();
			
		} while (number <= 0);
		return number;
	}
	static void getRandArray(int[] numArr, int start, int end) {
		Random rd = new Random();
		for (int i = 0; i < numArr.length; i++) {
		numArr[i] = start + rd.nextInt(end - start);
		System.out.print(numArr[i] + " ");
		}
		System.out.println();
	}
	

	static int maxOf(int[] numArr) {

		int max = numArr[0];
		for (int i = 1; i < numArr.length; i++)
			if (max < numArr[i]) {
				max = numArr[i];
			}
		return max;
	}

}
