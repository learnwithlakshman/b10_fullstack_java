package com.careerit.cj.day13;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class PlayerManager {

	public static void main(String[] args) throws IOException {

		Player[] arr = loadPlayers();

		// Display players who are earning more than 10CR

		showPlayersEaringMoreThanOrEqualTo(arr, 15_00_00_000);

		// Show the player count of the given country

		showPlayerCountBy(arr,"England");

		// Get max paid player(s)

		showMaxPaidPlayers(arr);

		// Get max paid bowlers

		showMaxPaidBowlers(arr);

		// Get min paid player(s)

		showMinPaidPlayers(arr);

	}

	
	


	private static void showMinPaidPlayers(Player[] arr) {
			double minAmount = minAmount(arr);
			System.out.println("*".repeat(100));
			System.out.println("The min paid player(s) - "+minAmount+" are :");
			System.out.println("*".repeat(100));
			for(Player player:arr) {
				if(player.getAmount()==minAmount) {
					player.showInfo();
				}
			}
		
	}





	private static void showMaxPaidBowlers(Player[] players) {
		double max = maxAmount(players,"Bowler");
		System.out.println("Max paid ("+max+") Bowler(s) are:");
		for (Player player : players) {
			if(player.getAmount()==max && player.getRole().equals("Bowler")) {
				player.showInfo();
				System.out.println("*".repeat(100));
			}
		}
		
	}





	private static void showMaxPaidPlayers(Player[] players) {
		double max = maxAmount(players);
		System.out.println("Max paid ("+max+") player(s) are:");
		for (Player player : players) {
			if(player.getAmount()==max) {
				player.showInfo();
				System.out.println("*".repeat(100));
			}
		}
	
		
	}





	private static void showPlayerCountBy(Player[] arr, String country) {
		
		int count = 0;
		for (Player player : arr) {
			if (player.getCountry().equalsIgnoreCase(country)) {
				count++;
			}
		}
		System.out.println("Total players "+count+" from country "+country);
	}





	private static double minAmount(Player[] players) {
		double min = players[0].getAmount();
		for (Player player : players) {
			if (min > player.getAmount()) {
				min = player.getAmount();
			}
		}
		return min;
	}

	private static double maxAmount(Player[] players) {
		double max = players[0].getAmount();
		for (Player player : players) {
			if (max < player.getAmount()) {
				max = player.getAmount();
			}
		}
		return max;
	}

	private static double maxAmount(Player[] players, String role) {
		double max = 0;
		for (Player player : players) {
			if (max < player.getAmount() && player.getRole().equals(role)) {
				max = player.getAmount();
			}
		}
		return max;
	}

	private static void showPlayersEaringMoreThanOrEqualTo(Player[] arr, double amount) {
		System.out.println("The player(s) who are earing >= " + amount);
		for (Player player : arr) {
			if (player.getAmount() >= amount) {
				player.showInfo();
			}
		}

	}

	private static Player[] loadPlayers() throws IOException {

		List<String> list = Files.readAllLines(Paths.get("ipl_2020_data.csv"));
		Player[] players = new Player[list.size() - 1];
		int c = 0;
		for (int i = 1; i < list.size(); i++) {
			String data = list.get(i);
			String[] arr = data.split(",");
			Player player = new Player(arr[0], arr[1], arr[2], arr[3], Double.parseDouble(arr[4]));
			players[c++] = player;
		}

		return players;
	}
}
