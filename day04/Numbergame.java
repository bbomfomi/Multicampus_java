package day04;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Numbergame {
	private static JTextField tf;
	static JLabel lb = new JLabel("결과");
	static JLabel lbCnt = new JLabel("게임시도 횟수:");
	static int count=0;
	public static void main(String[] args) {
		//컴퓨터가 0<= num <100사이의 임의의 정수를 발생
		int num=(int)(Math.random()*99);		
		
		JFrame f=new JFrame("---숫자 맞추기 게임 v1.1---");
		//f.setSize(500,700);//w,h
		//f.setLocation(1200,200);//x,y
		f.setBounds(1200, 200, 500, 700);//x,y,w,h
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 165, 0));
		f.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("0~100사이의 숫자를 맞춰보세요");
		lblNewLabel.setFont(new Font("돋움", Font.BOLD, 22));
		lblNewLabel.setBounds(12, 10, 460, 109);
		panel.add(lblNewLabel);
		ImageIcon iconOk=new ImageIcon("src/day04/iconOk.png");
		ImageIcon iconNo=new ImageIcon("src/day04/iconNo.png");
		
		
		tf = new JTextField();
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//f.setTitle("이벤트처리됨");
				//tf에 입력한 값 받아오기 getText()
				String input=tf.getText();
				int myAnswer = Integer.valueOf(input);
				count++;
				if(myAnswer==num) {
					lb.setText(input+"정답!");
					lb.setIcon(iconOk);
				}else {
					String hint=(num>myAnswer)?"Higher":"Lower";
					lb.setText(input+"오답!"+hint);
					lb.setIcon(iconNo);
					tf.setText("");
				}
				
//				int myAnswer = Integer.parseInt(input);
//				if(num!=myAnswer) {
//					if(num < myAnswer) {
//						JOptionPane.showMessageDialog(null, "숫자를 낮추세요");
//					} else {
//						JOptionPane.showMessageDialog(null, "숫자를 높이세요");
//					}
//				}else {
//					JOptionPane.showMessageDialog(null, "정답입니다!");
//					return;
//				}
				//컴퓨터가 발생시킨 값과 비교하여 결과를 lb와lbCnt에 출력하기
				lbCnt.setText("게임 시도 횟수: "+count+"번");
				
			}//event
		});
		tf.setFont(new Font("굴림", Font.BOLD, 30));
		tf.setBounds(12, 162, 460, 101);
		panel.add(tf);
		tf.setColumns(10);
		
		
		lbCnt.setFont(new Font("돋움", Font.BOLD, 22));
		lbCnt.setBounds(12, 513, 460, 109);
		panel.add(lbCnt);
		
		
		lb.setFont(new Font("굴림", Font.BOLD, 35));
		lb.setIcon(new ImageIcon(Numbergame.class.getResource("/day04/Image20230904155118.png")));
		lb.setBounds(12, 308, 460, 195);
		panel.add(lb);
		f.setVisible(true);

	}
}
