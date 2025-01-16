package day_3.dynamic_Array;

import java.util.ArrayList;


public class ArryIstExa_4 {


    public static void main(String[] args) {
        int a = 11;
        Integer b = 11;

        int[] ar2 = {11, 22, 33, 44};

        for (int x : ar2) {
            System.out.println(x);
        }
        System.out.println("---------------");

        ArrayList ar = new ArrayList();

        ar.add(11);
        ar.add(22);
        ar.add(33);
        ar.add(44);
        ar.add(ar);

        for (Object x : ar) {
            System.out.println(x);
        }


    }


}

