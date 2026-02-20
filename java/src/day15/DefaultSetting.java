package day15;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class DefaultSetting extends JFrame{
	
	public DefaultSetting() {		
		setTitle("첫번째 화면");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon img = new ImageIcon();
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new DefaultSetting();
	}

}
