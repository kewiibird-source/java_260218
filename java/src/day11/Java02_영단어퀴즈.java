package day11;

import java.util.ArrayList;
import java.util.Scanner;

public class Java02_영단어퀴즈 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		WordQuiz quiz = new WordQuiz();
		ArrayList<Word> quizList = quiz.getList();
//		
//		for (int i = 0; i < quizList.size(); i++) {
//			System.out.println(quizList.get(i).getEnglish());
//		}
		Word w = quizList.get(3);
		System.out.println(w.getEnglish() + ":");
		String answer = n.next();
		if (w.getKorean().equals(answer)) {
			System.out.println("정답!");
		} else {
			System.err.println("오답! 정답은 " + w.getKorean());
		}

	}

}
