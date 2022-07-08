package com.employeewages;

public class EmpWage implements interface_empWageBuilder{
	
    final int isFullTime = 2;
    final int isPartTime = 1;
    
    int num_Of_Companies = 0;
   
    EmpWageBuilder[] empWageBuilderArray = new EmpWageBuilder[5];
    
    
    
   public void addEmpWageBuilder(String company_name, int totalWorkDays, int maxHrsPMonth, int empRatePHr) {
	   empWageBuilderArray[num_Of_Companies] = new EmpWageBuilder(company_name, totalWorkDays, maxHrsPMonth, empRatePHr);
	   num_Of_Companies++;
   } 
    
   
   public void computation_of_emp_wage() {
	   for(int i = 0; i < num_Of_Companies; i++) {
		   empWageBuilderArray[i].setTotalEmpWage(computation_of_emp_wage(empWageBuilderArray[i]));
		   System.out.println(empWageBuilderArray[i]);
	   }
   } 

  
   public int computation_of_emp_wage(EmpWageBuilder empWageBuilder) {

     
      int empHrs = 0;
      int empWage = 0;
      
      int totalEmpHrs = 0;
      int numOfDays = 0;

     
      while (totalEmpHrs <= empWageBuilder.maxHrsPMonth && numOfDays < empWageBuilder.totalWorkDays ) {
         numOfDays++;
         int empCheck = (int) Math.floor(Math.random()*3);
         switch (empCheck) {
            case isFullTime:
               empHrs = 8;
               break;
            case isPartTime:
               empHrs = 4;
               break;
            default:
               empHrs = 0;
            }
     
         totalEmpHrs += empHrs;
         empWage = totalEmpHrs * empWageBuilder.empRatePHr;
         empWageBuilder.totalEmpWage = empWageBuilder.totalEmpWage + empWage;
      }
      return empWageBuilder.totalEmpWage; 
   }
}
