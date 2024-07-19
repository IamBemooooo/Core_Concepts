package org.example;

public class Bai7 {

    public void Cau7()
    {
        for(int i = 100000; i <= 999999; i++)
        {
            if(checkAll(i) && checkSNT(i))
            {
                System.out.println(i);
            }
        }
    }

    public boolean checkSNT(int a){
        if(a >= 2)
        {
            for (int i =2; i< a;i++)
            {
                if(a % i == 0)
                {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean checkAll(int a)
    {
        while(a !=0 )
        {
            int digit = a % 10;
            if(digit %2 == 0)
            {
                return false;
            }
            a = a / 10;
        }
        return true;
    }
}
