package com.careerit.cj.day4;

import java.util.Scanner;

public class PaginationExample {

		public static void main(String[] args) {
			
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the total records :");
				int total = sc.nextInt();
				
				System.out.println("Enter the page size");
				int size = sc.nextInt();
		
				int pageCount = (int)Math.ceil(total/(float) size) ;
				
				for(int i=0;i<pageCount;i++) {
					System.out.print(" " +i+ " ");
				}
				System.out.println("\nEnter page number");
				int page = sc.nextInt();
				int start = page * size + 1;
				int end = start + size - 1;
				
				for(int i=start;i<=end;i++) {
					System.out.println(i);
				}
				sc.close();
		}
}
