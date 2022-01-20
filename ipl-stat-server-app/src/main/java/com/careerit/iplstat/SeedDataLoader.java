package com.careerit.iplstat;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.careerit.iplstat.domain.Team;
import com.careerit.iplstat.repo.TeamRepo;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class SeedDataLoader {
		
			@Autowired
			private TeamRepo teamRepo;
			
			@PostConstruct
			public void init() throws StreamReadException, DatabindException, IOException {
				teamRepo.deleteAll();
				ObjectMapper mapper = new ObjectMapper();
				List<Team> teams = Arrays.asList(mapper.readValue(this.getClass().getResourceAsStream("/ipl2020.json"), Team[].class));
				teams.stream().forEach(t->{
						t.getPlayers().stream().forEach(player->{
							player.setTeam(t);
						});
				});
				teamRepo.saveAll(teams);
			}
			
}
