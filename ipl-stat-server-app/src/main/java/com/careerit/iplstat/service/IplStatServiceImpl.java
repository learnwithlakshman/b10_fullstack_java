package com.careerit.iplstat.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.careerit.iplstat.domain.Player;
import com.careerit.iplstat.domain.Team;
import com.careerit.iplstat.dto.LabelDto;
import com.careerit.iplstat.dto.PlayerDto;
import com.careerit.iplstat.dto.TeamAmountDto;
import com.careerit.iplstat.repo.TeamRepo;

@Service
@Transactional
public class IplStatServiceImpl implements IplStatService {

	private Logger log = LoggerFactory.getLogger(IplStatServiceImpl.class);
	@Autowired
	private TeamRepo teamRepo;

	@Override
	public LabelDto getTeamLabels() {
		List<String> list = teamRepo.selectTeamLabels();
		log.info("Requested for team labels and it found :{}", list.size());
		LabelDto obj = new LabelDto();
		obj.setLabels(list);
		return obj;
	}

	@Override
	public List<PlayerDto> getPlayersOf(String label) {
		Team team = teamRepo.findByLabel(label);
		List<PlayerDto> playerList = new ArrayList<>();
		if (team != null) {
			List<Player> list = team.getPlayers();
			playerList = list.stream().map(p -> {
				return PlayerDto.builder().name(p.getName()).id(p.getId()).label(team.getLabel()).price(p.getPrice())
						.role(p.getRole()).build();
			}).collect(Collectors.toList());

			log.info("Team {} has {} players", label, playerList.size());
		} else {
			log.info("Team with name {} is not found", label);
		}
		return playerList;
	}

	@Override
	public List<TeamAmountDto> getAmountOfAllTeams() {
		return teamRepo.selectAmountOfAllTeams();
	}
	
	

}
