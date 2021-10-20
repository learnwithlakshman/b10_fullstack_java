package com.careerit.cj.day26;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.careerit.cj.day25.DataLoaderUtil;
import com.careerit.cj.day25.Player;

public class ListWithStream {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1001; i <= 1020; i++) {
			list.add(i);
		}
		System.out.println(list);

//				List<Integer> tempList = new ArrayList<Integer>();
//				for(Integer ele:list) {
//					
//						if(ele % 3 == 0) {
//							tempList.add(ele);
//						}
//				}
//		    	System.out.println(tempList);

		List<Integer> list1 = list.stream().filter(e -> e % 3 == 0).collect(Collectors.toList());
		System.out.println(list1);
		// Increase all the element by 5 store it another list

//		List<Integer> list2 = new ArrayList<Integer>();
//
//		for (Integer ele : list) {
//			list2.add(ele + 5);
//		}
		
		List<Integer> list2 = list.stream().map(e->e+3).collect(Collectors.toList());
		System.out.println(list2);

		
		List<Player> playerList = DataLoaderUtil.loadPlayers();
		
		// Get only team names
//		Set<String> teams = new HashSet<String>();
//		for(Player p:playerList) {
//			String teamName = p.getTeam();
//			teams.add(teamName);
//	    }
		
		Set<String> teams = playerList.stream().map(p->p.getTeam()).collect(Collectors.toSet());
		System.out.println(teams);
		
		
		String name = "CSK";
		double totalAmount=playerList.stream().filter(p->p.getTeam().equalsIgnoreCase(name)).mapToDouble(p->p.getPrice()).sum();
		System.out.println(totalAmount);
	}	
}
