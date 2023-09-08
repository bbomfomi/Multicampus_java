package day06;

public class YourDemo {
	
	//반환타입을 갖는 메소드
	public int add(int x, int y) {
		System.out.println(x+"+"+y+"="+(x+y));
		return x+y;
	}
	
	public double multi(double x, float y) {
		System.out.println(x+"x"+y+"="+(x*y));
		return x*y;
	}
	
	public static float div(long m, short n) {
		System.out.println(m+"/"+n+"="+(m/n));
		return m/n;
	}
	
}
