package com.careerit.iplstat.service;

import java.util.List;

import com.careerit.iplstat.dto.LabelDto;
import com.careerit.iplstat.dto.PlayerDto;
import com.careerit.iplstat.dto.TeamAmountDto;

public interface IplStatService {

		public LabelDto getTeamLabels();
		public List<PlayerDto> getPlayersOf(String label);
		public List<TeamAmountDto> getAmountOfAllTeams();
}
