package com.employeewages;

public class EmpWageUsingSwitch {

	public static final int fulltime = 1, parttime=2;
	public static final int wageperhour=20;
	static int wages=0;
	static int Emphrs=0;
	
	public static int fulltimeParttimeWage() {
	int check = (int) Math.floor(Math.random() * 3);
	switch (check) {
	case fulltime:
		          Emphrs=8;
		          break;
	    
	    
	case parttime:
	
	               Emphrs=4;
	               break;
       
    default:
		           Emphrs=0;
	}
	
	wages= Emphrs * wageperhour;
	    
	return wages;
	
	}
	
	public static void main(String[] args) {
		System.out.println("Employee Daily Wage is " +fulltimeParttimeWage());
}
}
