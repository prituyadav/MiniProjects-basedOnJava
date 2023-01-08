package com.masai.Controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.entity.Employee;
import com.masai.exception.EmployeeIdNotExistException;
import com.masai.models.Customer;
import com.masai.service.EmpServiceImpl;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmpServiceImpl empl;
	
	@PostMapping("/add-emp")
	ResponseEntity<Employee> addingEmployee(@RequestBody @Valid Employee emp){
		Employee em= empl.addEmployee(emp);
		
		return new ResponseEntity<Employee>(em,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/get-employees/{employee-id}")
	public ResponseEntity<Employee> getEmployeeHandler(@PathVariable("employee-id") Integer id) throws EmployeeIdNotExistException {
		 Employee s=empl.getEmployee(id);
		 
		 return new ResponseEntity<Employee>(s, HttpStatus.OK);
	}
	
	@GetMapping("/get-employee-manager/{employee-id}")
	public ResponseEntity<List<Employee>> getAllManagerHandler(@PathVariable("employee-id") Integer id) throws EmployeeIdNotExistException {
		List<Employee> list = empl.getAllEmp(id);
		
		 
		 return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
	}
	
	@GetMapping("/get-all-reportees/{employee-id}")
	public ResponseEntity<List<Employee>> getAllEmployeeHandler(@PathVariable("employee-id") Integer id){
		List<Employee> list = empl.getAllEmp(id);
		
		return new ResponseEntity<List<Employee>>(list, HttpStatus.OK);
	}
	
	

}
