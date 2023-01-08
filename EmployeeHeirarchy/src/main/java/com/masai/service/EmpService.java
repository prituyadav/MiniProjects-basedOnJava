package com.masai.service;

import java.util.List;

import com.masai.entity.Employee;
import com.masai.exception.EmployeeIdNotExistException;

public interface EmpService {
	
	public Employee addEmployee(Employee emp);
	
	public Employee getEmployee(Integer id) throws EmployeeIdNotExistException;
	
	public Employee getManager(Integer id) throws EmployeeIdNotExistException;
	
	public  List<Employee> getAllEmp(Integer id) ;
	
	

}
