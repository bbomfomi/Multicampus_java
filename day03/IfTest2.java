package day03;
import java.util.*;

public class IfTest2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("2자리 정수를 입력하세요=>");
		int num=sc.nextInt();
		System.out.println("num: "+num);
		
		//유효성체크 입력값이 2자리가 아닐 경우 "입력오류!! 2자리 정수를 입력해야 해요"
		if(num<10||num>99) {
			System.out.println("입력오류!! 2자리 정수를 입력해야 해요");
			return;
		}
		
		//입력값이
		//11 22 33 44 55 ....
		//==> "OK 10의 자리와 1의 자리가 같아요"
		if(num%11==0) {
			System.out.println("OK 10의 자리와 1의 자리가 같아요");
		}else {
			System.out.println("NO  10의 자리와 1의 자리가 달라요");
		}
		//그렇지 않다면 "NO  10의 자리와 1의 자리가 달라요"
		
		int n1=num/10;
		int n2=num%10;
		if(n1==n2){
			System.out.println("OK 10의 자리와 1의 자리가 같아요");
		}else {
			System.out.println("NO  10의 자리와 1의 자리가 달라요");
		}
		
		
		//3항 연산자를 이용해서 출력해보세요  변수=(조건식)? 값1: 값2;
		String str=(num%11==0)? "OK 10의 자리와 1의 자리가 같아요***":"NO  10의 자리와 1의 자리가 달라요###";
		System.out.println(str);
		
		
		System.out.println((n1==n2)?"OK 같아요$$$":"NO &&&");//1회용
		
		System.out.println(str.toLowerCase());
		
		sc.close();
	}

}








