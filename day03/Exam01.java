package day03;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exam01 {
	private static JTextField tf1;
	private static JTextField tf2;
	private static JTextField tfKor;
	private static JTextField tfMath;

	public static void main(String[] args) {
		JFrame f=new JFrame("::Exam01::");
		f.setSize(700,900);//w,h
		f.setLocation(1200,100);//x,y
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 228, 196));
		f.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(208, 128, 5, 24);
		panel.add(textArea);
		
		JLabel lblEkdtlsdmlSkdlsms = new JLabel("당신의 나이는");
		lblEkdtlsdmlSkdlsms.setBounds(31, 328, 253, 76);
		lblEkdtlsdmlSkdlsms.setFont(new Font("휴먼편지체", Font.BOLD, 26));
		panel.add(lblEkdtlsdmlSkdlsms);
		
		JLabel lblNewLabel_2 = new JLabel("국어 점수");
		lblNewLabel_2.setBounds(31, 539, 253, 76);
		lblNewLabel_2.setFont(new Font("휴먼편지체", Font.BOLD, 26));
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("수학 점수");
		lblNewLabel_3.setBounds(31, 652, 253, 76);
		lblNewLabel_3.setFont(new Font("휴먼편지체", Font.BOLD, 26));
		panel.add(lblNewLabel_3);
		
		tf1 = new JTextField();
		tf1.setFont(new Font("굴림", Font.BOLD, 24));
		tf1.setBounds(296, 97, 323, 85);//w,h,x,y
		panel.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setFont(new Font("굴림", Font.BOLD, 24));
		tf2.setBounds(296, 314, 323, 85);
		tf2.setColumns(10);
		panel.add(tf2);
		
		tfKor = new JTextField();
		tfKor.setFont(new Font("굴림", Font.BOLD, 24));
		tfKor.setBounds(296, 525, 323, 85);
		tfKor.setColumns(10);
		panel.add(tfKor);
		
		tfMath = new JTextField();
		tfMath.setFont(new Font("굴림", Font.BOLD, 24));
		tfMath.setBounds(296, 659, 323, 85);
		tfMath.setColumns(10);
		panel.add(tfMath);
		
		JButton btnNewButton = new JButton("어디로 갈까요?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//tf1에 입력한 값을 얻어온다==> String  getText()
				String input=tf1.getText();
				f.setTitle("input: "+input);				
				String where="";
				if(input.equals("커피")) {
					where="카페로 갈게요~~";
				}else if(input.equals("아이스크림")) {
					where="베스킨라빈스로 갈게요~~";
				}else {
					where="물을 드세요~~";
				}
				JOptionPane.showMessageDialog(f,where);
				
				//커피 ==>"카페로 갈게요" ==> 
				//아이스크림 ==>"베스킨라빈스로 갈게요"
				//그 외==>"물을 드세요"
				
				
			}
		});
		btnNewButton.setBounds(52, 205, 555, 76);
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("나의 내년 나이는?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ageStr=tf2.getText();
				
				if(ageStr==null||ageStr.equals("")) {
					JOptionPane.showMessageDialog(f, "나이를 입력해야 해요");
					tf2.requestFocus();//입력 포커스 주기
					return;
				}
				int age=Integer.parseInt(ageStr);
				JOptionPane.showMessageDialog(f,"내년에는 "+(age+1)+"세 이겠네요~");
			}
		});
		btnNewButton_1.setBounds(52, 414, 555, 76);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("두 과목의 평균점수는?");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str1=tfKor.getText();
				String str2=tfMath.getText();
				
				if(str1==null||str1.equals("")) {
					showMsg("국어 점수를 입력하세요");
					tfKor.requestFocus();
					return;
				}
				if(str2==null||str2.equals("")) {
					showMsg("수학 점수를 입력하세요");
					tfMath.requestFocus();
					return;
				}
				float kor=Float.parseFloat(str1);
				float math=Float.parseFloat(str2);
				float avg=(kor+math)/2;
				String avgStr=String.format("%.1f", avg);
				showMsg("평균 점수는 "+avgStr+"점 입니다");
			}
		});
		btnNewButton_2.setBounds(52, 765, 555, 76);
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 20));
		panel.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("먹고 싶은 음식은?");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 26));
		lblNewLabel.setBounds(31, 107, 219, 76);
		panel.add(lblNewLabel);
		f.setVisible(true);

	}//main()----------------------
	
	public static void showMsg(String msg) {
		JOptionPane.showMessageDialog(null, msg);
	}
	
	
}//class///////////////////
