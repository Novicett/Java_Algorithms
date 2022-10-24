package Chapter02_2;

import java.util.Scanner;

public class 배열의합계 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수 :");
		int num=sc.nextInt();
		int num2[]=new int[num];
		for (int i = 0; i < num2.length; i++) {
			System.out.print("x["+i+"]: ");
			num2[i]=sc.nextInt();
		}
		System.out.print("요소의 합계는: ");
		System.out.println(sumof(num2));
	}

	static int sumof(int[] num2) {
		int sum=0;
		for (int i = 0; i < num2.length; i++) {
			sum=sum+num2[i];
		}
		return sum;
		
	}

}
