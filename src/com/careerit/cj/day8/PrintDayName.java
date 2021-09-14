package com.careerit.cj.day8;

import java.util.Scanner;

public class PrintDayName {

	// 1-3 "Weekdays are boring"
	// 4-5 "Mid weekdays are ok"
	// 6-7 "Weekends are good"
	// You are in wrong place

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day number :");
		int dayNum = sc.nextInt();

//				if(dayNum >= 1 && dayNum <=3) {
//					System.out.println("Weekdays are boring");
//				}else if(dayNum >=4 && dayNum <=5) {
//					System.out.println("Mid weekdays are ok");
//				}else if(dayNum >=6 && dayNum <=7) {
//					System.out.println("Weekends are good");
//				}else {
//					System.out.println("You are in wrong place");
//				}

		switch (dayNum) {

		case 1:
		case 2:
		case 3:
			System.out.println("Weekdays are boring");
			break;
		case 4:
		case 5:
			System.out.println("Mid weekdays are ok");
			break;
		case 6:
		case 7:
			System.out.println("Weekends are good");
			break;
		default:
			System.out.println("You are in wrong place");
		}
		sc.close();
	}
}
