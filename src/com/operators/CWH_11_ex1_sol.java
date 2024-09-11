package com.operators;

import java.util.Scanner;

public class CWH_11_ex1_sol
{
    public static void main(String[] args)
    {
        float total_marks = 100;
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
        float percentage = (sum*100)/(total_marks*5);

        System.out.println("Percentage = " + percentage);
    }
}
