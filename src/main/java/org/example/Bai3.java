package org.example;

import java.util.Scanner;

public class Bai3 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Cau3(sc.nextInt(),sc.nextInt());
    }

    public static void Cau3(int a,int b)
    {
        if(a > 0 && b > 0)
        {
            int bcnn = (a*b)/GCD(a,b);
            int ucln = GCD(a,b);
            System.out.println("UCLN: " + ucln + " BCNN: " + bcnn);
        }

    }

    public static int GCD(int a, int b)
    {
        while (b != 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
