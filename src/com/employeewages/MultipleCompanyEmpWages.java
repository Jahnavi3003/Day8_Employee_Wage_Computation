package com.employeewages;

public class MultipleCompanyEmpWages {
	public static final int fulltime = 1;
	public static final int parttime = 2;
	
	public static int multipleCompanyWages(String companyname, int totalworkhrs, int totalworkdays, int wageperhour) {
		int totalwages=0,totalhrs=0;
		int totalworkingdays=0;
		int Emphrs=0,wages=0;
	    while (totalhrs<=totalworkhrs && totalworkingdays < totalworkdays) {
	    totalworkingdays++;
		int rand = (int) Math.floor(Math.random() * 10);
	    switch (rand) {
	    case fulltime:
			          Emphrs=8;
			          break;
	    case parttime:
                      Emphrs=4;
		              break;
		default:
			          Emphrs=0;
	    }
	    
		totalhrs+= Emphrs;
		System.out.println(totalworkingdays+ " day Employee Hrs is " +Emphrs );
		
	}
	    totalwages=totalhrs*wageperhour;
		System.out.println("Total Employee Wage is " +totalwages );
		return totalwages;
	}
	
	
	public static void main(String[] args) {
		multipleCompanyWages("Dell" ,8, 20 ,8);
		multipleCompanyWages("Apple" ,10, 20 ,4);

}

}
