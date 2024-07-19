package org.example;

public class Bai5 {
    public int Sum(String a){
        int Sum = 0;
        char[] lst = a.toCharArray();
        for (int i = 0; i < lst.length; i++)
        {
            Sum += Integer.parseInt(String.valueOf(lst[i]));
        }
        return  Sum;
    }
}
