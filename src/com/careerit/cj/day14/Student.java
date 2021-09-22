package com.careerit.cj.day14;

public class Student {

	private String usn;
	private String name;
	private int sem;

	public Student(String usn, String name, int sem) {
		this.usn = usn;
		this.name = name;
		this.sem = sem;
	}

	public void promote() {
		sem = sem + 1;
	}

	public void showInfo() {
		System.out.println("UNS  :" + usn);
		System.out.println("Name :" + name);
		System.out.println("Sem  :" + sem);
	}

	public int getSem() {
		return sem;
	}
}
