package day06;
import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyDiary {
	
	String memberInfo[]= {"root","tiger123"};
	private JTextField tfId;
	private JPasswordField tfPw;
							//ID   //PW
	MyDiarySubFrame sub=new MyDiarySubFrame();
	
	public void createGUI() {
		JFrame f= new JFrame("::나의 일기장::");
		f.setBounds(500,200,700,800);//x,y,w,h
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(138, 43, 226));
		f.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(MyDiary.class.getResource("/day06/diary.png")));
		lblNewLabel.setBounds(91, 32, 501, 325);
		panel.add(lblNewLabel);
		
		tfId = new JTextField();
		tfId.setFont(new Font("굴림", Font.BOLD, 26));
		tfId.setBounds(91, 412, 501, 56);
		panel.add(tfId);
		tfId.setColumns(10);
		tfId.setBorder(new TitledBorder("ID"));
		
		tfPw = new JPasswordField();
		tfPw.setFont(new Font("굴림", Font.BOLD, 26));
		tfPw.setBounds(91, 496, 501, 56);
		panel.add(tfPw);
		tfPw.setBorder(new TitledBorder("Password"));
		
		JButton bt1 = new JButton("");
		bt1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				f.setTitle("bt1");
				//아이디, 비밀번호 값 얻어와서, memberInfo배열에 저장된 값과 비교
				String uid=tfId.getText();
							//tfPw.getText();
				char[] ch=tfPw.getPassword();
				String upw=new String(ch);
				
				if(uid.equals("")||upw.equals("")) {
					JOptionPane.showMessageDialog(f, "아이디,비밀번호를 모두 입력하세요");
					tfId.requestFocus();
				}
				//일치하면 "환영합니다 root님~~" 메시지 다이얼로그 띄우기
				//일치하지 않으면 "아이디가 틀리거나 비밀번호가 틀립니다" 메시지 다이얼로그 띄우기
				if(uid.equals(memberInfo[0])&&upw.equals(memberInfo[1])) {
					JOptionPane.showMessageDialog(f, uid+"님 환영합니다");
				}else {
					JOptionPane.showMessageDialog(f, "아이디 또는 비밀번호가 틀렸습니다");
					return;
				}
				
				//서브 페이지 띄우기
				sub.createSubGUI();
				
				//로그인 프레임 닫기
				f.setVisible(false);
				f.dispose();
			}
		});
		bt1.setMnemonic('L');
		bt1.setIcon(new ImageIcon(MyDiary.class.getResource("/day06/boolun.png")));
		bt1.setBounds(118, 607, 210, 126);
		panel.add(bt1);
		
		JButton bt2 = new JButton("");
		bt2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				f.setTitle("bt2");
				//tfId, tfPw 값 비워주기
				tfId.setText("");
				tfPw.setText("");
				//tfId에 입력 포커스 주기
				tfId.requestFocus();
			}
		});
		bt2.setMnemonic('R');
		bt2.setIcon(new ImageIcon(MyDiary.class.getResource("/day06/reset.png")));
		bt2.setBounds(354, 607, 210, 126);
		panel.add(bt2);
		f.setVisible(true);
	}//createGUI

	public static void main(String[] args) {
		//createGUI 호출하기
		
		MyDiary my = new MyDiary();
		my.createGUI();

	}//main
}//class
