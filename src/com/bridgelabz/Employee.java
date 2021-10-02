package com.bridgelabz;

/**
 * author:-Sunanda
 */

public class Employee {
    public static final int IS_FULL_TIME = 1,PART_TIME =2;
    private final String company;
    private final int Wages_per_hr;
    private final int numofTotal_Working_days;
    private final int Total_Working_hr;
    private int TotalEmpWages;

    public Employee(String company,int Wages_per_hr,int numofTotal_Working_days,int Total_Working_hr)
    {
        this.company=company;
        this.Wages_per_hr=Wages_per_hr;
        this.numofTotal_Working_days=numofTotal_Working_days;
        this.Total_Working_hr=Total_Working_hr;
    }
    /**
     * Purpose - checks whether an Employee is present or absent
     *
     */

    public void computeEmpWages()
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
        TotalEmpWages=totalEmphrs*Wages_per_hr;//calculation

    }
    public String toString()
    {
        return "Total Employee wages of the company is:-"+company+"is:"+ TotalEmpWages;
    }
}
class Final
{
    public static void main(String[] args)
    {
        Employee dmart=new Employee("dmart", 20, 20, 10);
        Employee amazon=new Employee("Amazon", 30, 18, 10);
        dmart.computeEmpWages();
        System.out.println(dmart);
        amazon.computeEmpWages();
        System.out.println(amazon);
    }
}
