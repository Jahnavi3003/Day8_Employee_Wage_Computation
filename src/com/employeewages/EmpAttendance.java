package com.employeewages;

public class EmpAttendance {
	
	public static int fulltime = 1;

	public static void empAttendanceCheck() {
		
		double check = Math.floor(Math.random() * 2);
		if (check == fulltime)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
		
		
	}
	
	public static void main(String[] args) {
		empAttendanceCheck();
	}
}
