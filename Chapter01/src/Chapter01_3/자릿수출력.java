package Chapter01_3;

import java.util.Scanner;

public class 자릿수출력 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("양의 자릿수를 구합니다.");
		int a;
		do {
			System.out.print("양의 자릿수 입력:");
			a = s.nextInt();
		} while (a <= 0);

		int count = 1;
		while (a > 0) {
			count++;
			a = a / 10;
		}

		System.out.println("그 수는 " + count + "자리입니다.");
		s.close();
	}

}
