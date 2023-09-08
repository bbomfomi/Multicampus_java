package day06;

class car{
	static String b="나는 Car's 클래스변수";
	double a=50.5;//인스턴스 변수
}//car class

public class StaticTest {
	
			int a=10;//인스턴스 변수
	static  int b=20;//클래스 변수

	public static void main(String[] args) {
		//b 값 출력
		System.out.println("StaticTest.b: "+StaticTest.b);
		System.out.println("b: "+b);
		//car의 b 출력
		System.out.println("car.b: "+car.b);
		
		//car의 a 출력
		//System.out.println("car.a: "+car.a);[x]
		car c1=new car();
		System.out.println("c1.a="+c1.a);//[o] 인스턴스명, 변수
		
		//StaticTest의 a값 출력
		//System.out.println("a="+a);[x]
		StaticTest st=new StaticTest();
		System.out.println("st.a="+st.a);//[o] 인스턴스명, 변수
		System.out.println("st.b="+st.b);

	}

}
