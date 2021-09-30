package com.bridgelabz;

/**
 * author:-Sunanda
 */

public class Employee {
    private final static int IS_FULL_TIME = 1;
    private final static int PART_TIME = 2;
    private final static int Fullday_hr = 8,PART_TIME_hr = 4;
    private final static int Wages_per_hr=20;


    /**
     * Purpose - checks whether an Employee is present or absent
     *
     */
    public int switch_Case()
    {
        int Working_hr_perday;
        int empCheck = (int)Math.floor(Math.random()*10)%3;
        switch (empCheck)
        {
            case IS_FULL_TIME:
                System.out.println("Employee is present");
                Working_hr_perday=Fullday_hr;
                break;

            case PART_TIME:
                System.out.println("Employee is part time present");
                Working_hr_perday=PART_TIME_hr;
                break;

            default:
                System.out.println("Employee is not present");
                Working_hr_perday=0;

        }
        return Working_hr_perday;
    }

    /**
     * calculation of daily wages
     * @param Working_hr_perday
     * @return
     */
    public int daily_employee_wage(int Working_hr_perday)
    {

        int daily_employee_wage=Wages_per_hr*Working_hr_perday;
        System.out.println("Daily wages of the employee is:-"+daily_employee_wage);
        return daily_employee_wage;
    }

    /**
     * execution of all method
     * @param args
     */
    public static void main(String[] args)
    {
        Employee employeeWage=new Employee();
        int Working_hr_perday=employeeWage.switch_Case();
        employeeWage.daily_employee_wage(Working_hr_perday);
    }
}

