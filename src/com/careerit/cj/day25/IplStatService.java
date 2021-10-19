package com.careerit.cj.day25;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IplStatService {

	// 1. Get max paid player(s)
	// 2. Get amount spent by the given team
	// 3. Get player count of the given team
	// 4. Get role count of the given team

	// 5. Get min paid player(s)
	// 6. Get player(s) who are paid more than given amount
	// 7. Get max paid player(s) of the given team
	// 8. Get max paid player(s) of the given role 
	
	
	private List<Player> players;

	public IplStatService() {
		players = DataLoaderUtil.loadPlayers();
	}

	public List<Player> maxPaidPlayer() {
		double maxAmount = getMaxAmount();
		List<Player> list = new ArrayList<Player>();
		for (Player p : players) {
			if (p.getPrice() == maxAmount) {
				list.add(p);
			}
		}
		return list;
	}

	public double totalAmountByTeam(String team) {
		double total = 0;
		for (Player p : players) {
			if (p.getTeam().equalsIgnoreCase(team)) {
				total += p.getPrice();
			}
		}
		return total;
	}

	public int playerCountByTeam(String team) {
		int total = 0;
		for (Player p : players) {
			if (p.getTeam().equalsIgnoreCase(team)) {
				total++;
			}
		}
		return total;
	}
	
	public List<RoleCountDTO> getRoleCountByTeam(String team){
		List<Player> list = players.stream().filter(p->p.getTeam().equalsIgnoreCase(team)).collect(Collectors.toList());
		Map<String, List<Player>> map = list.stream().collect(Collectors.groupingBy(Player::getRole));
		List<RoleCountDTO> tempList = new ArrayList<RoleCountDTO>();
		
		map.entrySet().forEach(ele->{
			RoleCountDTO obj = new RoleCountDTO(ele.getKey(), ele.getValue().size());
			tempList.add(obj);
		});
		return tempList;
	}

	private double getMaxAmount() {
		double max = players.get(0).getPrice();
		for (int i = 1; i < players.size(); i++) {
			double price = players.get(i).getPrice();
			if (max < price) {
				max = price;
			}
		}
		return max;
	}
}
