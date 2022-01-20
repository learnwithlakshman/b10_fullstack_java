package com.careerit.iplstat.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class PlayerDto {
	
	private Long id;
	private String name;
	private String role;
	private double price;
	private String label;
}
