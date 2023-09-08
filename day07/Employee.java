package day07;

public class Employee {

	//has a 관계
	int no; //사번
	String name; //사원명
	String dept; //소속 부서
	double salary; //급여
	
	//default constructor
	public Employee() {
		no=1;
		name="아무개";
		dept="인사부";
		salary=5000;
	}
	
	//인자 생성자
	public Employee(int n, String nm, String dp, double sal) {
		no=n;
		name=nm;
		dept=dp;
		salary=sal;
	}
	
	public void printInfo() {
		System.out.println("-----사원 정보-----");
		System.out.println("No; "+no);
		System.out.println("Name: "+name);
		System.out.println("Dept: "+dept);
		System.out.println("Salary: "+salary);
		System.out.println();
		
	}//printInfo
	
}//class
