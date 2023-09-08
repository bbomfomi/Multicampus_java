package day06;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.io.*;

public class MyDiarySubFrame {
	private JTextField tfDate;
	private JTextField tfTitle;
	JFrame f=new JFrame();
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void createSubGUI() {
		f.setSize(800,800);
		f.setLocation(500,200);
		
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
		taContent.setFont(new Font("굴림", Font.BOLD,24));
		
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
		
		btSave.addActionListener(e->{
			
			//f.setTitle("파일저장예정");
			try {
			//날짜값 가져오기 => 파일명으로 활용 "20230908.txt"
			String date=tfDate.getText();
			//제목 가져오기
			String title=tfTitle.getText();
			//일기 내용 가져오기
			String content=taContent.getText();
			
			if(date==null||date.equals("")) {
				JOptionPane.showMessageDialog(f, "날짜를 입력해야해요(yyyymmdd)");
				tfDate.requestFocus();
				return;
			}
			String fileName="C:\\Users\\djccb\\Desktop\\Workplace\\multicamp\\JavaWorkspace\\Begin\\src\\"+date+".txt";
			
			//FileWriter객체 생성하기
			FileWriter fw=new FileWriter(fileName);
			//파일에 제목과 일기내용 저장하기 =>write()사용
			fw.write("작성일: "+date+"\n");
			fw.write("제 목: "+title+"\n");
			fw.write("\n");
			fw.write(content+"\n");
			fw.flush();
			
			//FileWriter close()호출하기
			fw.close();
			f.setTitle(fileName+"저장 완료!!");
			}catch(IOException ex) {
				f.setTitle("파일 입출력 에러발생: "+ex);
			}
		});
		
		btRead.addActionListener(e->{
			f.setTitle("읽어올예정");
		});
		
		f.setVisible(true);
	}
	/*
	public static void main(String[] args) {
		MyDiarySubFrame sub=new MyDiarySubFrame();
		sub.createSubGUI();
	}
	*/
}
