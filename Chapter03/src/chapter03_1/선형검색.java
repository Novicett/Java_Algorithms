package chapter03_1;

import java.util.Scanner;

public class 선형검색 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("요솟수:");
		int n = s.nextInt(); // 입력갯수
		int x[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("x[" + i + "]" + ":");
			x[i] = s.nextInt();
		}

		System.out.println("검색할 값 :");
		int q = s.nextInt(); // 이 값을 찾을시 검색 종료 하거나 끝까지 가서 검색 종료
		int i = 0;
		while (true) {
			if (i == n) {
				System.out.println("값을 찾지못했습니다.");
				break;
			}
			if (x[i] == q) { // 내가 찾을려는 값과 같으면
				System.out.println("그 값은 x[" + i + "]에 있습니다.");
				break;
			}
			i++;

		}
		s.close();

	}
}
