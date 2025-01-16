package demo;


import oops.Acc_Mod_Exa;


public class DemoCls
{
    public static void main(String[] args)
    {
        Acc_Mod_Exa obj=new Acc_Mod_Exa();
        System.out.println(obj.b);
        obj.prot_Fun();
        obj.pub_Fun();


    }
}