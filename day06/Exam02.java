package day06;

public class Exam02 {

	public static void main(String[] args) {
		String[] cls= {"국어","영어","수학","컴퓨터","화학"};
		int[] scoF= {44,66,22,99,100};
		int[] scoS= scoF.clone();
		
		scoS[0]=22;
		scoS[2]=88;
		System.out.println("-----1학기-----");
		for(int i=0;i<scoF.length;i++) {
			System.out.println(cls[i]+": "+scoF[i]);
		}

		System.out.println("-----2학기-----");
		for(int i=0;i<scoF.length;i++) {
			System.out.println(cls[i]+": "+scoS[i]);
		}
		
		int count=0;
		int count2=0;
		int index=0;
		for(int i=0;i<scoF.length;i++) {
			int score1=scoF[i];
			int score2=scoS[i];
			
			if(score1==score2) {
				count++;
			}else if(score2 > score1) {
				count2++;
				index=i;
			}
		}//for
		
		System.out.println("성적이 변동 없는 과목수: "+count+"개");
		System.out.println("2학기에 성적이 오른 과목수: "+count2+"개");
		System.out.println("2학기에 성적이 오른 과목: "+cls[index]);
		
	}//main

}
