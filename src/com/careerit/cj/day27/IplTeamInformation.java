package com.careerit.cj.day27;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.careerit.cj.day25.DataLoaderUtil;
import com.careerit.cj.day25.Player;

public class IplTeamInformation {

		public static void main(String[] args) {
				List<Player> players = DataLoaderUtil.loadPlayers();
				
				// Get me players of the given team
				
				Map<String,List<Player>> map = new HashMap<>();
				
//				for(Player player:players) {
//						String name = player.getTeam();
//						map.putIfAbsent(name, new ArrayList<Player>());
//						List<Player> list = map.get(name);
//						list.add(player);
//						map.put(name, list);
//				}
				
				 Map<String, List<Player>> result = players.stream().collect(Collectors.groupingBy(Player::getTeam,Collectors.toList()));
				
				result.entrySet().forEach(e->{
					System.out.println("-----------------------");
					System.out.println(e.getKey());
					System.out.println("-----------------------");
					System.out.println(e.getValue());
				});
				
				
		}
}
