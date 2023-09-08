package day06;
//메소드(method), function: 기능
/* [1] 인스턴스 메소드: non-static "객체명.메소드()"
 * [2] 클래스 메소드 : static "클래스명.메소드()"
 * 
 * 
 * */

public class MyDemo {
	//매개변수x, 반환값x
	public void showStar() { //instance method
		System.out.println("★★★★");
	}
	
	public static void showSnail() { //class method
		System.out.println("@@@@");
	}
	
	//매개변수o, 반환값x
	public static void showShape(char ch, int cnt) {
		for(int i=0; i<cnt;i++) {
			System.out.print(ch);
		}
		System.out.println();
	}
	
	public void greeting(String term, String name) {
		System.out.println(term+" "+name+"님~");
	}
	
	//String ... names: 호출하는 쪽에서 넣는 만큼 names로 받는다
	//names=>String 타입의 배열
	public void greetingmany(String term, String ... names ) {
		System.out.print(term+" ");
		
		//System.out.print(names);
		for(String name:names) {
			System.out.print(name+"님~");
		}
		System.out.println();
	}

}//class
