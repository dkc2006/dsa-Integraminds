package day_3.dynamic_Array;

public class Count_Factors_Optimized {
    public static void main(String[] args) {
        int N = 36;

        int count = 0;
        for (int i = 1; i * i <= N; i++)   //Root N
        {
            if (N % i == 0) {
                if (N == i * i) count++;
                else count += 2;
            }

        }

        System.out.println(count);


    }


}