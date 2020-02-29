package com.company;

public class LucasSeries implements ISubscriber{

    @Override
    public void notifySubscriber(String input) {
        int n = Integer.parseInt(input);
        for(int i=1;i<=n;i++)
        {
            System.out.println(printSeries(i));
        }

    }
    public int printSeries(int input)
    {
        if(input==1||input==0)
        {
            return 2;
        }
        if(input==2)
        {
            return 1;
        }
        return printSeries(input-1)+printSeries(input-2);
    }
}
