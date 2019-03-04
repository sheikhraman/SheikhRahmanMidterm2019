package design;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/

	public static void main(String[] args) {
		EmployeeInfo e1 = new EmployeeInfo("Sheikh Rahman", 101, "DB", 8000.00, 'M');
		EmployeeInfo e2 = new EmployeeInfo("John Dow", 102, "QA", 50000.00, 'M');
		EmployeeInfo e3 = new EmployeeInfo("John Gold", 103, "SE", 60000.00, 'F');
		EmployeeInfo e4 = new EmployeeInfo("John Lee", 104, "QA", 45000.00, 'F');
		EmployeeInfo e5 = new EmployeeInfo("Edward Smith", 105, "DB", 7400.00, 'M');
		System.out.println(e1.getName());
		System.out.println(e2.getEmployeeID());
		System.out.println(e3.getDeptName());
		System.out.println(e4.getSalary());
		System.out.println(e5.getGender());
		e1.farewell(10 / 10 / 2010);
		e1.calculateSalary();
		e1.assignDepartment();

		EmployeeInfo.calculateEmployeeBonus(5, 10000.00);
		EmployeeInfo.setCompanyName("JDK");
		System.out.println(EmployeeInfo.getCompanyName());
		System.out.println(EmployeeInfo.calculateEmployeePension());

		Map<Integer, List<Object>> empInfo = new HashMap<Integer, List<Object>>();
		List<Object> emp = new ArrayList<Object>();
		emp.add(e1.employeeName());
		emp.add(e1.employeeId());
		emp.add(e1.calculateSalary());
		List<Object> emp1 = new ArrayList<Object>();
		emp1.add(e2.employeeName());
		emp1.add(e2.employeeId());
		emp1.add(e2.calculateSalary());
		empInfo.put(1, emp);
		empInfo.put(2, emp1);
		List empInfos = new ArrayList();
		empInfos =emp1;
		//ConnectToSqlDB connect = new ConnectToSqlDB();
		//ConnectToSqlDB.connectToSqlDatabase();

	}
}
