package day06;

public class MyDemoTest {

	public static void main(String[] args) {
		
		// [1]MyDemo의 showSnail()호출해보기
		MyDemo.showSnail();
		
		// [2]MyDemo의 showStar()호출해보기
		MyDemo star = new MyDemo();
		star.showStar();

		//java.lang.Math pow() 메소드 찾아서 호출하기
		//7의 3승값을 출력하기
		//static double pow(double a, double b)
		
		double x=Math.pow(7, 3);
		System.out.println("7의 3승: "+(int)x);
		
		//java.lang.String 클래스의 split() 호출하기
		//String[] split(String regex)
		String str="Java#JSP#Spring#Android";
		
		String str2=new String("Oracle#MySQL#Infomix@SQLServer");
		
		
		//str을 '#'기준으로 쪼개서 배열로 반환받고, 해당 배열을 for each문 이용해 출력해보기
		String[] arr=str2.split("@");
		
		for(String s:arr) {
			System.out.println(s);
		}
		
		MyDemo.showShape('별', 3);
		MyDemo.showShape('힝', 10);
		MyDemo.showShape('$', 20);
		
		MyDemo grt=new MyDemo();
		grt.greeting("안녕하세요", "멀티캠");
		
		grt.greetingmany("반가워요","수지","영희","민철");
		grt.greetingmany("잘가세요~", "다니엘","제인","피터","존","아서","로버트");
		
		//YourDemo의 add()
		//			multi()
		//			div()
		
		YourDemo yd = new YourDemo();
		int res=yd.add(111, 222);
		System.out.println(res);
		
		
		//double res2=yd.multi(3.12, 5,78f)
		float res2=(float)yd.multi(3.12, 5.78f);
		System.out.println(res2);
		
		
		float res3=YourDemo.div(10L, (short)2);
		System.out.println(res3);
		YourDemo.div((long)8, (short)2);
		
		
		
		
	}//main

}
