package com.literals;

public class CWH_04_literals
{
    // Ques. What is a literal ?
    // Ans. A constant value which can be assigned to the variable is called as a literal
    public static void main(String[] args)
    {
        byte age = 34;
        System.out.println("Byte Literal = " + age);

        int age2 = 56;
        System.out.println("Int Literal = " + age2);

        short age3 = 6456;
        System.out.println("short Literal = " + age3);

        // Java convention = character literal is written in single-quotes
        char ch = 'A';
        System.out.println("Char Literal = " + ch);

        // Java convention = float literal is written with an f (or F) to identify it as float
        // because default decimal type is double
        // that's why, we write a `f` to clarify it as float
        float f1 = 5.6f;
        System.out.println("Float Literal = " + f1);

        // Java convention = double literal can or cannot be written with a d (or D)
        // as default decimal type is double
        double d1 = 7.8f;
        System.out.println("Double Literal = " + d1);

        // Java convention = long literal must be written with a l (or L, whichever according to Java version)
        // as default decimal type is double
        long l1 = 78888888888888888L;
        System.out.println("Long Literal = " + l1);

        boolean b = true;
        System.out.println("Boolean = " + b);

        // Java convention = String literal is written in double-quotes
        String a = "Ashish";
        System.out.println("String Literal = " + a);

    }
}
