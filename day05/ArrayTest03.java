package day05;

public class ArrayTest03 {

	public static void main(String[] args) {
		String[] str= {"유럽","아시아","오세아니아","아프리카","아메리카"};
		char[] alp= {'r','g','b','p','y'};
		float height[]= {160.5f,173.3f,180.8f,194.56f,165.5f};
		
		for(String GO:str) {
			System.out.println(GO);
		}
		
		for(int i=0;i<alp.length;i++) {
			System.out.print(alp[i]);
		}
		
		System.out.println();
		
		for(float h:height) {
			System.out.println(h);
		}
		
		
		

	}

}
