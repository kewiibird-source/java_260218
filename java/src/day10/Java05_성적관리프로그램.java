package day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Java05_성적관리프로그램 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		ArrayList<String> stuNoList = new ArrayList<>(); // 학번관리 리스트
		
		Scanner n = new Scanner(System.in);
		// 1번메뉴 -> 학생 추가, 2번메뉴 -> 성적입력, 3번메뉴 -> 성적조회
		// 4번메뉴 -> 종료, 그외 숫자 -> 다시입력
		while (true) {
			try {
				System.out.print("[1.학생추가, 2.성적입력, 3.성적조회, 4.종료] : ");
				int menu = n.nextInt();
				if (menu == 1) {
					String stuNo = "";
					boolean stuNoFlg = true;
					while(stuNoFlg) {
						System.out.print("학번 입력 : ");
						stuNo = n.next();
						stuNoFlg = stuNoList.contains(stuNo);
						if(stuNoFlg) {System.out.println("학번 중복임 다시 입력");}
					}
					System.out.print("이름 입력 : ");
					String name = n.next();
					System.out.print("나이 입력 : ");
					int age = n.nextInt();

					Student stu = new Student(stuNo, name, age);
					stuNoList.add(stuNo);
					list.add(stu);

				} else if (menu == 2) {
					// 학번을 입력받아서 해당 학번 학생의 자바, 오라클, html 입력 받아서 저장
					// 해당하는 학번 없을경우 '해당 학번을 가진 학생이 없습니다' 출력 후 메뉴로 이동(중복학번)
					System.out.println("학번 입력 : ");
					String stuNo = n.next();

					boolean stuFlg = false;
					for (int i = 0; i < list.size(); i++) {
						Student stu = list.get(i);
						if (stuNo.equals(stu.getStuNo())) {
							stuFlg = true;
							stu.setJava();

							System.out.print("오라클 : ");
							int oracle = n.nextInt();
							stu.setOracle(oracle);

							System.out.print("html : ");
							int html = n.nextInt();
							stu.setHtml(html);
						}
					}
					if (!stuFlg) {
						System.out.println("해당 학번을 가진 학생이 없습니다.");
					}
				} else if (menu == 3) {
					// 모든 학생의 정보 출력! 학번:ㅇㅇㅇ, 이름:ㅇㅇㅇ, 자바:ㅇㅇ,...
					for (int i = 0; i < list.size(); i++) {
						Student stu = list.get(i);
						System.out.print("학번 :" + stu.getStuNo() + ",");
						System.out.print("이름 :" + stu.getName() + ",");
						System.out.print("자바 :" + stu.getJava() + ",");
						System.out.print("오라클 :" + stu.getOracle() + ",");
						System.out.print("html :" + stu.getHtml());
						System.out.println();
					}
				} else if (menu == 4) {
					System.out.println("종료됨");
					break;
				} else {
					System.out.println("1~4중에 선택하셈");
				}
			} catch (Exception e) {
				System.out.println("에러발생 다시시도하셈");
				n.next();
			}
		}
	}

}
