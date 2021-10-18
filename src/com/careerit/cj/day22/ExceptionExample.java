package com.careerit.cj.day22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ExceptionExample {

	public static void main(String[] args) {

		System.out.println("Start of main");
		
		showResult();
		try {
			List<String> list = readDataFromFile();
			System.out.println(list);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("End of main");
	}
	
	
	public static List<String> readDataFromFile() throws IOException{
		List<String> list = Files.readAllLines(Paths.get("notes.txt"));
		
		return list;
	}
	public static void showResult() {
		int a = 10;
		int b = 0;
		try {
			int res = a / b;
			System.out.println("Result is :" + res);
		} catch (ArithmeticException e) {
     		e.printStackTrace();
		}
	}
}
