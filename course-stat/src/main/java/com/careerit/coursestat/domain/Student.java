package com.careerit.coursestat.domain;

public class Student {

		private String name;
		private String batch;
		private String status;
		private String placed;
		private String qualification;
		private double score;
		
		public Student() {
			super();
		}
		public Student(String name, String batch, String status, String placed, String qualification, double score) {
			super();
			this.name = name;
			this.batch = batch;
			this.status = status;
			this.placed = placed;
			this.qualification = qualification;
			this.score = score;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getBatch() {
			return batch;
		}
		public void setBatch(String batch) {
			this.batch = batch;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getPlaced() {
			return placed;
		}
		public void setPlaced(String placed) {
			this.placed = placed;
		}
		public String getQualification() {
			return qualification;
		}
		public void setQualification(String qualification) {
			this.qualification = qualification;
		}
		public double getScore() {
			return score;
		}
		public void setScore(double score) {
			this.score = score;
		}
		
		
}
