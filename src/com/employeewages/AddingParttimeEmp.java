package com.employeewages;

public class AddingParttimeEmp {
	
	public static int fulltime = 1, parttime=2;
	public static final int wageperhour=20;
	static int wages=0;
	static int Emphrs=0;
	
	public static int fulltimeParttimeWage() {
	double check = Math.floor(Math.random() * 3);
	if (check == fulltime)
	{
		Emphrs=8;
	    
	    
	}
	else if(check==parttime)
	{
	    Emphrs=4;
       
        
	}
	
	else
	{
		Emphrs=0;
		
	}
	
	wages= Emphrs * wageperhour;
	    
	return wages;
	
	}
	
	public static void main(String[] args) {
		System.out.println("Employee Daily Wage is " +fulltimeParttimeWage());
}

}
