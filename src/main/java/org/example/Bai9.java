package org.example;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args)
    {
        Cau9();

    }
    public static void Cau9()
    {
        for(int i = 1000000;i <= 999999999;i++)
        {
            if(CheckTN(i) && CheckInclude(i) && CheckSum(i))
            {
                System.out.println(i);
            }
        }
    }

    public static boolean CheckTN(int a){
        int b = 0;
        int c = a;

        while (a != 0) {
            int digit = a % 10;
            b = b * 10 + digit;
            a /= 10;
        }

        return (b == c)? true : false;
    }

    public static boolean CheckInclude(int a)
    {
        while (a != 0){
            int b = a % 10;
            a = a / 10;
            if(b != 6 && b!= 8 && b!=0){
                return false;
            }
        }
        return true;
    }

    public static boolean CheckSum(int a){
        int sum = 0;
        while (a != 0)
        {
            int b = a % 10;
            sum += b;
            a /= 10;
        }
        return (sum % 10 ==0)? true : false;
    }
}
