package org.example;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Cau2(sc.nextInt());
    }

    public static void Cau2(int n)
    {
        System.out.println("Các ước số của " + n + " là:");
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Số lượng Ước:" + count);
    }
}
