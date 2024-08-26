package com.introduction.cwh_07_practiceset01;

import java.util.Scanner;

public class CWH_07_PracticeSet01
{
    public static void main(String[] args)
    {
        System.out.println("Chapter 1 Practice Set");
        Scanner sc = new Scanner(System.in);
        // Ques 1
        //int a = 45 ;
        //int b = 54 ;
        //int c = 1 ;
        //int sum = a+b+c;
        //System.out.println(sum);
        // Ques 2
        // float sub1 = 45;
        // float sub2 = 95;
        // float sub3 = 48;
        // float cgpa = (sub1+sub2+sub3)/30;
        // System.out.println(cgpa);
        // Ques 3
        // System.out.println("What is your name ? : ");
        // String str = sc.nextLine();
        // System.out.println("Hello " + str + " have a good day");

        // Ques 4
        System.out.println("KMs to Miles");
        System.out.println("Enter in kms : ");
        float dis = sc.nextFloat() ;
        float tomiles = dis * 0.62137f ;
        System.out.println(dis+" km distance is "+tomiles+" in miles");

        // Ques 5
        // System.out.println("Is it num ? : ");
        // System.out.println(sc.hasNextInt());
    }
}
