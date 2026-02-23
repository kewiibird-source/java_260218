package day16;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TextFieldEx03 extends JFrame{
	
	public TextFieldEx03() {		
		setTitle("첫번째 화면");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		c.add(new JLabel("이름 : "));
		c.add(new JTextField(20));
		
		c.add(new JLabel("학과 : "));
		c.add(new JTextField("컴공과",20));
		
		c.add(new JLabel("주소 : "));
		JTextField addr = new JTextField(20);
		addr.setEditable(false);
		c.add(addr);

		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		new TextFieldEx03();
	}

}
