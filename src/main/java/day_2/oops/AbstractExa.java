package day_2.oops;

abstract class Gmail {
    abstract void inbox();

    abstract void sentItem();

    abstract void draft();

    abstract void spam();

    void demo() {
        System.out.println("This is Concrete Function");
    }
}

public class AbstractExa {
    public static void main(String[] args) {
        //we cant create object for abstract class
        Gmail dd = new Gmail();
    }


}