package Chapter01_2;

import java.util.Scanner;

public class 정수의합반환 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("두 개의 정수를 입력하여 두 정수 사이 합을 반환");
		System.out.print("정수입력 :");
		int a=s.nextInt();
		System.out.print("정수입력 :");
		int b=s.nextInt();
		System.out.println("정수 사이합"+sumof(a, b));
	}

	static int sumof(int a, int b) {
		int sum=0;
		if(a>b) {
			
			for (int i = b; i <= a; i++) {
				sum=sum+i;
			}
			
		}
		else {
			for (int i = a; i <= b; i++) {
				sum=sum+i;
			}
		}

		return sum;
	}

}
