package org.example;

public class Bai10 {
    public void Cau10()
    {
        for(int i = 1000000; i <= 9999999; i++ )
        {
            if(checkAll(i) && checkSNT(i) && CheckReverse(i))
            {
                System.out.println(i);
            }
        }
        /*for(int i = -9999999; i <= -1000000; i++ )
        {
            if(checkAll(i) && checkSNT(i) && CheckReverse(i))
            {
                System.out.println(i);
            }
        }*/
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
            if(!checkSNT(digit))
            {
                return false;
            }
            a = a / 10;
        }
        return true;
    }

    public boolean CheckReverse(int a)
    {
        int b = 0;
        while (a != 0) {
            int digit = a % 10;
            b = b * 10 + digit;
            a /= 10;
        }
        return checkSNT(b);
    }
}
