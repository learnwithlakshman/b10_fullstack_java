package com.careerit.ipl.service;

import java.util.List;

import com.careerit.ipl.dto.RoleCountDTO;
import com.careerit.ipl.dto.TeamAmountDTO;

public interface IplStatService {
	public List<String> getTeamLabels();
	public List<RoleCountDTO> getCountByRole(String label);
	public List<TeamAmountDTO> getAmountSpentByTeams();
}
