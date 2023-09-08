package day03;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyCalc {
	private static JTextField tf1;
	private static JTextField tf2;
	private static JTextField tfResult;

	public static void main(String[] args) {
		JFrame f=new JFrame("::MyCalc v1.0::");
		f.setSize(500,1000);
		f.setLocation(1200,200);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(224, 255, 255));
		f.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\multicampus\\JavaWorkspace\\Begin\\img\\calc.png"));
		lblNewLabel.setBounds(12, 20, 462, 401);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자1");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 36));
		lblNewLabel_1.setBounds(22, 455, 153, 63);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("숫자2");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 36));
		lblNewLabel_1_1.setBounds(22, 568, 153, 63);
		panel.add(lblNewLabel_1_1);
		
		tf1 = new JTextField();
		tf1.setFont(new Font("굴림", Font.BOLD, 36));
		tf1.setBounds(216, 443, 241, 73);
		panel.add(tf1);
		tf1.setColumns(10);
		
		tf2 = new JTextField();
		tf2.setFont(new Font("굴림", Font.BOLD, 36));
		tf2.setColumns(10);
		tf2.setBounds(216, 563, 241, 73);
		panel.add(tf2);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 36));
		btnNewButton.setBounds(22, 686, 95, 73);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 36));
		btnNewButton_1.setBounds(140, 686, 95, 73);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("*");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 36));
		btnNewButton_2.setBounds(264, 686, 95, 73);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.setFont(new Font("굴림", Font.BOLD, 36));
		btnNewButton_3.setBounds(379, 686, 95, 73);
		panel.add(btnNewButton_3);
		
		tfResult = new JTextField();
		tfResult.setText("여기에 결과 출력");
		tfResult.setFont(new Font("굴림", Font.BOLD, 36));
		tfResult.setBounds(35, 818, 404, 95);
		panel.add(tfResult);
		tfResult.setColumns(10);
		f.setVisible(true);
	}

}
