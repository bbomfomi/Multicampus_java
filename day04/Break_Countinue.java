package day04;
/* 보조제어문: break, continue
 *  break;
 *  continue;
 * 	break 레이블명;
 *  continue 레이블명;
 * */
public class Break_Countinue {

	public static void main(String[] args) {
		System.out.println("1.------------");
		// i=0만 출력
		for(int i=0;i<3;i++) {
			if(i==1)break; //반복문 벗어남
			System.out.println("i: "+i);
		}
		
		System.out.println("2.------------");
		// i=0 i=2 출력
		for(int i=0;i<3;i++) {
			if(i==1)continue; //조건에 부합하면 아래 문장을 실행하지 않고 반복문을 계속 수행
			System.out.println("i: "+i);
		}
		
		System.out.println("3.------------");
		for(int i=0;i<3;i++) {
			for(int k=0; k<3;k++) {
				if(k==1) break;
				System.out.printf("i=%d, k=%d%n",i,k);
			}
		}
		
		System.out.println("4.------------");
		for(int i=0;i<3;i++) {
			for(int k=0; k<3;k++) {
				if(k==1) continue;
				System.out.printf("i=%d, k=%d%n",i,k);
			}
		}
		
		System.out.println("5.------------");
		out://반복문 앞에 붙이는 label
		for(int i=0;i<3;i++) {
			inner:
			for(int k=0; k<3;k++) {
				if(k==1) break out;//label 지정==> 레이블과 가까운 반복문을 이탈
				System.out.printf("i=%d, k=%d%n",i,k);
			}
		}
		
		System.out.println("6.------------");
		out://반복문 앞에 붙이는 label
		for(int i=0;i<3;i++) {
			inner:
			for(int k=0; k<3;k++) {
				if(k==1) continue out;//label 지정==> 레이블과 가까운 반복문을 계속 수행
				System.out.printf("i=%d, k=%d%n",i,k);//
			}
		}
		
	}//main

}//class
