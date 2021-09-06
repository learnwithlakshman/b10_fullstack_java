package com.careerit.cj.day5;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceGame {

	public static void main(String[] args) {

		int gnum = ThreadLocalRandom.current().nextInt(1, 7);

		Scanner sc = new Scanner(System.in);
		
		boolean flag = false;
		
		for (int i = 1; i <= 3; i++) {
			
			System.out.println("Guess a number in range 1-6 only ");
			int inputNum = sc.nextInt();
			if (gnum == inputNum) {
		   		System.out.println("You guessed number in "+i+" attempts");
		   		flag = true;
		   		break;
			} else if (inputNum < gnum) {
				System.out.println("Guessed number is < than the generated number");
			} else {
				System.out.println("Guessed number is > than the generated nubmer");
			}
			
		}
		
		if(!flag) {
			System.out.println("You have reached max attempts try again");
		}
		sc.close();
	}
}
