package org.example;public class Bai2 {

    public void Cau2(int n)
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
