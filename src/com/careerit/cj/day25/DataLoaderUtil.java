package com.careerit.cj.day25;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public final class DataLoaderUtil {

	private DataLoaderUtil() {

	}

	public static List<Player> loadPlayers() {

		List<Player> list = new ArrayList<Player>();

		try {
			List<String> lines = Files.readAllLines(Paths.get("ipl_2020_data.csv"));
			for (int i = 1; i < lines.size(); i++) {
				String data = lines.get(i);
				String[] arr = data.split(",");
				int c = 0;
				String name = arr[c++];
				String role = arr[c++];
				String country = arr[c++];
				String team = arr[c++];
				double price = Double.parseDouble(arr[c++]);
				Player player = new Player(name, role, country, team, price);
				list.add(player);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return list;
	}

}
