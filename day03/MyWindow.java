package day03;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class MyWindow {

	public static void main(String[] args) {

		JFrame f=new JFrame("::MyWindow::");  //Container
		f.setSize(800,800);//폭, 높이
		
		JButton btnNewButton = new JButton("North");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "까꿍~~");
			}
		});
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("West");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=JOptionPane.showInputDialog("당신은 누구입니까?");
				if(name==null||name.equals("")) {
					f.setTitle("이름 입력해야 해요");
					return;
				}
				f.setTitle(name+"님 입장!!");
				
			}
		});
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("East");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int yn=JOptionPane.showConfirmDialog(f, "프로그램을 종료할까요?");
				f.setTitle("yn="+yn);
				//예: 0, 아니오:1, 취소:2
				if(yn==0) {
					//시스템 종료
					System.exit(0);//정상종료
				}
				
			}
		});
		f.getContentPane().add(btnNewButton_2, BorderLayout.EAST);
		
		JButton btnNewButton_3 = new JButton("South");
		f.getContentPane().add(btnNewButton_3, BorderLayout.SOUTH);
		
		JButton btnNewButton_4 = new JButton("Center");
		
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "Welcome to Application~~");
			}
		});
		
		f.getContentPane().add(btnNewButton_4, BorderLayout.CENTER);
		f.setVisible(true);//
	}

}
