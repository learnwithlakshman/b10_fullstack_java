package com.careerit.collections.task2;

import java.util.List;

public class Question {

		private int id;
		private String data;
		private List<String> answers;
		private int correctAnswer;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getData() {
			return data;
		}
		public void setData(String data) {
			this.data = data;
		}
		public List<String> getAnswers() {
			return answers;
		}
		public void setAnswers(List<String> answers) {
			this.answers = answers;
		}
		public int getCorrectAnswer() {
			return correctAnswer;
		}
		public void setCorrectAnswer(int correctAnswer) {
			this.correctAnswer = correctAnswer;
		}
		
		
}
