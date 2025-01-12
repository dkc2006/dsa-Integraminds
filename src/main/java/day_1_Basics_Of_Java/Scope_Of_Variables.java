package day_1_Basics_Of_Java;

public class Scope_Of_Variables {
    int gv=100;
    void sampFnc()
    {
        int lv=50;
        System.out.println(gv);
        System.out.println(lv);
    }
    void demo()
    {
        System.out.println(gv);
//        System.out.println(lv);
    }
    public static void main(String[] args) {
        int x=90;
        Scope_Of_Variables ss=new Scope_Of_Variables();
        System.out.println(ss.gv);

    }
}
