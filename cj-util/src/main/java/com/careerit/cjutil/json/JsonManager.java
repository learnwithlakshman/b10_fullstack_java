package com.careerit.cjutil.json;

import java.io.IOException;
import java.util.List;

import com.careerit.cjutil.json.emp.Employee;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonManager {

	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		String jsonString = "{\"empno\":1001, \"name\":\"Mahesh\", \"salary\":21}";
		
		try {
			Employee employee = mapper.readValue(jsonString,Employee.class);
			System.out.println(employee);
			
			
			 jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employee);
             System.out.println(jsonString);
             
             List<Employee> list = mapper.readValue(JsonManager.class.getResourceAsStream("/emp_data.json"), new TypeReference<List<Employee>>(){});
            
             list.stream().forEach(e->{
            	 System.out.println(e);
             });
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
