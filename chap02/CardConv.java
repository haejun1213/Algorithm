package chap02;

import java.util.Scanner;

public class CardConv {

	public static void main(String[] args) {
		//양수 입력받기
		int num = getPositiveNumber("양의 숫자 : ");
		//2진수로 변환하기 (메서드)
		int N = getPositiveNumber("몇 진수로 변환할까요? (양수) : ");
		//
		char[] cardNum = new char[64];
		int numDigit;
		numDigit = cardConv2(num, N,cardNum);
		//변환 결과 출력하기
		displayResult(cardNum, numDigit);
		
	}

	static void displayResult(char[] cardNum, int numDigit) {

		for (int i = numDigit - 1; i >= 0; i--) {
			System.out.print(cardNum[i]);
		}
		
		
		
	}

	static int cardConv2(int num,int N, char[] cardNum) {
		
		int numDigit = 0;
		String digitChar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		while (num > 0) {
		cardNum[numDigit++] = digitChar.charAt(num % N);
		num /= N;
		}
		return numDigit;
		
	}

	static int getPositiveNumber(String message) {
		Scanner sc = new Scanner(System.in);
		int num;
		do {
			System.out.print(message);
			num = sc.nextInt();
		} while(num <= 0);
		return num;
	}
	

}
