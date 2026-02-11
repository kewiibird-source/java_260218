package day11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Java04_영단어퀴즈4 {
	// 프로그램종료전까지중복x
	// 등록된문제를모두출제후'남은문항이존재하지않음'=>메뉴이동
	
	public static void runQuzi(ArrayList<Word> quizList, ArrayList<Word>questionList) {
		Scanner n = new Scanner(System.in);
		Random a = new Random();
		ArrayList<String> wordList = new ArrayList<>();
		for (int i = 0; i < quizList.size(); i++) {
			if(quizList.size() == questionList.size()) {
				System.out.println("남은 문항이 존재하지 않습니다.");
				break;
			}
			int index = a.nextInt(quizList.size()); 
			Word word = quizList.get(index);
			boolean quizFlg = questionList.contains(word.getEnglish()); 
			if(quizFlg) {
				i--;
				continue; 
			}
			System.out.print((i + 1) + "번 : " + word.getEnglish() + " => ");
			String answer = n.next();
			if (answer.equals(word.getKorean())) {
				System.out.println("정답~");
			} else {
				System.out.println("오답! 정답은 " + word.getKorean());
			}
			wordList.add(word.getEnglish());
//			System.out.println(wordList);
		}
		
	}
	
	public static void addQuiz(WordQuiz quiz) {
		Scanner n = new Scanner(System.in);
		System.out.print("영어 : ");
		String english = n.next();
		System.out.print("한글 : ");
		String korean = n.next();
		quiz.setWord(english, korean);
	}
		
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		Random a = new Random();
		WordQuiz quiz = new WordQuiz();
		ArrayList<Word> questionList = quiz.getList();

		while (true) {
			System.out.print("[1.문제 풀이, 2. 문제 추가, 3. 문제 수 확인] : ");
			int menu = n.nextInt();
			switch (menu) {
				case 1: 
//					runQuzi(quizList, questionList);
					break;
				case 2:
					addQuiz(quiz);					
					break;
				case 3:
					System.out.println("현재 등록된 문제 수는 " + questionList.size() + "개 입니다");
					break;
				default:
	
					break;
			}
		}
	}

}
