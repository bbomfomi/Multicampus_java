package day02;

public class Primitive {
	public static void main(String[] args) {
		System.out.println("Primitive Type (기본 자료형)-----");
		//1. 정수형
		//byte < short < int < long
		byte bt1=-128; //1byte
		byte bt2=127;
		System.out.println("bt1="+bt1);
		System.out.println("bt2="+bt2);
		
		//byte bt3=128; //128=> int형
		short st=128; //2byte
		System.out.println("st="+st);;
		short st2=-23000;
		System.out.println("st2="+st2);
		
		int it=500000; //4byte
		//정수형의 디폴트
		long ln1=50; //8byte
		long ln2=50L;
		
		System.out.printf("it=%d%n",it);
		System.out.printf("ln1=%d%n",ln1);
		System.out.printf("ln2=%d%n",ln2);
		
		int i = 1000000000; //0이 9개
		long j = 10000000000L; //0이 10개, 한도 초과
		
		System.out.printf("i=%d%n",i);
		System.out.printf("j=%d%n",j);
		
		int a=010; //8진수 정수. 8진수는 앞에 '0'을 붙인다
		int b=0x1af; //16진수. 16진수는 앞에 '0x'를 붙인다
		
		//010
		//1*8 + 0*1=8
		System.out.println("a="+a); //8
		
		//0x1af
		//1*16^2 + 10*16 + 15*1
		System.out.println("b="+b); //431
		
		int c=0217;
		//2*64 +8 +7 =128+15=143
		System.out.println("c="+c); //143
		
	}
}
