package org.example;

import java.util.Scanner;

public class Bai4 {
    static Bai3 b3 = new Bai3();
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Cau4(sc.nextInt(),sc.nextInt());
    }

    public static void Cau4(int a,int b)
    {
        if(a > b)
        {
            System.out.println("khong ho le");
            return;
        }

        for(int i=a;i<=b;i++)
        {
            for(int j= a+1;j<=b;j++)
            {
                if(b3.GCD(i,j) == 1)
                {
                    System.out.println(i+" "+j);
                }
            }
        }

    }
}
