package com.careerit.cj.day10;

public class Array2dExample {

	public static void main(String[] args) {

		int[][] arr = new int[][] {
			                         { 1, 2, 3 }, 
			                         { 5, 6, 7 },
			                         { 8, 9, 4 }
			                       };
		
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=0;j<arr[i].length;j++) {
				
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
		
		

	}
}
