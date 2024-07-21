package org.example;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(Sum(sc.nextLine()));
    }
    public static int Sum(String a){
        int Sum = 0;
        char[] lst = a.toCharArray();
        for (int i = 0; i < lst.length; i++)
        {
            Sum += Integer.parseInt(String.valueOf(lst[i]));
        }
        return  Sum;
    }
}
