package day08;

public class Cafe {

	public static void main(String[] args) {
		CoffeeMachine cm=new CoffeeMachine(); 
		
		//1. 밀크 커피 내오기
		cm.makeTea(2,1,3);
		
		//2. 설탕 커피 내오기
		cm.makeTea(2, 4);
		
		//3. 블랙 커피 내오기
		String s =cm.makeTea(1);
		System.out.println(s);
		
		//4. 크림 커피 내오기
		cm.makeTea(1,2L);
		
		cm.makeTea(3L,2);
		
		Yuja yj=new Yuja();
		yj.setYuja(2);
		yj.setSugar(2);
		
		
		String s2=cm.makeTea(yj);
		System.out.println(s2);

	}

}
