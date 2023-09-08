package day06;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

public class MyDiarySubFrame {
	private JTextField tfDate;
	private JTextField tfTitle;
	JFrame f=new JFrame();
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void createSubGUI() {
		f.setSize(800,800);
		f.setLocation(1000,200);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 0));
		f.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		tfDate = new JTextField();
		tfDate.setFont(new Font("굴림", Font.BOLD, 20));
		tfDate.setBounds(46, 64, 696, 82);
		panel.add(tfDate);
		tfDate.setColumns(10);
		
		tfTitle = new JTextField();
		tfTitle.setFont(new Font("굴림", Font.BOLD, 20));
		tfTitle.setColumns(10);
		tfTitle.setBounds(46, 186, 696, 82);
		panel.add(tfTitle);
		
		JTextArea taContent = new JTextArea();
		taContent.setBounds(46, 310, 696, 342);
		panel.add(taContent);
		
		JButton btSave = new JButton("파일에 저장");
		btSave.setBackground(new Color(0, 255, 0));
		btSave.setFont(new Font("굴림", Font.BOLD, 24));
		btSave.setBounds(46, 681, 342, 59);
		panel.add(btSave);
		
		JButton btRead = new JButton("일기 가져오기");
		btRead.setBackground(new Color(0, 255, 0));
		btRead.setFont(new Font("굴림", Font.BOLD, 24));
		btRead.setBounds(422, 681, 320, 59);
		panel.add(btRead);
		
		tfDate.setBorder(new TitledBorder("오늘 날짜"));
		tfTitle.setBorder(new TitledBorder("제   목"));
		taContent.setBorder(new TitledBorder("일기 내용"));
		f.setVisible(true);
	}
	/*
	public static void main(String[] args) {
		MyDiarySubFrame sub=new MyDiarySubFrame();
		sub.createSubGUI();
	}
	*/
}
