package day08;
/*this  : static메서드에서는 사용 불가
 * this.변수
 * this.메서드()
 * this() : 자기자신의 생성자를 호출
 * 	==> 생성자 안에서만 호출 가능
 * 		생성자 첫번째 줄에 위치해야 함
 * 
 * */
public class Aquaman{
	
	String name;//이름
	int height;//키
	double speed;//초능력
	
//	public Aquaman(String name, int height, double speed) {
//		this.name=name;
//		this.height=height;
//		this.speed=speed;
//	}
	
	public Aquaman(String name) {
		this(name,190);
		speed=200;
//		this.name=name;
//		height=190;
//		speed=200;
	}
	public Aquaman(double speed) {
		this("최멀티",190);
//		name="최멀티";
//		height=190;
		this.speed=speed;
	}
	
	public Aquaman(String n, int h) {
		name=n;
		height=h;
		speed=180;
	}
	
	public Aquaman(String n, int h, double s) {
		this(h,s,n);
	}
	
	public Aquaman(int h, double s, String n) {
		name=n; height=h; speed=s;
	}
	public String showInfo() {
		String str="----아쿠아맨 정보----\n";
		str+="이름: "+name+"\n키: "+height+"\n초능력: "+speed;
		return str;
	}//showInfo()
}
