package day_1_Basics_Of_Java;

import java.util.Scanner;

public class Conditionals_if_else {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age");
        int age=sc.nextInt();

        if(age>=18)
        {
            System.out.println("You Are Eligibel To Vote...");
        }
        else
        {
            System.out.println("You Are Not Eligibel To Vote...");
        }
        System.out.println("Thank you..");
    }
}
