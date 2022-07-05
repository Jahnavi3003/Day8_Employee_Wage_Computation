package com.employeewages;

public class DailyEmpWage {
	
	public static int fulltime = 1;
	public static final int wageperhour=20;
	static int wages=0;
	static int Emphrs=0;
	
	public static int empDailyWage() {
	double check = Math.floor(Math.random() * 2);
	if (check == fulltime)
		Emphrs=8;
	else
        Emphrs=0;
	    wages= Emphrs * wageperhour;
	    
	return wages;
	
	}
	
	public static void main(String[] args) {
	System.out.println("Employee Daily Wage is " + empDailyWage() );
}
}
