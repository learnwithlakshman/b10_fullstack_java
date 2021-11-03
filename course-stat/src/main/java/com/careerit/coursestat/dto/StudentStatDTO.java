package com.careerit.coursestat.dto;

public class StudentStatDTO {

		private int count;
		private double maxScore;
		private double minScore;
		private double avgScore;

		public StudentStatDTO(int count, double maxScore, double minScore, double avgScore) {
			super();
			this.count = count;
			this.maxScore = maxScore;
			this.minScore = minScore;
			this.avgScore = avgScore;
		}

		public StudentStatDTO() {
			super();
		}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}

		public double getMaxScore() {
			return maxScore;
		}

		public void setMaxScore(double maxScore) {
			this.maxScore = maxScore;
		}

		public double getMinScore() {
			return minScore;
		}

		public void setMinScore(double minScore) {
			this.minScore = minScore;
		}

		public double getAvgScore() {
			return avgScore;
		}

		public void setAvgScore(double avgScore) {
			this.avgScore = avgScore;
		}

		@Override
		public String toString() {
			return "StudentStatDTO [count=" + count + ", maxScore=" + maxScore + ", minScore=" + minScore
					+ ", avgScore=" + avgScore + "]";
		}
		
		
}
