package com.masai.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.masai.entity.Employee;


public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
	
	@Query("select * from Employee where manager_id = ''")
	public List<Employee> getAllManagers(Integer id);
	

}
