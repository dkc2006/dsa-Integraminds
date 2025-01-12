package day_1_Basics_Of_Java;
import java.util.Scanner;

public class Input_Taking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

//        System.out.println("Enter A Value");
//        String a=sc.next();
//
//        System.out.println("Enter B Value");
//        String b=sc.next();
//
//
//        String c=a+b;
//
//        System.out.println(c);




        System.out.println("Enter A Value");
        int a=sc.nextInt();

        System.out.println("Enter B Value");
        int b=sc.nextInt();


        int c=a+b;

        System.out.println(c);
    }
}
