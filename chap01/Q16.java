package chap01;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		npira(sc.nextInt());
	}

	public static void npira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k < i*2; k++) {
				System.out.print(i % 10);
			}System.out.println();
			
			
			
		}
	}

}
