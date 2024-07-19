package org.example;

public class Bai6 {
    public String PT(int a){
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
