package day15;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonEx1 extends JFrame {
	
	private static final ActionListener ActionEvent = null;

	public ButtonEx1() {		
		setTitle("첫번째 화면");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("첫번째 버튼!");
		JButton btn2 = new JButton("두번째 버튼!");
		JButton btn3 = new JButton("세번째 버튼!");
		
		c.add(btn1);
		btn1.setBackground(new Color(186,27,39));
		btn1.setForeground(Color.PINK);
		btn1.setFont(new Font("궁서체", Font.ITALIC, 20));
		
		c.add(btn2);
		btn2.setEnabled(false);
		
		c.add(btn3);
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(java.awt.event.ActionEvent e) {
				Random r = new Random();
				btn3.setForeground(new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256)));
			}
		});
			
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ButtonEx1();
	}

}
