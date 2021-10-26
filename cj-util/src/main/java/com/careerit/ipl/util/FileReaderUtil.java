package com.careerit.ipl.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.careerit.ipl.domain.Team;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class FileReaderUtil {

	private FileReaderUtil() {

	}

	public static List<Team> loadTeamFromJSON() {
		ObjectMapper mapper = new ObjectMapper();
		List<Team> teams = new ArrayList<Team>();
		try {
			teams = mapper.readValue(FileReaderUtil.class.getResourceAsStream("/ipl_data.json"),
					new TypeReference<List<Team>>() {
					});
		} catch (IOException e) {
			e.printStackTrace();
		}
		return teams;
	}
}
