package com.careerit.ipl;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

import com.careerit.ipl.dto.RoleCountDTO;
import com.careerit.ipl.dto.TeamAmountDTO;
import com.careerit.ipl.service.IplStatService;
import com.careerit.ipl.service.IplStatServiceImpl;

public class IplStatManager {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		IplStatService service = new IplStatServiceImpl();
		while (true) {
			System.out.println("*".repeat(50));
			System.out.println("1. Team labels 2. Role count by team 3. Team(s) amount 4.Exit");
			System.out.println("*".repeat(50));
			System.out.println("Enter your choice :");
			int ch = sc.nextInt();
			if (ch == 1) {
				List<String> labels = service.getTeamLabels();
				System.out.println("\nTeam label details are:\n");
				labels.forEach(ele -> {
					System.out.println(ele);
				});
			}else if(ch == 2) { 
				
				System.out.println("Enter the team name :");
				sc.nextLine();
				String name = sc.nextLine();
				List<RoleCountDTO> countList = service.getCountByRole(name);
				for(RoleCountDTO obj :countList) {
					System.out.printf("%-15s : %s\n",obj.getRole() ,+obj.getCount());
				}
			}else if(ch == 3) {
				System.out.println("Team amount details are :");
				List<TeamAmountDTO> list = service.getAmountSpentByTeams();
				for(TeamAmountDTO obj :list) {
					System.out.printf("%-15s : %s\n",obj.getLable() ,new BigDecimal(obj.getAmount()).toPlainString());
				}
			}
			
			else if (ch == 4) {
				System.out.println("Bye......");
				break;
			}

		}
		sc.close();
	}
}
