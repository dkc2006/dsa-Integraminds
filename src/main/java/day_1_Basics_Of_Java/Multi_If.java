package day_1_Basics_Of_Java;

import java.util.Scanner;
public class Multi_If {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Channel Number");
        int ch=sc.nextInt();  //1

        if(ch==1)
        {
            System.out.println("Channel 1");
        }

        if(ch==2)
        {
            System.out.println("Channel 2");
        }

        if(ch==3)
        {
            System.out.println("Channel 3");
        }

        System.out.println("Thank You...");


    }
}
