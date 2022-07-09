package com.employeewages;

import java.util.ArrayList;

public class EmpWageBuilder {
	public static final int is_part_time=1;
	public static final int is_full_time=2;
	
	
	private int numofcompany=0;
	private ArrayList<CompanyEmpWage> companyEmpWageList;
	
	public EmpWageBuilder() {
		companyEmpWageList=new ArrayList<>();
	}
	public void addCompanyEmpWage(String company,int emprateperhr, int numofworkingdays, int maxhrspermonth) {
		CompanyEmpWage companyEmpWage=new CompanyEmpWage(company,emprateperhr,numofworkingdays,maxhrspermonth);
		companyEmpWageList.add(companyEmpWage);
	}
	public void computeEmpWage() {
		for(int i=0; i<companyEmpWageList.size(); i++) {
			CompanyEmpWage companyEmpWage=companyEmpWageList.get(i);
			companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
			System.out.println(companyEmpWage);
		}
	}
	public int computeEmpWage(CompanyEmpWage companyEmpWage) {
		int emphrs=0, totalemphrs=0, totalworkingdays=0, empWage=0;
		while(totalemphrs<=companyEmpWage.maxhrspermonth && totalworkingdays<companyEmpWage.numofworkingdays) {
			totalworkingdays++;
			int empCheck=(int) Math.floor(Math.random()*10) % 3;
			switch(empCheck) {
			case is_full_time:
				emphrs=4;
				break;
			case is_part_time:
				emphrs=8;
				break;
			default:
				emphrs=0;
			}
			totalemphrs += emphrs;
			empWage= totalemphrs*companyEmpWage.emprateperhr;
			companyEmpWage.totalempwage=companyEmpWage.totalempwage + empWage;
			System.out.println(companyEmpWage.company + " Day :" + totalworkingdays + "wage: " + empWage + " and Emp hr: " + emphrs);
			
		}
		return companyEmpWage.totalempwage;
		
	}
	
	public void getTotalWage(String company) {
		   for(int i = 0; i < companyEmpWageList.size(); i++) {
			  String name = companyEmpWageList.get(i).company;
			   if(name.equals(company)) {
				 int totalWage = companyEmpWageList.get(i).totalempwage;
				 System.out.println(company + " employee total wage :- " + totalWage);
				 break;  
			   }
			   else {
				   continue;
			   }
		   }
	   }	
	
	public static void main(String[] args) {
		EmpWageBuilder empwage=new EmpWageBuilder();
		empwage.addCompanyEmpWage("Jio",20,2,10);
		empwage.addCompanyEmpWage("Airtel",10,4,20);
		empwage.computeEmpWage();
		
		empwage.getTotalWage("Jio");
     }
}
