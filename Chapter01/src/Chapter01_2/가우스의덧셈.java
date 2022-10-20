package Chapter01_2;

import java.util.Scanner;

public class 가우스의덧셈 {
	public 가우스의덧셈() {
		Scanner s = new Scanner(System.in);
		System.out.print("1부터 n까지 정수의 합(가우스 공식) :");
		int a=s.nextInt();
		int sum=0;
		
		if(a%2==0) {
			sum=(1+a)*(a/2);
		}
		else {
			sum=(1+a)*(a/2)+(a/2)+1;
		}
		System.out.println(sum);
		
	}
	
	
	public static void main(String[] args) {
		가우스의덧셈 a = new 가우스의덧셈();
	}

}
