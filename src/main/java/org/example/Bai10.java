package org.example;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Cau10();

    }
    public static void Cau10()
    {
        for(int i = 1000000; i <= 9999999; i++ )
        {
            if(checkAll(i) && checkSNT(i) && CheckReverse(i))
            {
                System.out.println(i);
            }
        }
        /*for(int i = -9999999; i <= -1000000; i++ )
        {
            if(checkAll(i) && checkSNT(i) && CheckReverse(i))
            {
                System.out.println(i);
            }
        }*/
    }

    public static boolean checkSNT(int a){
        if(a >= 2)
        {
            for (int i =2; i< a;i++)
            {
                if(a % i == 0)
                {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean checkAll(int a)
    {
        while(a !=0 )
        {
            int digit = a % 10;
            if(!checkSNT(digit))
            {
                return false;
            }
            a = a / 10;
        }
        return true;
    }

    public static boolean CheckReverse(int a)
    {
        int b = 0;
        while (a != 0) {
            int digit = a % 10;
            b = b * 10 + digit;
            a /= 10;
        }
        return checkSNT(b);
    }
}
