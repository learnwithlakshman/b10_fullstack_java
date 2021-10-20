package com.careerit.cj.day26;

import java.util.HashSet;
import java.util.Set;

public class SetManager {

		public static void main(String[] args) {
			
				Student s1 = new Student("Krish", 25);
				Student s2 = new Student("Krish", 25);
				Student s3 = new Student("Manoj", 35);
				Student s4 = new Student("Charan", 33);
				
				Set<Student> set = new HashSet<Student>();
				set.add(s1);
				set.add(s2);
				set.add(s3);
				set.add(s4);
				
				System.out.println(set.size());
		
		}
}
