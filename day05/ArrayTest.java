package day05;

public class ArrayTest {
//	자료형
//	1. Primitive Type
//	2. Reference Type ==> new 연산자 객체 생성해서 초기화
//		- 클래스형
//		- 배열
//		- 인터페이스형
//		- 열거형
//
//
//
//	배열
//	-동종의 데이터만 저장 가능
//	- 고정 크기
//
//	int a[]={10,20,'A'}
//	a[0]
//	a[3] ==>[x]
//
//	[1] 선언
//	[2] 메모리할당
//	[3] 초기화
//
//	//1)
//	int []arr;
//	int arr[];
//
//	arr=new int[5]; //2)
	
//	//3)
//	arr[0]=10;
//	arr[1]=20;
//	arr[2]=30;...
	public static void main(String[] args) {
		int arr[] ;
		arr=new int[3];
		
		arr[0]=10;
		arr[1]=15;
		arr[2]=20;
		
		//int[][] arr2;//2차원배열
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		//System.out.println(arr[3]);//error
		
		//1)선언 + 2)메모리 할당
		double b[]=new double[4];
		
		System.out.println("b[0]="+b[0]);
		System.out.println("b[3]="+b[3]);
		//배열의 경우 초기화하지 않으면 디폴트값이 저장되어 있다.
		
		//3) 초기화
		b[0]=.147;
		b[1]=30e-2;
		b[2]=20;
		b[3]='A';
		
		System.out.println("b[0]="+b[0]);
		System.out.println("b[3]="+b[3]);
		
		System.out.println("b.length="+b.length);
		System.out.println("arr.length="+arr.length);
		
		//1), 2), 3) 선언과 동시에 메모리 할당 및 초기화
		char[] c= {'j','a','v',97};
		System.out.println("c.length: "+c.length);
		System.out.println(c[0]);
		System.out.println(c[3]);
		System.out.println("***************");
		//for루프문을 이용해서 c에 저장된 값을 한꺼번에 출력하세요
		for(int i=0;i<4;i++) {
			System.out.print(c[i]);
		}
		System.out.println();
		
		//for루프 이용해서 b에 저장된 값 출력하기
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		System.out.println("@@@@@@@@@@@@@@@@");
		
		//for each loop문 - 확장 for루프
		/*
		 * for(변수선언문: 자료구조){
		 * 	
		 * }
		 * */
		
		for(double val:b) {
			System.out.println(val);
		}
		
		//c도 for each문을 이용해 출력해보기
		for(char ch:c) {
			System.out.print(ch);
		}
		//arr도 for each문을 이용해 출력해보기
		for(int x:arr) {
			System.out.println(x);
		}
		
		/*[문제1]
		 * 이름을 저장할 배열을 선언,메모리할당, 초기화 단계를 거처 생성하세요
		 * 
		 * */
		String []names;
		names=new String[5]; //배열할당
		System.out.println("names[0]="+names[0]); //null
		names[0]="홍길동";
		names[1]="송영희";
		names[2]=new String("정미남"); //문자열 초기값 할당
		names[3]="박순희";
		names[4]=new String("김기동");
		
//		[문제2] for루프문 이용해 한꺼번에 출력
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		System.out.println("###############");
//		[문제3] for  each루프문 이용해 한꺼번에 출력
		for(String name:names) {
			System.out.println(name);
		}
		
	}//main

}//class
