package com.careerit.iplstat.dao;

import static com.careerit.iplstat.dao.util.ConnectionUtil.close;
import static com.careerit.iplstat.dao.util.ConnectionUtil.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.careerit.iplstat.domain.Player;
import com.careerit.iplstat.domain.Team;

public class TeamStatDao {

	private static final String ALL_TEAMS = "select name,home,city,coach,label from team";
	private static final String PLAYER_BY_TEAM = "select name,price,role,label from player where label=? order by price";
	private static final String TEAM_STAT_INFO="select count(*) as count,max(price) as max,min(price) as min,avg(price) as avg from player where label=?";


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
	
	public List<Player> getPlayersByTeam(String teamLabel){
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		List<Player> players = new ArrayList<>();
		try {
			con = getConnection();
			st = con.prepareStatement(PLAYER_BY_TEAM);
			st.setString(1,teamLabel);
			rs = st.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				float price = rs.getFloat("price");
				String role = rs.getString("role");
				String label = rs.getString("label");
				Player player = new Player(name, price, role, label);
				players.add(player);
			}
		} catch (SQLException e) {
			System.out.println("While getting player information :" + e);
		} finally {
			close(rs, st, con);
		}
		return players;
		
		
	}
}
