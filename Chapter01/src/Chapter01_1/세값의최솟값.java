package Chapter01_1;

public class 세값의최솟값 {
	static int min3(int a, int b, int c) {
		int min=a;
		if(b<min) min=b;
		if(c<min) min=c;
		return min;
	}
	public static void main(String[] args) {
		System.out.println("min3(3,2,6):"+min3(3,2,6));
		System.out.println("min3(1,5,8):"+min3(1,5,8));
		System.out.println("min3(6,5,2):"+min3(6,5,3));
	}

}
