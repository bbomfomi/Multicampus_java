package day07;

public class School2 {

	public static void main(String[] args) {
		Teacher t1=new Teacher();
		t1.printInfo();
		
		
		t1.setNo(5);
		t1.setName("김멀티");
		t1.setSubject("과학");
		t1.setGender('M');
		
		t1.printInfo();
		String n=t1.getName();
		System.out.println(n);
		
		Teacher t2=new Teacher();
		t2.setNo(10);
		t2.setName("최멀티");
		t2.setSubject("파이썬");
		t2.setGender('F');
		
		t2.printInfo();
		
		

		//[1] t1, t2를 저장할 배열을 선언하고, 메모리 할당한 뒤 초기화하세요
		Teacher arr[]=new Teacher[2];
		System.out.println("arr[0]="+arr[0]);
		
		arr[0]=t1;
		arr[1]=t2;
		//[2] for루프 이용해서 배열에 저장된 교사들의 정보를 출력하세요
		System.out.println("*********************");
		for(int i=0;i<arr.length;i++) {
			arr[i].printInfo();
//			System.out.println(arr[i]); 주소값
		}
		
	}//main

}
