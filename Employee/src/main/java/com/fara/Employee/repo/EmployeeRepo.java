package com.fara.Employee.repo;

import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import com.fara.Employee.pojo.EmployeePojo;

@Repository
public class EmployeeRepo{
	 private List<EmployeePojo> employees = new ArrayList<>();

	    public List<EmployeePojo> findAll() {
	        return employees;
	    }

	    public void addEmployee(EmployeePojo employee) {
	        employees.add(employee);
	    }

	    public EmployeePojo findById(String id) {
	        return employees.stream().filter(emp -> emp.getId().equals(id)).findFirst().orElse(null);
	    }
	    public void deleteById(String id) {
	    	employees.remove(id);
	    }
	  
}