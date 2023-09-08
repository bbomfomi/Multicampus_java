package day03;
import java.util.*;

public class DateTest {

	public static void main(String[] args) {
		Date date=new Date();
		
		int hh=date.getHours();//시  deprecated=>안쓰기로 한것 
		int mm=date.getMinutes();//분
		int ss=date.getSeconds();//초
		
		System.out.printf("현재 시간은 %d:%d:%d%n", hh,mm,ss);
		
		int yy=date.getYear()+1900; //1900
		int month=date.getMonth()+1;//Jan:0, Feb:1 ... Dec:11
		int dd=date.getDate();
		int dy=date.getDay();//요일  Sun:0, Mon:1,... ,Fri:5,Sat:6
		
		System.out.printf("오늘 날짜는 %d년  %d월  %d일  %d요일입니다%n", yy,month,dd,dy);
		
		//[1] month
		//28 : 2월
		//31 : 1, 3, 5, 7,8,10,12
		//30 : 4,5,9,11
		//switch ~case문 이용해서 "9월을 30일까지 있습니다"
		int days=30;
		switch(month) {
			case 2: days=28; break;
			case 4: case 5: case 9: case 11:		
				    days=30; break;
			default:
				days=31;
		}
		System.out.println(month+"월은 "+days+"일까지 있어요");

	}

}




