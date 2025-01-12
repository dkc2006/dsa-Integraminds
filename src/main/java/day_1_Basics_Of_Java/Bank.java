package day_1_Basics_Of_Java;
public class Bank {
    public static void main(String[] args) {
        Functions fn = new Functions();
        int x= fn.deposit(1400);  // submit
        System.out.println("Available Balance is "+x);
    }
}


//Java Memory[2]
//
//        --------------
//
//heap  [storage]   [out of Main Function]
//
//stack [Execution] [WIthin Main Function]
//
//        --------------------------------------------
//
//copy -> heap -> stack
//
//         |
//
//syntax
//
//          |
//
//className ObjectName=new ClassName(); //Object Creation
//
          |