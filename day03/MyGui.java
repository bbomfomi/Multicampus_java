package day03;
import javax.swing.*;

//CLI  : Command Line Interface
//GUI  : Graphic User Interface => java.awt, javax.swing, JavaFx
public class MyGui {

	public static void main(String[] args) {
		JFrame f=new JFrame();  //Container
		f.setSize(500,500);//폭, 높이
		f.setVisible(true);//
		
		JButton bt=new JButton("회원가입");//Component(부품)
		
		f.getContentPane().add(bt);
	}

}
