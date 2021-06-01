package empWageBuilder;

public class EmpWageBuilderArray implements IComputeEmpWage {
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	private int numOfCompany = 0;
	private EmpWage[] companyEmpWageArray;
	
	public EmpWageBuilderArray() {
		companyEmpWageArray = new EmpWage[5];
	}
	
	public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
		companyEmpWageArray[numOfCompany] = new EmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
		numOfCompany++;
	}
	
	public void computeEmpWage() {
	for (int i =0; i < numOfCompany; i++) {
		companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
		System.out.println(companyEmpWageArray[i]);
	}	
	}
	private int computeEmpWage(EmpWage companyEmpWage) {
		//Variables
		int empHrs = 0; int totalEmpHrs = 0; int totalWorkingDays = 0;
		// computation
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
			totalEmpHrs += empHrs;
			System.out.println("Day#: "+totalWorkingDays+"Emp Hr: "+ empHrs);
		}
		return totalEmpHrs * companyEmpWage.empRatePerHour;
	}

	@Override
	public int getTotalWage(String company) {
		
		return 0;
	}
}