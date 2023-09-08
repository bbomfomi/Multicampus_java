package day06;
//has a : 속성 2개~3개
//메소드 : 3개
public class TV {
	int size;
	String color;
	int width;
	int height;
	String manufacture;
	int channel;
	boolean state;
	
	static String wifi="KT";
	//static=> 망치 => 객체들마다 공유한다
	
	public void changeChannel(int ch) {
		channel=ch;
	}
	public void powerOn() {
		state=true;
	}
	public void powerOff() {
		state=false;
	}
	
	public String info() {
		String str="---TV정보---\n";
		str+="크기: "+size+"인치\n";
		str+="색상: "+color+"\n";
		str+="와이파이: "+wifi+"\n";
		return str;
		
	}
	
	public void tvInfo() {
		System.out.println("-----TV정보-----");
		System.out.println("가로폭: "+width+"mm");
		System.out.println("높이: "+height+"mm");
		System.out.println("제조사: "+manufacture);
	}
	
	
}
