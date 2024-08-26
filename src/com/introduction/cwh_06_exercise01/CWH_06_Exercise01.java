package com.introduction.cwh_06_exercise01;

import java.util.Scanner;

public class CWH_06_Exercise01
{
    public static void main(String[] args)
    {
        System.out.println("Calculate Percentage of an Student");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks for subject 1 = ");
        float sub1 = sc.nextFloat();
        System.out.print("Enter Marks for subject 2 = ");
        float sub2 = sc.nextFloat();
        System.out.print("Enter Marks for subject 3 = ");
        float sub3 = sc.nextFloat();
        System.out.print("Enter Marks for subject 4 = ");
        float sub4 = sc.nextFloat();
        System.out.print("Enter Marks for subject 5 = ");
        float sub5 = sc.nextFloat();

        float sum = sub1+sub2+sub3+sub4+sub5;
        float percentage = sum/5;

        System.out.println("Percentage = " + percentage);
    }
}
