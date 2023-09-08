package day07;

public class School3 {

	public static void main(String[] args) {
		Staff sf1=new Staff();
		Staff sf2=new Staff(1001,"최영","홍보부",7000);
		Staff sf3=new Staff(1002,"김미나","교육부",9000);
		
		sf1.printInfo();
		sf2.printInfo();
		sf3.printInfo();
		
//		System.out.println("총 직원수: "+sf3.getCount());
		System.out.println();
		System.out.println("총 직원수: "+Staff.getCount());
		System.out.println("총 급여: "+Staff.getTotalSal());
		System.out.println("평균 급여: "+Staff.getAvg());
		

	}

}
