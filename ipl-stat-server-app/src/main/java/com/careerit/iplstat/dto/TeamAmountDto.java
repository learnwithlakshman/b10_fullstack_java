package com.careerit.iplstat.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TeamAmountDto {

		private String teamName;
		private String teamLabel;
		private double totalAmount;
}
