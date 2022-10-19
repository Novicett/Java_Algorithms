package Chapter01_1;

import java.util.Scanner;

public class 최댓값구하기 {
	
	public 최댓값구하기() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("세 정수의 최댓값을 구합니다.");
		System.out.print("a의 값:");
		int a=s.nextInt();
		System.out.print("b의 값:");
		int b=s.nextInt();
		System.out.print("c의 값:");
		int c=s.nextInt();
		int max=a;
		if(max<b) max=b;
		if(max<c) max=c;
		System.out.println("최댓값은:"+ max);
		
	}
	public static void main(String[] args) {
		최댓값구하기 a = new 최댓값구하기();
	}

}
