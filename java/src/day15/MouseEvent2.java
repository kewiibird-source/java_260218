package day15;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEvent2 extends JFrame {
	
	public MouseEvent2() {
		setTitle("마우스 이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel("JAVA");
		label.setSize(50, 20);
		label.setLocation(50, 50);
		c.add(label);
		
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				int x = e.getX();
				int y = e.getY();
				label.setLocation(x, y);
			}
		});
		
		setSize(500, 500);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new MouseEvent2();
	}

}
