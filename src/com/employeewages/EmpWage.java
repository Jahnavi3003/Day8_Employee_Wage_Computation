package com.employeewages;

public class EmpWage {
	
    	 final int fulltime = 1;
    	 final int parttime = 2;
    	 
    	 int numOfcompanies=0;
    	 
    EmpWageBuilder[] empWageBuilderArray = new EmpWageBuilder[5];
    	    
    	    	    
    public void addEmpWageBuilder(String companyName, int noOfWorkDays, int maxHrsPerMonth, int empRatePerHour) {
    		   empWageBuilderArray[numOfcompanies] = new EmpWageBuilder(companyName, noOfWorkDays, maxHrsPerMonth, empRatePerHour);
    		   numOfcompanies++;
    	   } 
    	    

    	   public void computation_of_emp_wage() {
    		   for(int i = 0; i < numOfcompanies; i++) {
    			   empWageBuilderArray[i].setTotalEmpWage(this.computation_of_emp_wage(empWageBuilderArray[i]));
    			   System.out.println(empWageBuilderArray[i]);
    		   }
    	   }
    	   
  	   public int computation_of_emp_wage(EmpWageBuilder empWageBuilder) {

       
        int empHrs = 0;
        int empWage = 0;
        
        int totalEmpHrs = 0;
        int numOfDays = 0;

       
        while (totalEmpHrs <= empWageBuilder.getMaxHrsPerMonth() && numOfDays < empWageBuilder.getNoOfWorkDays() ) {
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
           empWage = totalEmpHrs * empWageBuilder.empRatePerHour;
           empWageBuilder.setTotalEmpWage(empWageBuilder.getTotalEmpWage() + empWage);
        }
        return empWageBuilder.getTotalEmpWage();
     }
     

}
