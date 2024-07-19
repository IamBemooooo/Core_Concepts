package org.example;

public class Bai3 {

    public void Cau3(int a,int b)
    {
        if(a > 0 && b > 0)
        {
            int bcnn = (a*b)/GCD(a,b);
            int ucln = GCD(a,b);
            System.out.println("UCLN: " + ucln + " BCNN: " + bcnn);
        }

    }

    public int GCD(int a, int b)
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
