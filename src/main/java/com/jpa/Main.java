package com.jpa;

import java.util.Scanner;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.jpa.dao.EmployeeDao;

public class Main {
	public static Logger logger = Logger.getLogger("SpringJpa");
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeDao obj = new EmployeeDao();
		while (true) {
			PropertyConfigurator.configure("C:\\Users\\hai\\SiemensTraining\\SpringJpaExample1\\src\\main\\resources\\application.properties");
			
			logger.info(
					"Enter\n                                         1->Print all Employees"
					+ "\n                                         2->Insert new Employee"
					+ "\n                                         3->Delete the employee"
					+ "\n                                         4->update salary"
					+ "\n                                         5->Get Details by id");
			int i = Integer.parseInt(sc.nextLine());
			if (i == 1)
				obj.printall();
			else if (i == 2)
				obj.insert();
			else if (i == 3)
				obj.delete();
			else if (i == 4)
				obj.update();
			else if (i == 5)
				obj.getbyId();
			else
				break;

		}
		obj.end();
	}
}
