package day06;

public class MyRoom {

	public static void main(String[] args) {
		// TV객체 생성해서 속성값 부여하고 메소드 호출하기
		
		TV tv=new TV();
		tv.width=400;
		tv.height=500;
		tv.manufacture="멀티캠";
		
		tv.tvInfo();
		
		TV tv2=new TV();
		System.out.println(tv2.info());
		tv.color="white";
		tv.size=72;
		tv.channel=7;
		
		tv2.color="gray";
		tv2.size=50;
		tv2.channel=11;
		
		System.out.println(tv.info());//1회용
		
		String str=tv2.info();//str => 재사용 가능
		System.out.println(str);
		
		//tv의 채널 22로 변경
		tv.changeChannel(22);
		System.out.println(tv.channel);
		System.out.println(tv.state);
		tv.powerOn();
		System.out.println(tv.state);
		//tv 전원 켜기
		tv2.wifi="SK"; //static변수 => 객체들마다 공유한다
		System.out.println(tv2.info());
		System.out.println(tv.info());
		
		

	}

}
