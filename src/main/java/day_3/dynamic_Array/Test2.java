package day_3.dynamic_Array;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
//            10
        }

        for (int i = 1; i <= N; i++) {
//            N
        }

        for (int i = 1; i < N; i++) {
//            N-1
        }

        for (int i = 1; i <= N; i += 2) {
//            N/2
        }

        //N=100 [1 2 4 16 32 64]
        for (int i = 1; i <= N; i *= 2) {
//            Log N
        }


        for (int i = N; i >= 1; i /= 2) {
//            Log N
        }

        //N=36
        for (int i = 1; i * i <= N; i++) {
//            Root N
        }
    }


}

