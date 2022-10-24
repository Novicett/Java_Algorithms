package Chapter02_2;

//1,000이하의 소수 구하기
public class 소수 {

	public static void main(String[] args) {
//		int count = 0;
//		for (int i = 2; i <= 1000; i++) {
//			int j;
//			for (j = 2; j < i; j++) {
//				count++;
//				if (i % j == 0) {
//					break;
//				}
//			}
//			if (i == j) {
//				System.out.println(i);
//			}
//		}
//		System.out.println("연산 횟수 :"+count); // 좋지 못한 알고리즘

		int count = 0;
		int ptr = 0;
		int[] prime = new int[500];

		prime[ptr++] = 2;
		for (int n = 3; n <= 1000; n += 2) { // 조사 대상은 홀수만
			int i;
			for (i = 1; i < ptr; i++) {
				count++;
				if (n % prime[i] == 0) {
					break;
				}
			}
			if (ptr == i) {
				prime[ptr++] = n;
			}
		}
		for (int i = 0; i < ptr; i++) {
			System.out.println(prime[i]);
		}
		System.out.println("나눗셈을 수행한 횟수:"+count);
	}

}
