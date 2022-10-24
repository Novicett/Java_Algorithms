package Chapter02_2;

import java.util.Arrays;
import java.util.Scanner;

public class 배열의역순 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수: ");
		int num = sc.nextInt();

		int num2[] = new int[num];

		for (int i = 0; i < num2.length; i++) {
			System.out.print("x[" + i + "]: ");
			num2[i] = sc.nextInt();
		}

		reverse(num2);

		System.out.println("요소를 역순으로 정렬했습니다.");
		System.out.println("x =" + Arrays.toString(num2));

	}

	static void reverse(int[] num2) {
		System.out.print(Arrays.toString(num2));
		for (int i = 0; i < num2.length / 2; i++) {
			swap(num2, i, num2.length - i - 1);
		}

	}

	static void swap(int[] num2, int a, int b) {
		
		System.out.println();
		int temp = num2[a];
		num2[a] = num2[b];
		num2[b] = temp;
		System.out.println("x["+a+"]"+"과"+"x["+b+"]"+"을 교환합니다.");
		System.out.print(Arrays.toString(num2));
	}

}
