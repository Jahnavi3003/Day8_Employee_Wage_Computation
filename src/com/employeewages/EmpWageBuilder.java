package com.employeewages;

public class EmpWageBuilder {
	
	public static final int fulltime = 1;
	public static final int parttime = 2;
	
	private String companyName;
    private int empRatePerHour;
    private int noOfWorkDays;
    private int maxHrsPerMonth;
    private int totalEmpWage;
    
    public EmpWageBuilder(String companyName, int empRatePerHour, int noOfWorkDays, int maxHrsPerMonth ) {
    	this.companyName=companyName;
    	this.empRatePerHour=empRatePerHour;
    	this.noOfWorkDays=noOfWorkDays;
    	this.maxHrsPerMonth=maxHrsPerMonth;
    }
    
    public int emp_wage() {

       
        int empHrs = 0;
        int empWage = 0;
        
        int totalEmpHrs = 0;
        int numOfDays = 0;

       
        while (totalEmpHrs <= maxHrsPerMonth && numOfDays < noOfWorkDays ) {
           numOfDays++;
           int empCheck = (int) Math.floor(Math.random()*3);
           switch (empCheck) {
              case fulltime:
                 empHrs = 8;
                 break;
              case parttime:
                 empHrs = 4;
                 break;
              default:
                 empHrs = 0;
              }
       
           totalEmpHrs += empHrs;
           empWage = totalEmpHrs * empRatePerHour;
           totalEmpWage = totalEmpWage + empWage;
        }
        return totalEmpWage;
     }
     
     @Override
     public String toString() {
  	   return companyName + " employee total wage :- " + totalEmpWage;
     }
 
		
	
	public static void main(String[] args) {
		
			   
			   EmpWageBuilder SLMP = new EmpWageBuilder("SLMP" , 20 , 100 , 40);
			   SLMP.emp_wage();
			   
			   System.out.println(SLMP + "\n");
			   
			   EmpWageBuilder Apple = new EmpWageBuilder("Apple", 22 , 90 , 30);
			   Apple.emp_wage();
			   
			   System.out.println(Apple + "\n");
			   
			   EmpWageBuilder Dell = new EmpWageBuilder("Dell", 22 , 90 , 30);
			   Dell.emp_wage();
			   
			   System.out.println(Dell + "\n");	   
			}

}
