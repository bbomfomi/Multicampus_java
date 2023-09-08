package CalcExample;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.net.URL;

public class CalcExample {
    private static JTextField jText1;
    private static JTextField jText2;
    private static JTextField jResult;

    public static void main(String[] args) throws Exception {


        JFrame f=new JFrame("::MyCalc v1.0::");

        f.setSize(500,750);

        JPanel panel = new JPanel();
        panel.setBackground(Color.pink);
        panel.setForeground(Color.BLACK);
        f.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(null);

        URL url = new URL("https://ik.imagekit.io/serenity/ByteofDev/Blog_Content_Images/deno_city");
        BufferedImage image = ImageIO.read(url);

        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon(image));
        lblNewLabel.setBounds(12, 10, 460, 336);
        panel.add(lblNewLabel);

        jText1 = new JTextField();
        jText1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

            }
        });
        jText1.setFont(new Font("Pretendard", Font.PLAIN, 24));
        jText1.setBounds(205, 370, 243, 50);
        panel.add(jText1);
        jText1.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("Integer 1");
        lblNewLabel_1.setFont(new Font("Pretendard", Font.PLAIN, 24));
        lblNewLabel_1.setBounds(77, 370, 116, 50);
        panel.add(lblNewLabel_1);

        JLabel lblNewLabel_1_1 = new JLabel("Integer 2");
        lblNewLabel_1_1.setFont(new Font("Pretendard", Font.PLAIN, 24));
        lblNewLabel_1_1.setBounds(77, 447, 116, 50);
        panel.add(lblNewLabel_1_1);

        jText2 = new JTextField();
        jText2.setFont(new Font("Pretendard", Font.PLAIN, 24));
        jText2.setColumns(10);
        jText2.setBounds(205, 447, 243, 50);
        panel.add(jText2);

        JButton btn1 = new JButton("+");
        btn1.addActionListener(e -> {
            String str1=jText1.getText();
            String str2=jText2.getText();
            float a = Float.valueOf(str1);
            float b = Float.valueOf(str2);
            double c = 0;

            c=a+b;

            String res=String.valueOf(c);
            jResult.setText(res);
        });
        btn1.setFont(new Font("굴림", Font.PLAIN, 24));
        btn1.setBounds(55, 526, 71, 60);
        panel.add(btn1);

        JButton btn2 = new JButton("-");
        btn2.addActionListener(e -> {
            String str1=jText1.getText();
            String str2=jText2.getText();
            float a = Float.valueOf(str1);
            float b = Float.valueOf(str2);
            double c = 0;
            c=a-b;

            String res=String.valueOf(c);
            jResult.setText(res);
        });
        btn2.setFont(new Font("굴림", Font.PLAIN, 24));
        btn2.setBounds(159, 526, 71, 60);
        panel.add(btn2);

        JButton btn4 = new JButton("/");
        btn4.addActionListener(e -> {
            String str1=jText1.getText();
            String str2=jText2.getText();
            float a = Float.valueOf(str1);
            float b = Float.valueOf(str2);
            double c = 0;
            c=a/b;

            String res=String.valueOf(c);
            jResult.setText(res);
        });
        btn4.setFont(new Font("굴림", Font.PLAIN, 24));
        btn4.setBounds(377, 526, 71, 60);
        panel.add(btn4);

        JButton btn3 = new JButton("*");
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str1=jText1.getText();
                String str2=jText2.getText();
                float a = Float.valueOf(str1);
                float b = Float.valueOf(str2);
                double c = 0;
                c=a*b;

                String res=String.valueOf(c);
                jResult.setText(res);
            }
        });
        btn3.setFont(new Font("Pretendard", Font.PLAIN, 24));
        btn3.setBounds(267, 526, 71, 60);
        panel.add(btn3);

        jResult = new JTextField();
        jResult.setText("결과");
        jResult.setFont(new Font("Pretendard", Font.BOLD, 30));
        jResult.setBounds(55, 610, 393, 91);
        panel.add(jResult);
        jResult.setColumns(10);
        f.setVisible(true);


    }


}