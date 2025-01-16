package oops;


public class Acc_Mod_Exa
{
    //default // protected
    int a=100;

    private int b=200;
    protected void prot_Fun()
    {
        System.out.println("Protected Function");
    }
    public void pub_Fun()
    {
        System.out.println("Public Function");
    }
    public static void main(String[] args)
    {
        Acc_Mod_Exa obj=new Acc_Mod_Exa();
        System.out.println(obj.b);
        obj.prot_Fun();
        obj.pub_Fun();
    }


}