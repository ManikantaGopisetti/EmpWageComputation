package com.employeewage;

public class EmpWageComputation {

	final static int is_full_time = 1;
	final static int is_part_time = 2;

	public static void main(String[] args) {

		// Start with Displaying Welcome to Employee Wage Computation Program on Master Branch
		System.out.println("Welcome to Employee Wage Computation Program");

		// Check Employee is Present or Absent UC-1
		int wagePerHour = 20;
		int hours = 0;
		int wDaysPerMonth = 0;
		int totalWorkHours = 0;
		int totalWage = 0;

		while (wDaysPerMonth < 20) {

			int attendanceCheck = (int) Math.floor((Math.random() * 10) % 3);

			switch (attendanceCheck) {
			case is_full_time:
				System.out.println("employee is present and full time");
				hours = 8;
				break;
			case is_part_time:
				System.out.println("employee is present and part time");
				hours = 4;
				break;
			default:
				System.out.println("employee is absent");
				hours = 0;
				break;
			}

			// Calculate Daily Employee Wage UC-2

			int dailyEmpWage = hours * wagePerHour;
			System.out.println("daily emp wage=" + dailyEmpWage);

			// Add Part time Employee & Wage UC-3

			// Solving using Switch Case Statement UC-4

			// Calculating Wages for a Month UC-5

			totalWage = totalWage + dailyEmpWage;
			totalWorkHours = totalWorkHours + hours;
			wDaysPerMonth++;

			// Calculate Wages till a condition of total working hours or days is reached
			// for a month - Assume 100 hours UC-6

			if (totalWorkHours > 100 || wDaysPerMonth > 20) {
				break;
			}
		}
		System.out.println("total wage per month= " + totalWage);

	}
}