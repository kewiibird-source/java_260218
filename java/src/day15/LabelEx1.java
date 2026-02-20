package day15;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class LabelEx1 extends JFrame{
	
	public LabelEx1() {		
		setTitle("이미지 띄우깅긩긩긩긔긔");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon img = new ImageIcon("images/beauty.jpg");
		JLabel label = new JLabel(img);
		
		c.add(label);
		
		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new LabelEx1();
	}

}
