package day03;
/*
 * 반복문
 * 1) for루프
 * 2) while루프
 * 3) do ~while루프
 * */
public class ForTest {

	public static void main(String[] args) {
		/*
		 * for(변수선언문;조건식;증감식){
		 * 		실행문;
		 * }
		 * 
		 * for(;;){} ===>무한루프
		 * */
		for(int i=1;i<6;i++) {
			System.out.println("Hello : "+i);
		}
		System.out.println("*********"); //i의 scope는 for블럭까지
		
		int j=10;//j의 scope는?===> main()블럭까지 살아있다
		for(;j>5;j--) {
			System.out.println("Java: "+j);
		}
		System.out.println("@@@@@@@"+j);
		
		
		
	}

}
