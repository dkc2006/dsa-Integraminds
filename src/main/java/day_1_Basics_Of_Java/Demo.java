package day_1_Basics_Of_Java;

public class Demo {
    public static void main(String[] args) {
        //stack

        Demo dd = new Demo();
        dd.add();
        dd.address();


    }

    //heap
    void address() {
        System.out.println("Rakesh");
        System.out.println("No 32");
        System.out.println("Abc Street");
        System.out.println("Chennai");
        System.out.println("------------");
    }

    void add() {
        int a = 11, b = 22;
        int c = a + b;
        System.out.println("Add Ans is : " + c);
    }
}