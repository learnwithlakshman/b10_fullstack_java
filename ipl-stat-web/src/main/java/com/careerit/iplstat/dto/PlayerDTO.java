package com.careerit.iplstat.dto;

public class PlayerDTO {
	private String name;
	private String price;
	private String role;
	private String label;

	public PlayerDTO(PlayerDTOBuilder pb) {
		this.name = pb.name;
		this.price = pb.price;
		this.role = pb.role;
		this.label = pb.label;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
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
	
	public static PlayerDTOBuilder builder() {
		return new PlayerDTOBuilder();
	}

	public static class PlayerDTOBuilder {
		private String name;
		private String price;
		private String role;
		private String label;

		public PlayerDTOBuilder name(String name) {
			this.name = name;
			return this;
		}

		public PlayerDTOBuilder price(String price) {
			this.price = price;
			return this;
		}

		public PlayerDTOBuilder role(String role) {
			this.role = role;
			return this;
		}

		public PlayerDTOBuilder label(String label) {
			this.label = label;
			return this;
		}

		public PlayerDTO build() {

			return new PlayerDTO(this);
		}
	}

}
