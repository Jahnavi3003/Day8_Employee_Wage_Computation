package com.employeewages;

interface interface_empWageBuilder {
	public abstract void addEmpWageBuilder(String company_name, int totalWorkDays, int maxHrsPMonth, int empRatePHr);

	public abstract void computation_of_emp_wage();
} 


public class EmpWageBuilder {
	final String company_name;
    final int totalWorkDays;
    final int maxHrsPMonth; 
    final int empRatePHr;
    
    int totalEmpWage;

   
	public EmpWageBuilder(String company_name, int totalWorkDays, int maxHrsPMonth, int empRatePHr) {
		super();
		this.company_name = company_name;
		this.totalWorkDays = totalWorkDays;
		this.maxHrsPMonth = maxHrsPMonth;
		this.empRatePHr = empRatePHr;
	}

	
	public int getTotalEmpWage() {
		return totalEmpWage;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
    
	
	@Override
	public String toString() {
		return company_name + " employee total wage :- " + totalEmpWage;
	}

public static void main(String[] args) {
	   System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION PROGRAM.\n");
	   
	   interface_empWageBuilder object = new empWageBuilder(); 
	   
	   
	   object.addEmpWageBuilder("DELL", 20, 100, 40);
	   object.addEmpWageBuilder("APPLE", 22, 90, 30);
	   object.addEmpWageBuilder("LENOVO", 25, 80, 20);
	   
	   object.computation_of_emp_wage(); 
	   
	}
}
