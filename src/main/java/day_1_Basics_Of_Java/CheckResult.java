package day_1_Basics_Of_Java;

import java.util.Scanner;
public class CheckResult {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter English Mark");
        int e=sc.nextInt();


        System.out.println("Enter Maths Mark");
        int m=sc.nextInt();


        System.out.println("Enter Science Mark");
        int s=sc.nextInt();


        System.out.println("Enter History Mark");
        int h=sc.nextInt();


        System.out.println("Enter Telugu Mark");
        int t=sc.nextInt();

        if(t>=35 && e>=35 && m>=35 && s>=35 && h>=35)
        {
            System.out.println("Result is Pass");
        }
        else
        {
            System.out.println("Result is Fail");
        }

        int tot=t+e+m+s+h;
        int avg=tot/5;

        System.out.println("Total MArk is : "+tot);
        System.out.println("Average Mark is : "+avg);


    }
}
