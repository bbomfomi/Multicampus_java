package day02;

import javax.swing.JOptionPane; 

public class Exam01 {
	public static void main(String[] args) {
		String age=JOptionPane.showInputDialog("당신의 나이는?");
		if(age==null) {
			return;//아래 문장을 실행하지 않는다
		}
		
		
		
		/*if(age==" ") {//주소값 비교
			return;
		}*/
		
		
		if(age.equals("")) {//빈문자열이라면
			System.out.println("나이를 입력하세요");
			return;
		}
		
		System.out.println(age+"세 이군요!");
		if(age.equals(age)) {
			System.out.println("내년에는"+(age+1)+"세 이겠네요");
			//문자열을 정수로 변환하는 메소드: js에는 parseInt(),parseFloat()
			int age_int=Integer.parseInt(age);
			
			System.out.printf("**내년에는 %d세 이겠네요~~",age_int+1);
		}
		
	}//main()
}//class
