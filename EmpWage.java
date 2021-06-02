
package com.Bridgelabz;

public class EmpWage {
	private static String[] args;
	public String company;
	public int empRatePerHour;
	public int numOfWorkingDays;
	public int maxHoursPerMonth;
	public int totalEmpWage;

	public EmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		this.company = company;
		this.empRatePerHour = empRatePerHour;
		this.numOfWorkingDays = numOfWorkingDays;
		this.maxHoursPerMonth = maxHoursPerMonth;
	}

	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}

	public String getCompany() {
		return companyName;
	}

	public int getEmpRatePerHour() {
		return empRatePerHr;
	}

	public int getnumOfWorkingDays() {
		return numOfWorkingDaysy;
	}

	public int getmaxHoursPerMonth() {
		return maxHoursPerMonth;
	}

	@Override
		public String toString() {
			return "Total Emp Wage for company: "+company+" is: "+totalEmpWage;
		}

	public static void main(String[] args) {

			EmpWageBuilderArray empWageBuilder = new EmpWageBuilderArray();
			  while (true) {

		            System.out.println("Please Enter your choice to show Company Monthly Total Wage ");
		            System.out.println("1:For Dmart");
		            System.out.println("2:For Reliance ");
		           

		            Scanner sobj = new Scanner(System.in);
		            int choice = sobj.nextInt();
		            switch (choice) {
		                case 1:
			                   empWageBuilder.addCompanyEmpWage("Dmart", 20, 2, 10);
			                   empWageBuilder.computeEmpWage();
			                   break;
		                case 2:
			                   empWageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
			                   empWageBuilder.computeEmpWage();
			                   break;
		                case 3:
		                    System.exit(0);
		                default:
		                    System.out.println("Invalid Choice");
		                    System.exit(0);
		}
}