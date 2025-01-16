package day_3.dynamic_Array;

public class Count_Factors
{
    public static void main(String[] args)
    {
        int N=10^18;

        int count=0;
        for(int i=1;i<=N;i++)    //
        {
            if(N%i==0)
                count++;
        }

        System.out.println(count);

    }
}