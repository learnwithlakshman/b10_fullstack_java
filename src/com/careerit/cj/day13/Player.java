package com.careerit.cj.day13;

public class Player {

	private String name;
	private String role;
	private String country;
	private String team;
	private double amount;

	public Player(String name, String role, String country, String team, double amount) {
		this.name = name;
		this.role = role;
		this.country = country;
		this.team = team;
		this.amount = amount;
	}

	public void showInfo() {
		String data = String.format("%s - %s - %s - %s - %s", name, role, country, team, amount);
		System.out.println(data);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	

}
