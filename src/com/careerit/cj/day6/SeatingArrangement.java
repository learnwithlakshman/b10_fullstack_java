package com.careerit.cj.day6;

public class SeatingArrangement {

		public static void main(String[] args) {
			
				int total = 100;
				int size = 16;
				int rcount = (int) Math.ceil(total/(float)size);
     			int t = 1;
				for(int i=1;i<=rcount;i++) {
					System.out.println("#"+i+" student list");
					for(int j=1;j<=size;j++) {
						System.out.print(t+" ");
					     if(t == total)
							 break;
						t++;
					}
					System.out.println();
					
				}
		
		}
}
