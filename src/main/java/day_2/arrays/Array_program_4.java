package day_2.arrays;

import java.util.Scanner;

public class Array_program_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] pets = new String[3];

        System.out.println("Print Any 3 Pets Names");
        pets[0] = sc.next();
        pets[1] = sc.next();
        pets[2] = sc.next();

        System.out.println("Your Pets Names Are ");
        System.out.println("--------------------");
        System.out.println(pets[0]);
        System.out.println(pets[1]);
        System.out.println(pets[2]);
    }
}
