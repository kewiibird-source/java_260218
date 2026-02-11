package day11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Java03_영단어퀴즈3 {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		Random a = new Random();
		WordQuiz quiz = new WordQuiz();
		ArrayList<Word> quizList = quiz.getList();
		ArrayList<String> wordList = new ArrayList<>();
		
		// 랜덤 문제 5개 출제 , 맞추면 정답! 틀리면 오답!
		// 중복된문제 X => 나온문제를 리스트에 추가해서....
		
		for (int i = 0; i < 10; i++) {
			int index = a.nextInt(quizList.size()); // quizList에 문제가 추가되어도 알아서 개수 맞춰짐
			Word word = quizList.get(index);
			
			boolean quizFlg = wordList.contains(word.getEnglish()); // false일때 밑으로 진행
			if(quizFlg) {
				i--;
				continue; // true뜨면 i감소 후 다시 증감식으로 가도록
			}
			System.out.print((i + 1) + "번 : " + word.getEnglish() + " => ");
			String answer = n.next();
			if (answer.equals(word.getKorean())) {
				System.out.println("정답~");
			} else {
				System.out.println("오답! 정답은 " + word.getKorean());
			}
			wordList.add(word.getEnglish());
			
			System.out.println(wordList);
		}

	}

}
