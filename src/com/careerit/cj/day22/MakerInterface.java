package com.careerit.cj.day22;

class Student implements Cloneable{
	
		private int regno;
		private String name;
		private int sem;
		public Student(int regno, String name, int sem) {
			this.regno = regno;
			this.name = name;
			this.sem = sem;
		}
		
		public void promoteSem() {
			this.sem +=  1;
		}
		public int getRegno() {
			return regno;
		}
		public void setRegno(int regno) {
			this.regno = regno;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSem() {
			return sem;
		}
		public void setSem(int sem) {
			this.sem = sem;
		}
		@Override
		public String toString() {
			return "Student [regno=" + regno + ", name=" + name + ", sem=" + sem + "]";
		}
		@Override
		protected Student clone() throws CloneNotSupportedException {
			return (Student) super.clone();
		}
		
		
	
}
public class MakerInterface {

		public static void main(String[] args) throws CloneNotSupportedException {
			
				Student s1 = new Student(1001, "Krish", 3);
				
				Student s2 = s1.clone();
				s1.promoteSem();
				s1.promoteSem();
				System.out.println(s1);
				System.out.println(s2);
				
				
		}
}
