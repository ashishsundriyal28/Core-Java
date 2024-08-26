package com.introduction.cwh_05_takinguserinput;
// imported file
import java.util.Scanner;

public class CWH_05_TakingUserInput
{
    public static void main(String[] args)
    {
        // In order to take input from the user will use Scanner class
        System.out.println("Taking input from the user");

        // sc is Scanner class's object
        // writing System.in means taking input from the keyboard
        Scanner sc = new Scanner(System.in);
        /*
        System.out.println("Enter number 1 = ");
        // int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("Enter number 2 = ");
        // int b = sc.nextInt();
        float b = sc.nextFloat();
        // int sum = a + b ;
        float sum = a + b ;
        System.out.println("Sum = " + sum);
        */

        // this is to check whether the number entered by user is Int or not
        // boolean b1 = sc.hasNextInt();
        // System.out.println(b1);

        /*
        // next reads till there comes a space
        String str = sc.next();
        System.out.println(str);
        // Input : ashish is a good boy
        // Output: ashish
        */

        // to read a full string use nextLine()
        String complete_str = sc.nextLine();
        System.out.println(complete_str);
        // Input : ashish is a good boy
        // Output: ashish is a good boy
    }
}
