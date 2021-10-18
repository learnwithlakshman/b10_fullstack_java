package com.careerit.cj.day24;

import java.util.ArrayList;
import java.util.List;

public class ListSampleQuestions {

		public static void main(String[] args) {
			
				String data1 = "91,92,93,94,95,96,97,98,99,100";
				String data2 = "11,12,15,19,29,35,45,55,65,75,77,97,99";
			
				List<Integer> list = new ArrayList<Integer>();
				
				String[] arr1 = data1.split(",");
				String[] arr2 = data2.split(",");
				
				for(String ele:arr1) {
					list.add(Integer.parseInt(ele));
				}
				
				for(String ele:arr2) {
					list.add(Integer.parseInt(ele));
				}

				List<Integer> evenList = new ArrayList<Integer>();
				
				for(Integer ele:list) {
					if(ele % 2 == 0) {
						evenList.add(ele);
					}
				}
				System.out.println(evenList);
		}
}
