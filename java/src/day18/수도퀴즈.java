package day18;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class 수도퀴즈 {

	public static void main(String[] args) {
		// 사용자한테 풀 문제수 받아서 출제
		// 내가 가진 문제수보다 큰 숫자 입력 x
		// 중복된 문제 출제 x
		Scanner n = new Scanner(System.in);
		CapitalQuiz obj = new CapitalQuiz();
		ArrayList<Quiz> quizList = obj.getList();
		ArrayList<String> questionList = new ArrayList<>();

		Random r = new Random();

		int count = 0;
		while (true) {
			System.out.print("몇분제 풀? : ");
			count = n.nextInt();
			if (count > quizList.size() || count < 3) {
				System.out.println(quizList.size() + "개 이하로, 3개 이상으로 적으삼");
				continue;
			}
			break;
		}

		for (int i = 1; i <= count; i++) { // 입력한수만큼랜덤으로
			int ranNum = r.nextInt(quizList.size()); // 퀴즈리스트사이즈만큼의숫자안에서랜덤한숫자뽑는걸ranNum에넣고
			Quiz quiz = quizList.get(ranNum); // 퀴즈클래스로 만든 퀴즈객체에 
			if (questionList.contains(quiz.getCountry())) {
				i--;
				continue;
			}
			System.out.println(i + ") " + quiz.getCountry() + " : ");
						
			for(int j=0; j<4; j++) {				
				int ran = r.nextInt(quizList.size());
				quiz = quizList.get(ran);
				System.out.print(quiz.getCapital() + " , ");
			}
				

		
			
			

			
			
			
			String answer = n.next();
			if (answer.equals(quiz.getCapital())) {
				System.out.println("정답~");
			} else {
				System.out.println("오답~");
			}
			questionList.add(quiz.getCountry());
		}

	}
}
