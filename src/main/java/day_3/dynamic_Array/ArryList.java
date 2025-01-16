package day_3.dynamic_Array;

import java.util.ArrayList;

public class ArryList {

    public static void main(String[] args) {

        Student st1 = new Student(101, "Rakesh");

        Student st2 = new Student(102, "Ravi");

        Student st3 = new Student(103, "Arun");

        ArrayList<Student> ar = new ArrayList();


        ar.add(st1);

        ar.add(st2);

        ar.add(st3);


        System.out.println(ar);


        ar.get(1).print();


    }

}

