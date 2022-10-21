package Chapter02_1;

import java.util.Scanner;

public class 키의최댓값 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("키의 최댓값을 구합니다.");
		System.out.print("사람 수:");
		int a = s.nextInt();
		int height[] = new int[a];
		int max = 0;
		for (int i = 0; i < height.length; i++) {
			System.out.print("height[" + i + "]: ");
			height[i] = s.nextInt();
		}
		max = height[0];
		for (int i = 1; i < height.length; i++) {

			if (height[i]>max) {
				max=height[i];
			}
		}
		System.out.println("최댓값은 "+max+"입니다.");
	}

}
