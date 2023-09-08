package day03;
import java.util.*;
/*
 * byte: 0
 * short: 0
 * int: 0
 * long: 0L
 * float: 0.0f
 * double: 0.0
 * boolean: false
 * char: '\u0000'
 * 참조형(클래스형): null
 * */
public class IfTest3 {
	static String global;//전역변수 ==> 디폴트값이 들어간다 null
	static double num;//0.0
	

	public static void main(String[] args) {
		// 평균점수를 이용한 학점
		/* 100 ~90 : A
		 * 89 ~ 80 : B
		 * 79 ~ 70 : C
		 * 69 ~ 80 : D
		 * 그 외: F
		 * 
		 * */
		Scanner sc=new Scanner(System.in);
		
		System.out.println("국어 점수=>");
		float kor=sc.nextFloat();
		
		System.out.println("영어 점수=>");
		float eng=sc.nextFloat();
		
		float sum=kor+eng;
		float avg=sum/2;
		char grade=' '; //지역변수(local variable)는 초기화를 한 뒤 사용해야 함
//		System.out.println(grade);
//		System.out.println(global);//null
//		System.out.println(num);//0
		
		if(avg>=80 && avg<90) {
			grade='B';
		}else if(avg>=90&& avg<=100) {
			grade='A';
		}else if(avg>=70 && avg<80) {
			grade='C';
		}else if(avg>=60 && avg <70) {
			grade='D';
		}else {
			grade='F';
		}
		
		String str="--------------------\n";
			   str+="국어\t영어\t\t\n";
			   str+="-------------------\n";
			   
			   str+=kor+"\t"+eng+"\t\t\n";
			   str+="-------------------\n";
			   str+="총  점 : "+sum+"점\n";
			   str+="평  균 : "+avg+"점\n";
			   str+="학  점 : "+grade+"\n";
			   str+="-------------------\n";
			   
			   
        System.out.println(str);
		
		//성적 테이블표 형태로 출력
		/*-------------------------
		 * 국어		영어
		 * ----------------------
		 * 85.3		92.5
		 * -----------------------
		 * 합계점수: xx 점
		 * 평균점수: 
		 * 학   점: B
		 * -----------------------
		 * */
		
		

	}

}





