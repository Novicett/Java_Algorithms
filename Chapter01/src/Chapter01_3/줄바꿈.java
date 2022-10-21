package Chapter01_3;

import java.util.Scanner;

public class 줄바꿈 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("*를 n개ㅔ 출력하되 w개마다 줄을 바꿔서 출력합니다.");
		System.out.print("n의 값:");
		int n=s.nextInt();		
		System.out.print("w의 값:");
		int w=s.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print("*");
			if (i%w==0) {
				System.out.println();
			}
		}
		
	}

}
