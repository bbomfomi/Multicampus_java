package day03;
import javax.swing.*;
public class SwitchTest {

	public static void main(String[] args) {
		/*
		 *  switch문에 들어갈 수 있는 자료형은
		 *   - int형 이하 (byte,short,char,int) [o]
		 *   - String [o]
		 *   
		 *   - long,float, double [x]
		 *   
		 *  switch(변수 | 수식){
		 *  	case 값1: 실행문; break;
		 *  	case 값2: 실행문; break;
		 *  	...
		 *  	default: 실행문;
		 *  }
		 * 
		 * */
		//80,81,82,...89 :
		
		
		int avg=Integer.parseInt(JOptionPane.showInputDialog("평균점수 입력: "));
		char grade=' ';
		switch(avg/10) {
			case 8: grade='B';break;
			case 10: 
			case 9: grade='A';break;
			
			case 7: grade='C';break;
			case 6: grade='D';break;
			default: grade='F';
		}
		System.out.println("학점: "+grade);

	}

}






