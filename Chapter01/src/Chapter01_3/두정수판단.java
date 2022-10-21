package Chapter01_3;

import java.util.Scanner;

public class 두정수판단 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a;
		int b;
		System.out.print("a값 :");
		a = s.nextInt();
		do {
			System.out.print("b값 :");
			b = s.nextInt();
			if (a>=b) {
				System.out.println("a보다 큰 값을 입력하세요!");
			}else {
				break;
			}
		} while (a >= b);
		int sum = b - a;
		System.out.println("b-a는 " + sum + "입니다.");
	}

}
