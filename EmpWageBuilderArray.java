
package com.Bridgelabz;
import java.util.*;
import com.Bridgelabz.EmpWage;

public class EmpWageBuilderArray implements IComputeEmpWage {
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
//	private int numOfCompany = 0;
    private List<EmpWage> companyEmpWageList;
	
	public EmpWageBuilderArray() {

		companyEmpWageList = new ArrayList<>();
	}
	
	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		EmpWage companyEmpWage = new EmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
		
		companyEmpWageList.add(companyEmpWage);
	}
	
	public void computeEmpWage() {
	for (int i = 0; i < companyEmpWageList.size(); i++) {
		EmpWage companyEmpWage = companyEmpWageList.get(i);
		companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
		System.out.println(companyEmpWage);
		
	}

	}
	public int computeEmpWage(EmpWage companyEmpWage) {
		//Variables
		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
        int empDailyWage=0;

		while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
			totalWorkingDays++;
			int empCheck = (int) (Math.random()*3);
			switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			
            empDailyWage=empHrs*companyEmpWage.empRatePerHour;
			System.out.println("Daily Empwage is "+empDailyWage);

		}
		return empHrs * companyEmpWage.empRatePerHour;
	}

}
}