package oops.demo;

public class DemoCls
{
    public static void main(String[] args)
    {
        AccessModifierExa obj=new AccessModifierExa();
        System.out.println(obj.b);
        obj.prot_Fun();
        obj.pub_Fun();
    }
}