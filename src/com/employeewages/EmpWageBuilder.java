package com.employeewages;

public class EmpWageBuilder {
	
	private String companyName;
    int empRatePerHour;
    private int noOfWorkDays;
    private int maxHrsPerMonth;
    private int totalEmpWage;
    
    public EmpWageBuilder(String companyName, int empRatePerHour, int noOfWorkDays, int maxHrsPerMonth ) {
    	super();
    	this.companyName=companyName;
    	this.empRatePerHour=empRatePerHour;
    	this.noOfWorkDays=noOfWorkDays;
    	this.maxHrsPerMonth=maxHrsPerMonth;
    }
    
    public int getTotalEmpWage() {
		return totalEmpWage;
    }
		
		 public int getmaxHrsPerMonth() {
				return maxHrsPerMonth;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	
    @Override
    public String toString() {
 	   return companyName + " employee total wage :- " + totalEmpWage;
    }

		
	
 
	public static void main(String[] args) {
		
			   
			   EmpWageBuilder SLMP = new EmpWageBuilder();
			   
			   SLMP.addEmpWageBuilder("DELL", 20, 100, 40);
			   SLMP.addEmpWageBuilder("APPLE", 22, 90, 30);
			   SLMP.addEmpWageBuilder("Lenovo", 25, 80, 20);
			   
			   SLMP.computation_of_emp_wage(); 

}
}
