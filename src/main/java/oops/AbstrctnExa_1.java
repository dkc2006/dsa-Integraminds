package oops;

class Student {
    int roll = 101;
    String name = "Rakesh";

    void stu_Result() {
        System.out.println("Studnt Result is PASS");
    }
}

public class AbstrctnExa_1 {
    public static void main(String[] args) {
        AbstrctnExa_1 aa = new AbstrctnExa_1();
        Student ab = aa.get_Student();
        ab.stu_Result();


    }

    Student get_Student() {
        int x = 90;
        String st = "India";
        Student stu = new Student();

        return new Student();
    }
}
