package org.example;

public class Bai1 {
    public int a(int a){
        int sum = 0;
            if (a % 2 != 0) {
                for(int j = 1; j <= a; j++)
                {
                    if (j % 2 != 0) {
                        sum = sum + j;
                    }
                }
            }
            else
            {
                for(int j = 2; j <= a; j++)
                {
                    if (j % 2 == 0) {
                        sum = sum + j;
                    }
                }
            }
        return sum;
    }

    public float b(int b){
        float sum = 0;
        for(int j = 1; j <= b; j++){
            sum = sum + ((float) 1 /j);
        }
        return sum;
    }
}
