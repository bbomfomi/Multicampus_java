package day03;

import java.util.*;

public class IfTest {

	public static void main(String[] args) 
	throws Exception
	{
		System.out.println("이름 입력: ");
		/*int n=System.in.read();
		System.out.println("n: "+n);
		System.out.println("n: "+(char)n);*/
		
		Scanner sc=new Scanner(System.in);
		String name=sc.next();//문자열 입력을 받음
		System.out.println("Name: "+name);
		
		System.out.println("생년 입력: ");
		int age=sc.nextInt();//정수 입력 , nextFloat(), nextDouble(), nextBoolean()
		System.out.println(age+"년에 태어났군요~");
		
		/*   if(조건식){
		 * 			실행문;
		 * 	 }
		 *   실행문2;
		 * */
		//(): 소괄호
		//{}: 중괄호
		//[]: 대괄호
		
		//생년이 짝수이면 "짝수년도에 태어났군요"
		//     홀수 "홀수 년도에 태어났군요"  if ~ else
		if(age%2==0) {
			System.out.println("짝수 년도에 태어났군요^^");
			System.out.println("###################");
		}else {
			System.out.println("홀수 년도에 태어났군요!!");
			System.out.println("@@@@@@@@@@@@@@@@@@@");
		}
		System.out.println("*** The End ***********");
		
	}

}

























