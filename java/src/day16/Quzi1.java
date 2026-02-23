package day16;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Quzi1 extends JFrame {
	int num = 1;
	Container c;
	Random r = new Random();
	long startTime = 0;
	
	public Quzi1() {
		setTitle("첫번째 화면");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c = getContentPane();
		// 랜덤한 위치에 넣기위해 배치관리자 사용 x
		c.setLayout(null);
		// 타이틀까지 포함된 크기
		setSize(600, 600);
		setVisible(true);
		createBtn();
	}
	
	void createBtn() {
		for (int i = 1; i <= 10; i++) {
			JButton btn = new JButton(i + "");
			btn.setLocation(r.nextInt(500), r.nextInt(500));
			btn.setSize(50, 50);
			
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JButton selectBtn = (JButton) e.getSource();
//					Integer.parseInt(selectBtn.getText() 문자를 숫자로
//					Integer.toString(num) 숫자를 문자로
					String removeNum = num + "";
					if(selectBtn.getText().equals(removeNum)) {
						if(num == 1) {
							startTime = System.currentTimeMillis();
						}
						c.remove(selectBtn);
						// repaint 화면 렌더링 다시 해줌!!
						c.repaint();
						num++;
						if(num == 11) {
							long lastTime = System.currentTimeMillis();
							System.out.println((lastTime - startTime) / 1000.0);
							createBtn();
							num = 1;
						}
					}
				}
			});
			c.add(btn);
		}
	}

	public static void main(String[] args) {
		new Quzi1();
	}

}
