package com.fara.Employee.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fara.Employee.pojo.EmployeePojo;
import com.fara.Employee.repo.EmployeeRepo;

import java.util.List;

@Service
public class EmployeeService{
	@Autowired
    private EmployeeRepo employeeRepository;

    public List<EmployeePojo> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public void addEmployee(EmployeePojo employee) {
        employeeRepository.addEmployee(employee);
    }

    public EmployeePojo getEmployeeById(String id) {
        return employeeRepository.findById(id);

    }
}