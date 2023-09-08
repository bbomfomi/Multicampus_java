package day04;
import java.util.*;
//1. 인기투표 프로그램 :CLI
public class SingerVote {
	
	public static void menu() { //static 메소드 => class 메소드라고 함 => 클래스명,메소드명()
		System.out.println("----인기투표 프로그램 v1.1----");
		System.out.println("1. 아이유  2. BTS  3. 뉴진스  4. 종료");
		System.out.println("---------------------------");
		System.out.println("좋아하는 가수 번호를 입력하시오");
		System.out.println("---------------------------");
		
	}//menu

	public static void main(String[] args) {
		//SingerVote.menu(); => static이 있는 경우
		//SingerVote sv=new SingerVote(); //static이 없는 경우 객체생성
		//sv.menu();
		
		Scanner sc=new Scanner(System.in);
		int iu=0, bts=0, nj=0;
		int max=0;
		String singer="";
		while(true) {
			menu();
			int num=sc.nextInt();
			System.out.println(num);
			
			//[1] 메뉴에 없는 번호 입력 시 =>"입력오류"
			if(num<1 || num>4) {
				System.out.println("입력오류 다시 입력!");
				//return;
				continue;
			}
			else if(num==4) {
				System.out.println("투표 종료!");
				break;
			}
			//[2] 종료 처리 "총 투표 결과 보여주기"
			//[3] 그 외. 누적 카운트 구현
			System.out.println("투표 진행>>>");
			switch(num) {
			case 1: iu++; break;
			case 2: bts++; break;
			case 3: nj++; break;
			}//switch
			if(max <iu) {
				max=iu;
				singer="아이유";
			}
			if(max <bts) {
				max=bts;
				singer="BTS";
			}
			if(max <nj) {
				max=nj;
				singer="뉴진스";
			}
		}//while
		System.out.println("----투표 결과----");
		System.out.printf(" 1. 아이유: %3d표\n",iu);
		System.out.printf(" 2. BTS: %3d표\n",bts);
		System.out.printf(" 3. 뉴진스: %3d표\n",nj);
		System.out.println("-------------------");
		System.out.printf("**최다 득표 가수: %s [%3d표]**%n",singer,max);
		System.out.println("-------------------");
		
		

	}//main

}//class
