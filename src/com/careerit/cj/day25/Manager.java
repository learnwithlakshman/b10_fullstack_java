package com.careerit.cj.day25;

import java.util.List;

public class Manager {

		public static void main(String[] args) {
			
				IplStatService service = new IplStatService();
				
				List<Player> maxPaidPlayers = service.maxPaidPlayer();
				maxPaidPlayers.forEach(System.out::println);
				
				System.out.println(service.totalAmountByTeam("RCB"));
				System.out.println(service.playerCountByTeam("RCB"));
		}
}
