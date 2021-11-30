package com.careerit.iplstat.domain;

public class Player {

	private String name;
	private double price;
	private String role;
	private String label;

	public Player() {
		super();
	}

	public Player(String name, double price, String role, String label) {
		super();
		this.name = name;
		this.price = price;
		this.role = role;
		this.label = label;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

}
