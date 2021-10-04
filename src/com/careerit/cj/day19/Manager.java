package com.careerit.cj.day19;

class Student {
	String name;
	int sem;

	public Student(String name, int sem) {
		this.name = name;
		this.sem = sem;
	}
	
	@Override
	public String toString() {
		return String.format("[Name = %s, Sem = %s]", name,sem);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj)
			return true;
		if(obj instanceof Student) {
			Student s = (Student)obj;
			return s.name.equals(this.name) && s.sem == this.sem;
		}
		return false; 
	}
	
}




public class Manager {

		public static void main(String[] args) {
				Student obj1 = new Student("Naresh", 8);
				Student obj2 = new Student("Naresh", 8);
				
				
				System.out.println(obj1.equals(obj2));
			   
		}
}
