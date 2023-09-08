package day04;

public class ForTest {
	public static void main(String[] args) {
		/* [1]
		 * 		*****\n
		 * 		*****\n
		 * 		*****\n
		 * 		*****\n
		 * 
		 * 4행 5열
		 * 
		 * */
		for(int k=0; k<4; k++) {
			for(int i=0;i<5;i++) {
				System.out.print("*");			
			}//for---
			System.out.println();
		}//for--------
		
		/* [2]
		 * 
		 * *
		 * **
		 * ***
		 * ****
		 * 
		 * */
		System.out.println("[2]------");
		for(int i=1;i<=4;i++) {
			for(int k=1; k<=4; k++) {
				if(i-k>=0)
					System.out.print("*");
				else
					System.out.print(" ");
			}//for
			System.out.println();
		}//for
		
		/*[3]
		 * 
		 *    *
		 *   **
		 *  ***
		 * ****     
		 * 
		 * (0,0)(0,1)(0,2)(0,3)
		 * (1,0)(1,1)(1,2)(1,3)
		 * (2,0)(2,1)(2,2)(2,3)
		 * (3,0)(3,1)(3,2)(3,3)
		 * */
		System.out.println("[3]-------");
		
		for(int i=0;i<4;i++) {
			for(int k=0;k<4;k++) {
				if(i+k>=3)
					System.out.print("*");
				else
					System.out.print(" ");
			}//for
			System.out.println();
		}//for
		
		/* [4]
		 *    *
		 *   ***
		 *  *****  
		 * 
		 * (0,0)(0,1)(0,2)(0,3)(0,4)
		 * (1,0)(1,1)(1,2)(1,3)(1,4)
		 * (2,0)(2,1)(2,2)(2,3)(2,4)
		 * */
		System.out.println("[4]-------");
		
		for(int i=0;i<3;i++) {
			for(int k=0;k<=4;k++) {
				if(i+k>=2 && k-i<=2)
					System.out.print("*");
				else
					System.out.print(" ");
			}//for
			System.out.println();
		}//for
		
		System.out.println("The end");
	}
	
	//무한루프 for(;;){}
//	for(;;) {
//		System.out.println("@@@@");
//	}
	
}
