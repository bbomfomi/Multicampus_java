package day04;
import java.util.*;

public class While_test02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("구구단 몇단을 할까요?");
		int dan=sc.nextInt();
		
		//[1] while문을 이용해서 해당하는 구구단 식을 출력하세요
		int num=1;
		while(num<10) {
			System.out.println(dan+" x "+num+ " = " +(dan*num));
			num++;
			if(num>9) break;
		}
		
		
		//[2] while문을 중첩하여 구구단 전체를 테이블형태로 출력하세요
		/*
		 * 2x1=2	3x1=3	4x1=4		.....	9x1=9
		 * 2x2=4	3x2=6 .....
		 * 
		 * 2x9=18	3x9=27
		 * */
		
		int x=1;
		while (x<=9) {
			int y=2;
			while (y<=9) {
				int z=x*y;
				System.out.printf("%d x %d = %2d\t", y,x,z);
				y++;
			}
			System.out.println();
			x++;
		}
		System.out.println("The end");
		sc.close();

	}//main

}//class
