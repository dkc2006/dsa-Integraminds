package day_2.oops;

public class AccessModifierExa {
    //default // protected
    int a = 100;

    private final int b = 200;

    public static void main(String[] args) {
        AccessModifierExa obj = new AccessModifierExa();
        System.out.println(obj.b);
        obj.prot_Fun();
        obj.pub_Fun();
    }

    protected void prot_Fun() {
        System.out.println("Protected Function");
    }

    public void pub_Fun() {
        System.out.println("Public Function");
    }

}
