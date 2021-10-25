package com.careerit.cjutil.json.emp;

import java.util.List;

public class EmpManager {

		public static void main(String[] args) {
			
			EmployeeService service = new EmployeeServiceImpl();
			
			SalaryStatDTO obj = service.salarySatDetails();
			System.out.println(obj);
			
			List<Employee> list1 = service.maxSalaryEmployees();
			System.out.println("Max paid employee(s) are :");
			for(Employee emp:list1) {
				System.out.println(emp);
			}
			
			List<Employee> list2 = service.minSalaryEmployees();
			System.out.println("Min paid employee(s) are :");
			for(Employee emp:list2) {
				System.out.println(emp);
			}
		}
}
