package com.bridgelabz;

import javax.swing.*;

public class EmployeeWage {

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage ");

        int IS_FULL_TIME = 1;

        int empCheck = (int) (Math.floor (Math.random () * 10) % 2);

        if(empCheck == IS_FULL_TIME)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is Absent");
    }

}
