package com.careerit.iplstat.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.careerit.iplstat.domain.Team;
import com.careerit.iplstat.dto.TeamAmountDto;

public interface TeamRepo extends JpaRepository<Team, String> {

	@Query("select label from Team")
	public List<String> selectTeamLabels();

	public Team findByLabel(String label);
	
	@Query(value =  "select new com.careerit.iplstat.dto.TeamAmountDto(t.name,t.label,sum(p.price)) from Team t inner join t.players p group by t.label,t.name")
	public List<TeamAmountDto> selectAmountOfAllTeams();

}
