package com.careerit.cjutil.json.emp;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

	private List<Employee> empList;

	public EmployeeServiceImpl() {
		empList = JsonUtil.loadFromJSONFile();
	}

	@Override
	public List<Employee> maxSalaryEmployees() {
		double maxSalary = maxSalary();

		List<Employee> list = new ArrayList<Employee>();

		for (Employee emp : empList) {
			if (emp.getSalary() == maxSalary) {
				list.add(emp);
			}
		}

		return list;
	}

	@Override
	public List<Employee> minSalaryEmployees() {
		double minSalary = minSalary();

		List<Employee> list = new ArrayList<Employee>();

		for (Employee emp : empList) {
			if (emp.getSalary() == minSalary) {
				list.add(emp);
			}
		}

		return list;
	}

	@Override
	public SalaryStatDTO salarySatDetails() {
		long count = empList.size();
		double maxSalary = maxSalary();
		double minSalary = minSalary();
		double totalSalary = totalSalary();
		double avgSalary = totalSalary / count;

		SalaryStatDTO obj = new SalaryStatDTO();
		obj.setAvgSalary(avgSalary);
		obj.setCount(count);
		obj.setMaxSalary(maxSalary);
		obj.setMinSalary(minSalary);

		return obj;
	}

	private double maxSalary() {

		double maxSalary = empList.get(0).getSalary();
		for (int i = 1; i < empList.size(); i++) {
			if (maxSalary < empList.get(i).getSalary()) {
				maxSalary = empList.get(i).getSalary();
			}
		}
		return maxSalary;
	}

	private double minSalary() {

		double minSalary = empList.get(0).getSalary();
		for (int i = 1; i < empList.size(); i++) {
			if (minSalary > empList.get(i).getSalary()) {
				minSalary = empList.get(i).getSalary();
			}
		}
		return minSalary;
	}

	private double totalSalary() {

		double totalSalary = 0;
		for (int i = 0; i < empList.size(); i++) {
			totalSalary += empList.get(i).getSalary();
		}
		return totalSalary;
	}

}
