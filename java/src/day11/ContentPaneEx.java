package day11;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {

	public ContentPaneEx() {
		setTitle("zz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));
		// FlowLayout 컴포넌트 부착시 왼쪽->오른쪽 순차적으로 배치해줌
		
		c.setBackground(Color.WHITE);
		
		JButton btn1 = new JButton("안녕?");
		c.add(btn1);
		c.add(new JButton("자바 꿀잼")); // 기능추가하기 힘듬.
		c.add(new JButton("오라클!")); 
		
		setSize(400, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new ContentPaneEx();
		
	}

}
