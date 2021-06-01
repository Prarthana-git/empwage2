public class CompanyEmpWage
{
 public String company; 
 public  int Emp_Rate_Per_Hr ;
 public  int Num_Of_Working_Days;
 public  int Max_Hrs_In_Month;
 public int totalEmpwage;

public CompanyEmpWage(String company,int Emp_Rate_Per_Hr,int Num_Of_Working_Days,int Max_Hrs_In_Month )
{
   this.company=company;
   this.Emp_Rate_Per_Hr=Emp_Rate_Per_Hr;
   this.Num_Of_Working_Days=Num_Of_Working_Days;
   this.Max_Hrs_In_Month=Max_Hrs_In_Month;
}

public void setTotalEmpWage(int totalEmpWage)
{
this.totalEmpWage=totalEmpWage;
}
public String toString()
{
  return"Total Emp Wage for Company"+company+"is"+totalEmpwage;
 }
}