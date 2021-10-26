package com.careerit.ipl.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.careerit.ipl.domain.Player;
import com.careerit.ipl.domain.Team;
import com.careerit.ipl.dto.RoleCountDTO;
import com.careerit.ipl.dto.TeamAmountDTO;
import com.careerit.ipl.util.FileReaderUtil;

public class IplStatServiceImpl implements IplStatService {

	private List<Team> teams;

	public IplStatServiceImpl() {
		teams = FileReaderUtil.loadTeamFromJSON();
	}

	@Override
	public List<String> getTeamLabels() {
//
//		List<String> teamNames = new ArrayList<String>();
//		for (Team team : teams) {
//			teamNames.add(team.getLabel());
//		}
//		return teamNames;

		List<String> teamNames = teams.stream().map(t -> t.getLabel()).collect(Collectors.toList());
		return teamNames;
	}

	@Override
	public List<RoleCountDTO> getCountByRole(String label) {

//		Team team=null;
//		for(Team t:teams) {
//			if(t.getLabel().equalsIgnoreCase(label)) {
//				team = t;
//				break;
//			}
//		}
//		
//		Map<String,Integer> map = new HashMap<>();
//		
//		for(Player p:team.getPlayers()) {
//				String role = p.getRole();
//				map.putIfAbsent(role, 0);				
//				map.put(role, map.get(role)+1);
//		}
//		
//		List<RoleCountDTO> roleCountList = new ArrayList<>();
//		
//		Set<String> keys = map.keySet();
//		for(String key:keys) {
//			Integer value = map.get(key);
//			RoleCountDTO roleCountDTO = new RoleCountDTO();
//			roleCountDTO.setCount(value);
//			roleCountDTO.setRole(key);
//			roleCountList.add(roleCountDTO);
//		}
//		return roleCountList;

		Map<String, Long> map = teams.stream().filter(t -> t.getLabel().equalsIgnoreCase(label))
				.map(t -> t.getPlayers()).findFirst().get().stream()
				.collect(Collectors.groupingBy(Player::getRole, Collectors.counting()));

		List<RoleCountDTO> roleCountList = new ArrayList<>();

		map.entrySet().forEach(e -> {
			RoleCountDTO roleCountDTO = new RoleCountDTO();
			roleCountDTO.setCount(e.getValue());
			roleCountDTO.setRole(e.getKey());
			roleCountList.add(roleCountDTO);
		});

		return roleCountList;
	}

	@Override
	public List<TeamAmountDTO> getAmountSpentByTeams() {
		List<TeamAmountDTO> teamAmuont = new ArrayList<TeamAmountDTO>();
		teams.stream().forEach(team -> {
			String label = team.getLabel();
			double amount = team.getPlayers().stream().mapToDouble(p -> p.getPrice()).sum();
			TeamAmountDTO obj = new TeamAmountDTO();
			obj.setLable(label);
			obj.setAmount(amount);
			teamAmuont.add(obj);
		});

		return teamAmuont;
	}

}
