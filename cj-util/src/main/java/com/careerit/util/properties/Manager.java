package com.careerit.util.properties;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

public class Manager {

	public static void main(String[] args) {

//		showValuesFromProperties();
//		showValuesFromYAML();

	

	}

	

	private static void showValuesFromYAML() {
		Yaml yaml = new Yaml();
		Map<String, Object> obj = yaml.load(Manager.class.getResourceAsStream("/dbconfig.yaml"));
		obj.entrySet().stream().forEach(entry -> {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		});
	}

	private static void showValuesFromProperties() {
		Properties properties = new Properties();
		try {
			properties.load(Manager.class.getResourceAsStream("/dbconfig.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String url = properties.getProperty("url");

		System.out.println("Username :" + username);
		System.out.println("Password :" + password);
		System.out.println("Url      :" + url);
	}

}
