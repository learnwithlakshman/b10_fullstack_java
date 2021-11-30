package com.careerit.iplstat.dao;

import static com.careerit.iplstat.dao.util.ConnectionUtil.close;
import static com.careerit.iplstat.dao.util.ConnectionUtil.getConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.careerit.iplstat.domain.Player;
import com.careerit.iplstat.domain.Team;

public class TeamStatDao {

	private static final String ALL_TEAMS = "select name,home,city,coach,label from team";

	public List<Team> getAllTeamDetails() {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		List<Team> teams = new ArrayList<>();
		try {
			con = getConnection();
			st = con.createStatement();
			rs = st.executeQuery(ALL_TEAMS);
			while (rs.next()) {
				String name = rs.getString("name");
				String home = rs.getString("home");
				String city = rs.getString("city");
				String coach = rs.getString("coach");
				String label = rs.getString("label");
				Team team = new Team(name, home, coach, city, label);
				teams.add(team);
			}
		} catch (SQLException e) {
			System.out.println("While getting team information :" + e);
		} finally {
			close(rs, st, con);
		}
		return teams;
	}
	
	public List<Player> getPlayersByTeam(String label){
		
		
		return null;
	}
}
