package com.employeewage;

public class EmpWageComputation {

	public static void main(String[] args) {

		// Start with Displaying Welcome to Employee Wage Computation Program on Master
		// Branch
		System.out.println("Welcome to Employee Wage Computation Program");
		
		//Check Employee is Present or Absent UC-1
				int is_present=1;
				int attendanceCheck=(int)Math.floor((Math.random()*10)%2);
				
				if (attendanceCheck==is_present) {
					System.out.println("employee is present");
				}
				else {
					System.out.println("employee is absent");
				}
	}

}
