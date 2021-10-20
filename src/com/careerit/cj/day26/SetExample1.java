package com.careerit.cj.day26;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample1 {

		public static void main(String[] args) {
			List<String> cs = List.of("NV", "JA", "KV");
			List<String> is = List.of("NV", "CV","RM","MR","DR","KV");
			List<String> ec = List.of("NV", "CV", "MV","JV","LV","KV");
			
			// Get all the unique names
			Set<String> names = new HashSet<String>();
			names.addAll(cs);
			names.addAll(is);
			names.addAll(ec);
			System.out.println(names);
	
			// Get all the faculty who are working for all the departments 
			
			for(String name:names) {
				
				if(cs.contains(name) && is.contains(name) && ec.contains(name)) {
					System.out.println(name);
				}
			}
			
			
		}
}
