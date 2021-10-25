package com.careerit.cjutil.json.emp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.careerit.cjutil.json.JsonManager;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class JsonUtil {

	private JsonUtil() {
		
	}
	public static List<Employee> loadFromJSONFile() {
		ObjectMapper mapper = new ObjectMapper();
		List<Employee> list = new ArrayList<Employee>();
		try {
			list = mapper.readValue(JsonManager.class.getResourceAsStream("/emp_data.json"),
					new TypeReference<List<Employee>>() {
					});
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
}
