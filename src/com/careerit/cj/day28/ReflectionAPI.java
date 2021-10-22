package com.careerit.cj.day28;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class MathOperations implements Cloneable,Serializable{
	
	public void m1() {
		System.out.println("m1");
	}
	private void m2() {
		System.out.println("m2");
	}
}

public class ReflectionAPI {

		public static void main(String[] args) {
			
					String name = "Krish";
					
					try {
						Class<?> cls = Class.forName("com.careerit.cj.day28.MathOperations");
						
						
						Object obj = cls.newInstance();
						MathOperations obj1 = (MathOperations) obj;
						obj1.m1();
						
						
						Method[] methods = cls.getMethods();
						System.out.println(cls.getSuperclass());
						
						Class<?>[] arr = cls.getInterfaces();
						for(Class c:arr) {
							System.out.println(c);
						}
						for(Method m:methods) {
							System.out.println(m);
							System.out.println(Modifier.toString(m.getModifiers()));
							System.out.println(m.getReturnType());
							System.out.println(m.getParameterCount());
						}
					} catch (ClassNotFoundException | InstantiationException | IllegalAccessException  e) {
						e.printStackTrace();
					}
		}
}
