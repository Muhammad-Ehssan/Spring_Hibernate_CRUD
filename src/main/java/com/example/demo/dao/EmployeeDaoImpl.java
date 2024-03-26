package com.example.demo.dao;

import java.util.List;
import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Employee;

import jakarta.persistence.EntityManager;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private EntityManager entityManger;
	
	@Override
	public List<Employee> get() {
		Session currentSession = entityManger.unwrap(Session.class);
		Query<Employee> query = currentSession.createQuery("from Employee",Employee.class);
		return query.getResultList();
	}

	@Override
	public Employee get(int id) {
		Session currentSession = entityManger.unwrap(Session.class);
		Employee employee =  currentSession.get(Employee.class, id);
		return employee;
	}

	@Override
	public void save(Employee employee) {
		Session currentSession = entityManger.unwrap(Session.class);
		if(null == employee.getId()) {
			currentSession.persist(employee); //saves
		}
		else if(null != employee.getId() && !Objects.isNull(currentSession.find(Employee.class, employee.getId()))){
			currentSession.merge(employee);//saves or update
		}else {
			currentSession.merge(employee);//saves or update
		}
	}

	@Override
	public void delete(int id) {
		Session currentSession = entityManger.unwrap(Session.class);
		Employee employee = currentSession.get(Employee.class, id);
		currentSession.remove(employee);
		
	}

	

}
