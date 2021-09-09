package com.careerit.cj.day6;

public class MatrixPrintLeeters {

		public static void main(String[] args) {
			
				int[][] arr= {
						
						{1,1,1,1},
						{1,0,0,1},
						{1,0,0,1},
						{1,1,1,1},
						{1,0,0,1},
						{1,0,0,1},
						{1,0,0,1}
						
				};
				
				for(int i=0;i<arr.length;i++) {
					for(int j=0;j<arr[i].length;j++) {
						
							int val = arr[i][j];
							if(val==1) {
								System.out.print("* ");
							}else {
								System.out.print("  ");
							}
							
					}
					System.out.println();
				}
		}
}
