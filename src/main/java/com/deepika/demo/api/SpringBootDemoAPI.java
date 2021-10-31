package com.deepika.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.deepika.demo.model.Employee;
import com.deepika.demo.service.EmployeeService;
import com.deepika.demo.view.EmployeeDataExcelExport;

@RestController
@RequestMapping("/application")
@CrossOrigin
public class SpringBootDemoAPI {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("excel")
	public ModelAndView exportToExcel()
	{
		System.out.println("Inside excel method");
		ModelAndView mav = new ModelAndView();
		mav.setView(new EmployeeDataExcelExport());
		List<Employee> list= employeeService.getAllEmployee();
		System.out.println("after service method");
		mav.addObject("list",list);
		return mav;
	}
	
}
