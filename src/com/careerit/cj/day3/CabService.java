package com.careerit.cj.day3;

import java.util.Scanner;

public class CabService {

	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the num of people: ");
			int count = sc.nextInt();
			
			int capacity = 4;
			int cabCount =  (int) (Math.ceil(count/(float)capacity));
//			if(count % capacity != 0) {
//				cabCount = count / capacity + 1;
//			}else {
//				cabCount = count/capacity;
//			}
			System.out.println("For people :"+count+" needs "+cabCount+" cabs ");
			sc.close();
		}
}
