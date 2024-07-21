package org.example;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(PT(sc.nextInt()));
    }
    public static String PT(int a){
        String str = a + "=";
        for (int b = 2; b <= a; b++)
        {
            if (a % b == 0)
            {
                str += b + "x";
                a = a / b;
                b = 1;
            }
        }
        return str;
    }
}
