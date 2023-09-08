package day08.inheritance;

public class Inheritance {

	public static void main(String[] args) {
		// Human객체 생성해서 이름, 키값 주고 showInfo()호출하기
		Human h=new Human();
		h.name="홍길동";
		h.height=166;
		
		h.showInfo();

		// Superman객체 생성해서 이름, 키, 초능력 값 주고 showInfo()호출하기
		Superman s1=new Superman("김슈퍼",177,500);
		s1.showInfo();
	}

}
