package com.deepika.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.deepika.demo.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		
		Employee e1= new Employee("Deepika", "Associate Condultant", "50000" );
		Employee e2= new Employee("Adem", "Associate Condultant", "50000" );
		Employee e3= new Employee("Alex", "Associate Condultant", "50000" );
		Employee e4= new Employee("Yuvi", "Associate Condultant", "50000" );
		
		List<Employee> list= new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		return list;
	}

}
