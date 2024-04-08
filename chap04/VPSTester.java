package chap04;

import java.util.Scanner;

public class VPSTester {

	public static void main(String[] args) {

		CharStack vpsStack = new CharStack(64);

		Scanner sc = new Scanner(System.in);
		System.out.print("괄호 문자열 : ");

		char[] pArr = sc.nextLine().toCharArray();

		boolean isVPS = true;

		for (char p : pArr) {
			if (p == '(') {
				vpsStack.push(p);
			} else if (p == '{') {
				vpsStack.push(p);
			} else if (p == '[') {
				vpsStack.push(p);
			} else if (p == ')') {
				if (vpsStack.getTop() == '(') {
					vpsStack.pop();
				} else if (vpsStack.getTop() == '{') {
					vpsStack.pop();
				}else if (vpsStack.getTop() == '[') {
					vpsStack.pop();
				}
				else {
					isVPS = false;
					break;
				}
			} else if (p == '}') {
				if (vpsStack.getTop() == '(') {
					vpsStack.pop();
				} else if (vpsStack.getTop() == '{') {
					vpsStack.pop();
				}else if (vpsStack.getTop() == '[') {
					vpsStack.pop();
				}
				
				else {
					isVPS = false;
					break;
				}
			} else if (p == ']') {
				if (vpsStack.getTop() == '(') {
					vpsStack.pop();
				} else if (vpsStack.getTop() == '{') {
					vpsStack.pop();
				}else if (vpsStack.getTop() == '[') {
					vpsStack.pop();
				}
				else {
					isVPS = false;
					break;
				}
			}

		}
		if (isVPS && !vpsStack.isEmpty())
			isVPS = false;

		String result = isVPS ? "YES" : "NO";
		System.out.println(result);

	}

}
