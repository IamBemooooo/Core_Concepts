package org.example;

public class Bai8 {

    Bai9 b9 = new Bai9();
    public void b()
    {
        for(int i = 100000;i <= 999999;i++)
        {
            if(b9.CheckTN(i) && b9.CheckSum((i)))
            {
                System.out.println(i);
            }
        }
    }

    public void a()
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
