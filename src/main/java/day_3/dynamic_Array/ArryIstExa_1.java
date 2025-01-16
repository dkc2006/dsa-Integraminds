package day_3.dynamic_Array;


import java.util.ArrayList;


public class ArryIstExa_1 {
    public static void main(String[] args) {


        ArrayList ar = new ArrayList();
        ar.add(11);
        ar.add("GLA");
        ar.add(54.78);

        System.out.println(ar);
        System.out.println(ar.size());

        ar.add("India");

        System.out.println(ar);
        System.out.println(ar.size());

        ar.add(2, "Chennai");

        System.out.println(ar);
        System.out.println(ar.size());

        ar.remove("Chennai");

        System.out.println(ar);
        System.out.println(ar.size());

        System.out.println(ar.get(3));
        System.out.println(ar.indexOf("India"));


    }


}