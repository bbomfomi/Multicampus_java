package day07;
/* java.io패키지
 * 파일 입출력 스트림
 * - 파일에 쓰기: FileOutputStream(1byte기반), FileWriter (char기반-2byte기반)
 * 				System.out
 * - 파일 읽기: FileInputStream(1byte기반), FileReader (char기반-2byte기반)
 * 				System.in
 * 
 * */
import java.io.*;
import java.util.*;
public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("일기장에 쓸 내용을 입력하세요=>");
		String line=sc.nextLine();//개행문자("\n)를 만나기 전의 문자열을 반환한다
		System.out.println(line);
		
		//java.io.FileWriter 메소드
		//public void write(String str,int off,int len)throws IOException
		FileWriter fw=new FileWriter("20230907.txt",true);//파일명, append여부=> 파일에 쓸 준비함
		//fw.write(line+"\n", 0, line.length());
		fw.write(line+"\n");
		
		fw.close();
		System.out.println("파일에 쓰기 완료!");
		
		
		
	}//main

}
