package com.operators;

import java.util.Scanner;

public class CWH_12_ps2
{
    public static void main(String[] args) {
        System.out.println("Ques1 - result of set 7/4*9/2");
        System.out.println((float)(7/4*9/2));

        System.out.println("Ques2 encrypt a char");
        char grade = 'B';
        grade = (char)(grade+8);
        System.out.println(grade);
        grade = (char)(grade-8);
        System.out.println(grade);
        System.out.println("Ques3 check user entered no is greator or not");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a>0)
            System.out.println("+ve");
        else
            System.out.println("-ve");
    }
}
