package com.careerit.iplstat.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Team {

		@Id
		private String label;
		private String name;
		private String coach;
		private String city;
		private String home;
		
		@OneToMany(mappedBy = "team",cascade = CascadeType.ALL)
		private List<Player> players;
}
