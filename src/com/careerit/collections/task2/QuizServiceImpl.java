package com.careerit.collections.task2;

import java.util.List;

public class QuizServiceImpl implements QuizService{

	@Override
	public void startQuiz(String username) {
			
			List<Question> list = loadQuestions();
			showQuizQuestions(list);
			
		
	}
	
	private List<Question> loadQuestions(){
		// Logic load questions from questiondata.txt file
		return null;
	}
	
	private void showQuizQuestions(List<Question> questions) {
		// Show one by one question and collect user response
		showResult(0, 0, 0);
	}
	
	private void showResult(int totalQuestions,int noCorrect,int noWrong) {
		
		// Percentage and show result as "PASS / FAIL"
	}
	
	

}
