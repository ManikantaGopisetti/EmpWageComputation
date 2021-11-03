package com.employeewage;

public class EmpWageComputation {
	
	final static int is_full_time=1;
	final static int is_part_time=2;

	public static void main(String[] args) {

		// Start with Displaying Welcome to Employee Wage Computation Program on Master Branch
		System.out.println("Welcome to Employee Wage Computation Program");

		// Check Employee is Present or Absent UC-1
		int wagePerHour = 20;
		int hours = 0;
		int attendanceCheck = (int) Math.floor((Math.random() * 10) % 3);

		switch(attendanceCheck) {
		case is_full_time: System.out.println("employee is present and full time");
				hours=8;
				break;
		case is_part_time: System.out.println("employee is present and part time");
				hours=4;
				break;
		default: System.out.println("employee is absent");
				break;
		}
		
		// Calculate Daily Employee Wage UC-2

		int dailyEmpWage = hours * wagePerHour;
		System.out.println("daily employee wage =" + dailyEmpWage);
		
		//Add Part time Employee & Wage UC-3
		
		//Solving using Switch Case Statement UC-4
	}

}
