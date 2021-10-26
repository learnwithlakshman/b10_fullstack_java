package com.careerit.ipl.domain;

import java.util.List;

public class Team {

		private String city;
		private String label;
		private String coach;
		private String home;
		private String name;
		
		private List<Player> players;
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getLabel() {
			return label;
		}
		public void setLabel(String label) {
			this.label = label;
		}
		public String getCoach() {
			return coach;
		}
		public void setCoach(String coach) {
			this.coach = coach;
		}
		public String getHome() {
			return home;
		}
		public void setHome(String home) {
			this.home = home;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<Player> getPlayers() {
			return players;
		}
		public void setPlayers(List<Player> players) {
			this.players = players;
		}
		
		
}
