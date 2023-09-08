package Exam_0831;
import java.util.Scanner;

public class Exam02 {

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("==== 1학기 성적 ====");
	        int sum = 0;
	        String[] classes = {"체육", "수학", "영어", "국어"};
	        for (var clas : classes) {
	            System.out.print(clas + ": ");
	            sum += sc.nextInt();
	        }
	        System.out.println("평균은 " + sum / 4 + "점 입니다.");
	    }
	

}
