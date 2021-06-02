package com.Bridgelabz;

interface IComputeEmpWage {
    public void addCompanyEmpWage(String company, int empRatePerHour, int NumOfWorkingDays, int maxHoursPerMonth);
    public void computeEmpWage();
    public int getTotalWage(String company);

}
