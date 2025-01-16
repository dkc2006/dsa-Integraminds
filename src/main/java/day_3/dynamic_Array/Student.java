package day_3.dynamic_Array;

public class Student {
    int roll;
    String name;

    Student(int r, String n) {
        roll = r;
        name = n;
    }

    public static void main(String[] args) {
        Student st = new Student(101, "Rakesh");
        st.print();
    }

    public void print() {
        System.out.println("Student Roll : " + roll);
        System.out.println("Student Name : " + name);
    }


}