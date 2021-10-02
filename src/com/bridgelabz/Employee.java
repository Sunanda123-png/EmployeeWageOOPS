package com.bridgelabz;

/**
 * author:-Sunanda
 */

public class Employee {
    private final static int IS_FULL_TIME = 1, PART_TIME = 2;
    /**
     * Purpose - checks whether an Employee is present or absent
     *
     */
    public static int computeEmpWages(String company,int Wages_per_hr,int numofTotal_Working_days,int Total_Working_hr)
    {
        int empHrs=0, totalEmphrs=0,totalWorkingDays=0;        //variables
        //int Working_hr_perday;
        int empCheck = (int)Math.floor(Math.random()*10)%3;
        while (totalEmphrs<Total_Working_hr && totalWorkingDays<numofTotal_Working_days) //condition given
        {
            totalWorkingDays++;
            switch (empCheck)
            {
                case IS_FULL_TIME:
                    System.out.println("Employee is present");
                    empHrs=8;
                    break;

                case PART_TIME:
                    System.out.println("Employee is part time present");
                    empHrs=4;
                    break;

                default:
                    System.out.println("Employee is not present");
                    empHrs=0;

            }
            totalEmphrs+=empHrs;
            System.out.println("Day:"+totalWorkingDays+ "Emp Hr:" +empHrs);
        }
        int TotalEmpWages=totalEmphrs*Wages_per_hr;//calculation
        System.out.println("Total Employee wages of the company is:-"+company+"is:"+ TotalEmpWages);
        return TotalEmpWages;
    }
}
class Final
{
    public static void main(String[] args)
    {
        Employee employeeWage=new Employee();
        employeeWage.computeEmpWages("Dmart",20,20,10);
        employeeWage.computeEmpWages("Amazon",30,18,20);
    }
}
