
public class Empwage_compute
{
     public final static int IS_PART_TIME = 1;
     public final static int IS_FULL_TIME = 2;
     
       public String company; 
       int Emp_Rate_Per_Hr ;
       int Num_Of_Working_Days;
       int Max_Hrs_In_Month;


public  Empwage_compute(String company,int Emp_Rate_Per_Hr, int Num_Of_Working_Days,int Max_Hrs_In_Month)

{ 
      this.company=company;
      this.Emp_Rate_Per_Hr=Emp_Rate_Per_Hr;
      this.Num_Of_Working_Days=Num_Of_Working_Days;
      this.Max_Hrs_In_Month=Max_Hrs_In_Month;
}

public void empcal()
{ 
int empHrs = 0 ;
int totalEmpHrs = 0 ;
int totalWorkingDays = 0;
int totalEmpWage=0;

        while (totalEmpHrs <= Max_Hrs_In_Month &&
              totalWorkingDays < Num_Of_Working_Days)
    {
           totalWorkingDays++;
           int empCheck = (int) Math.floor(Math.random() * 10) % 3;
           switch (empCheck){
           case IS_PART_TIME:
               empHrs = 4;
               break;
           case IS_FULL_TIME:
               empHrs = 8;
               break;
           default:
               empHrs = 0;
        }
        totalEmpHrs+= empHrs;
        System.out.println("Day: " + totalWorkingDays +"  "+ "Employee working hours:" + empHrs );
 }
     totalEmpWage = totalEmpHrs * Emp_Rate_Per_Hr;
     System.out.println("Total Employee Wage is "+ totalEmpWage);
}    

   public static void main(String args[])
   {
    Empwage_compute DM=new Empwage_compute("Dmart",14,15,66);
    Empwage_compute BG=new Empwage_compute("BigBasket",12,14,55);
    DM.empcal();
   BG.empcal();
    }
}