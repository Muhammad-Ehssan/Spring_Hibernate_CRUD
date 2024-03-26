package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeeDao;
	
	@Override
	@Transactional
	public List<Employee> get() {
		return employeeDao.get();
	}

	@Override
	@Transactional
	public Employee get(int id) {
		return employeeDao.get(id);
	}

	@Override
	@Transactional
	public void save(Employee employee) {
		employeeDao.save(employee);
	}

	@Override
	@Transactional
	public void delete(int id) {

		employeeDao.delete(id);
		
	}

	@Override
	@Transactional
	public Employee update(Employee employee) {
		 employeeDao.save(employee);
		 return employee;
	}

}
