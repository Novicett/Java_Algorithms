package Chapter01_3;

import java.util.Scanner;

public class 구구단 {

	public static void main(String[] args) {
//		곱셈 이중 for문
//		System.out.print(" |  1  2  3  4  5  6  7  8  9");
//		System.out.println();
//		System.out.println("---+-------------------------");
//		
//		for (int i = 1; i < 10; i++) {
//			System.out.print( i+"|");
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%3d",i*j);
//			}
//			System.out.println();
//		}
		
//		덧셈 이중 for문
//		System.out.print(" |  1  2  3  4  5  6  7  8  9");
//		System.out.println();
//		for (int i = 1; i < 10; i++) {
//			System.out.print(i + "|");
//			for (int j = 1; j < 10; j++) {
//				System.out.printf("%3d", i + j);
//			}
//			System.out.println();
//		}
		
//      정사각형 출력
		Scanner s = new Scanner(System.in);
		System.out.println("정사격형을 출력합니다.");
		System.out.print("변의 길이:");
		int a=s.nextInt();
		for (int i = 0; i <a ; i++) {
			for (int j = 0; j < a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
