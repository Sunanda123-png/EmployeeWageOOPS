package com.bridgelabz;

public class Employee {
    private final static int IS_FULL_TIME = 1;
    /**
     * Purpose - checks whether an Employee is present or absent
     */
    public void calculation()
    {
        double empCheck = Math.floor(Math.random()*10)%2;
        if (empCheck==IS_FULL_TIME)
        {
            System.out.println("Employee is present");
        }
        else
        {
            System.out.println("Employee is not present");
        }
    }
}
class PresentAbsent
{
    public static void main(String[] args)
    {
        Employee e=new Employee();
        e.calculation();

    }
}
