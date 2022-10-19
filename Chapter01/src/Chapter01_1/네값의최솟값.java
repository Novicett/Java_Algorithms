package Chapter01_1;

public class 네값의최솟값 {
	static int min4(int a, int b, int c, int d) {
		int min=a;
		if(b<min) min=b;
		if(c<min) min=c;
		if(c<min) min=d;
		return min;
	}
	public static void main(String[] args) {
		System.out.println("min4(3,2,6,1):"+min4(3,2,6,1));
		System.out.println("min4(6,9,2,5):"+min4(6,9,2,5));
		System.out.println("min4(1,2,3,4):"+min4(1,2,3,4));
		System.out.println("min4(2,0,3,4):"+min4(2,0,3,4));

	}

}
