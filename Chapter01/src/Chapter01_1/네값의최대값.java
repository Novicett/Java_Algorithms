package Chapter01_1;

public class 네값의최대값 {
	static int max4(int a,int b,int c, int d) {
		int max=a;
		if(max<b) max=b;
		if(max<c) max=c;
		if(max<d) max=d;
		return max;
	}
	public static void main(String[] args) {
		System.out.println("max4(1,2,3,4) : "+max4(1,2,3,4));
		System.out.println("max4(3,2,6,1) : "+max4(3,2,6,1));
		System.out.println("max4(10,23,31,45) : "+max4(10,23,31,45));
	}

}
