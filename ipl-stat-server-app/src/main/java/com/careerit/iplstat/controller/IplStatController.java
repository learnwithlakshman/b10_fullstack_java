package com.careerit.iplstat.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.careerit.iplstat.dto.LabelDto;
import com.careerit.iplstat.dto.PlayerDto;
import com.careerit.iplstat.dto.TeamAmountDto;
import com.careerit.iplstat.service.IplStatService;

@RestController
public class IplStatController {

		@Autowired
		private IplStatService iplStatService;
	
		@GetMapping("/labels")
		public LabelDto getLabels(){
			return iplStatService.getTeamLabels();
		}
		
		@GetMapping("/players/{label}")
		public List<PlayerDto> getPlayers(@PathVariable("label")String label){
			return iplStatService.getPlayersOf(label);
		}
		
		@GetMapping("/teams/amount")
		public List<TeamAmountDto> getTeamAmounts(){
			return iplStatService.getAmountOfAllTeams();
		}
		
		
}
