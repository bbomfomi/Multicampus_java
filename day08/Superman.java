package day08;

public class Superman{
	
	String name;//이름
	int height;//키
	int power;//초능력
	
	public Superman() {
		this("슈퍼맨",150,50);
//		name="슈퍼맨";
//		height=150;
//		power=50;
	}
	
	//인자 생성자 argument constructor
	public Superman(String name, int height, int power) {
		this.name=name;
		this.height=height;
		this.power=power;
	}
	
	public Superman(String n) {
		this(n,160,150);
//		name=n;
//		height=160;
//		power=150;
	}
	public Superman(String name, int height) {
		this(name,height,200);
//		this.name=name;
//		this.height =height;
//		this.power=200;
	}
	
	public String showInfo() {
		String str="----슈퍼맨 정보----\n";
		str+="이름: "+name+"\n키: "+height+"\n초능력: "+power;
		return str;
	}//showInfo()

}
