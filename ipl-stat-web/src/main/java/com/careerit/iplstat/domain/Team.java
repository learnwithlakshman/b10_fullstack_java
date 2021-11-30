package com.careerit.iplstat.domain;

public class Team {

	private String name;
	private String home;
	private String coach;
	private String city;
	private String label;

	public Team() {
	}

	public Team(String name, String home, String coach, String city, String label) {
		this.name = name;
		this.home = home;
		this.coach = coach;
		this.city = city;
		this.label = label;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHome() {
		return home;
	}

	public void setHome(String home) {
		this.home = home;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

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

}
