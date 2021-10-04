package com.careerit.cj.day19;

class A{
	int a  = 10;
	void m1() {
		System.out.println("M1 of A");
	}
}
class B extends A{
	int a = 100;
	void m1() {
		System.out.println("M1 of B");
	}
	void m2() {
		System.out.println("M2 of B");
	}
}
public class TypeCastingManager {

		public static void main(String[] args) {
					
			A obj = new B();
			obj.m1();
			
			B obj1 = (B)obj;
			obj1.m1();
			obj1.m2();
			

			
			int a  = 10;
			float b = a;
			
			float f = 4.14f;
			int i = (int)f;
		}
}
