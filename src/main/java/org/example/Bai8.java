package org.example;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args)
    {
        a();
        b();

    }
     static Bai9 b9 = new Bai9();
    public static void b()
    {
        for(int i = 100000;i <= 999999;i++)
        {
            if(b9.CheckTN(i) && b9.CheckSum((i)))
            {
                System.out.println(i);
            }
        }
    }

    public static void a()
    {
        for(int i = 100000;i <= 999999;i++)
        {
            if(b9.CheckTN(i))
            {
                System.out.println(i);
            }
        }
    }

}
