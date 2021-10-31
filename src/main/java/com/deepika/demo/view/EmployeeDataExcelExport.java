package com.deepika.demo.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import com.deepika.demo.model.Employee;


public class EmployeeDataExcelExport extends AbstractXlsView{
	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				// define excel file name to be exported
			       response.addHeader("Content-Disposition", "attachment;fileName=EmployeeData.xls");

			       // read data provided by controller
			       @SuppressWarnings("unchecked")
			       List<Employee> list = (List<Employee>) model.get("list");

			       // create one sheet 
			       Sheet sheet = workbook.createSheet("Empoyee");

			       // create row0 as a header
			       Row row0 = sheet.createRow(0);
			       row0.createCell(0).setCellValue("Name");
			       row0.createCell(1).setCellValue("Designation");
			       row0.createCell(2).setCellValue("Salary");
			      
			       
			       // create row1 onwards from List<T>
			       int rowNum = 1;
			       for(Employee spec : list) {
			           Row row = sheet.createRow(rowNum++);
			           row.createCell(0).setCellValue(spec.getName());
			           row.createCell(1).setCellValue(spec.getDesignation());
			           row.createCell(2).setCellValue(spec.getSalary());
			        
			       }
		
	}
}
