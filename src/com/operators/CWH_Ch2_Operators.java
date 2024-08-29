package com.operators;

public class CWH_Ch2_Operators
{
    public static void main(String[] args)
    {
        System.out.println("Operators are used to perform operations on variables or values");
        System.out.println("2 + 3 = 5, 2 and 3 are operands where + is operator");

        // Arithmetic Operator
        int a = 4 ;
        //int b = 6+a ;
        //System.out.println("b = "+b);

        // Modulo operator = gives remainder
        // int b = 6%a ; // give 2
        // System.out.println("b = "+b);

        // Assignment Operator
        int b = 9 ;
        b = b * 3 ;
        System.out.println("b = "+b);

        // Comparison Operator
        System.out.println(64>6);

        // Logical Operator
        System.out.println(64>5 && 64<8);   // both should be true for true result
        System.out.println(64>5 || 64<8);   // either one of them should be true for true result

        // Bitwise Operator
        System.out.println(2&3);

    }
}
