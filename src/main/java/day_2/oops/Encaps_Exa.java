package day_2.oops;

class GLA {
    private void stu_Contact_Det() {
        System.out.println("GLA Student Contact Detail");
    }

    public void stu_Det() {
        stu_Contact_Det();
        System.out.println("GLA Student Detail");
    }
}

public class Encaps_Exa {
    public static void main(String[] args) {
        GLA gg = new GLA();
        //gg.stu_Contact_Det();
        gg.stu_Det();
    }
}