package com.careerit.cjutil.json.emp;

import java.util.List;

public interface EmployeeService {

	
		List<Employee> maxSalaryEmployees();
		List<Employee> minSalaryEmployees();
		SalaryStatDTO salarySatDetails();
}
