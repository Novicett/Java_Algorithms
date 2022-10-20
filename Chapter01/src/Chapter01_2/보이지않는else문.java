package Chapter01_2;

import java.util.Scanner;

public class 보이지않는else문 {
	// 입력한 정숫값을 판단(2)

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("정수를 입력하세요.: ");
		int n = stdIn.nextInt();

		if (n == 1)
			System.out.println("Ａ");
		else if (n == 2)
			System.out.println("Ｂ");
		else if (n == 3)
			System.out.println("Ｃ");
		//보이지 않는 else문이 있기에 분기가 4분기 
	}
}