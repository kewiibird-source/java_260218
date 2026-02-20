package day15;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEvent3 extends JFrame {
	
	public MouseEvent3() {
		setTitle("마우스 이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel("JAVA");
		label.setSize(200, 20);
		label.setLocation(50, 50);
		c.add(label);
		
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				// 마우스가 컨테이너 위에 올라가는순간 색이 바꾸도록!
				c.setBackground(Color.WHITE);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// 마우스가 컨테이너 밖으로 나가면 색이 바뀜
				c.setBackground(Color.DARK_GRAY);
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				label.setText("마우스 클릭 위치" + "(" + e.getX() + "," + e.getY() + ")");
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				label.setText("마우스 떼는 위치" + "(" + e.getX() + "," + e.getY() + ")");
			}
		});
		
		c.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				label.setText("마우스 현재 위치" + "(" + e.getX() + "," + e.getY() + ")");
			}
		});
		
		setSize(500, 500);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new MouseEvent3();
	}

}
