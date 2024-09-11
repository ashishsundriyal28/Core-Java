package com.operators;

public class CWH_09_Ch2_Precedence_Associativity
{
    public static void main(String[] args)
    {
        System.out.println("********* Operators Precedence and Associativity **************");
        int a = 6*5-34/2;
        /*
        * highest precedence goes to * and /.
        * Then they are evaluated on the basis of left-to-right associativity.
        * 
        * a = (6*5) - 34/2
        *   = 30 - 34/2
        *   = 30 - 17
        *   = 13
        */
        System.out.println(a);
        int b = 60/5-34*2;
        /*
         * b = (60/5) - 34*2
         *   = 12 - 68
         *   = -56
         * */
        System.out.println(b);
    }

}
