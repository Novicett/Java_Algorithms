package Chapter02_3;

public class 클래스연습 {

	public static void main(String[] args) {
		YMD a = new YMD(2022, 10, 27);
	}

}

class YMD {
	int y; // 년
	int m; // 월
	int d; // 일

	public YMD(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
		System.out.println(y + "-" + m + "-" + d);
	}

}
