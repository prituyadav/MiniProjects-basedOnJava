package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.entity.Employee;
import com.masai.exception.EmployeeIdNotExistException;
import com.masai.exceptions.CustomerException;
import com.masai.models.Customer;
import com.masai.repo.EmployeeRepo;

@Service
public class EmpServiceImpl implements EmpService{

	 @Autowired
	private EmployeeRepo empRepo;

	@Override
	public Employee addEmployee(Employee emp) {
		Employee em=empRepo.save(emp);
		return em;
	}

	@Override
	public Employee getEmployee(Integer id) throws EmployeeIdNotExistException {
		Optional<Employee> em=empRepo.findById(id);
		if(em.isPresent()) {
			Employee employee  = em.get();
			return employee;
		}else {
			throw new EmployeeIdNotExistException("No employee available with this id");
		}
	
	}

	@Override
	public Employee getManager(Integer id) throws EmployeeIdNotExistException {
		Optional<Employee> em=empRepo.findById(id);
		if(em.isPresent()) {
			Employee employee  = em.get();
			return employee;
		}else {
			throw new EmployeeIdNotExistException("No employee available with this id");
		}
	
	}

	@Override
	public List<Employee> getAllEmp(Integer id) {
		 List<Employee> list =  empRepo.findAll();
		//	if(list.size()!=0) 
				return list;
			
	}
	 
	 
	 
	
}
