package day_1_Basics_Of_Java;

public class Functions {
    //code reusability
//    static void address() {
//        System.out.println("Rakesh");
//        System.out.println("No 32");
//        System.out.println("Abc Street");
//        System.out.println("Chennai");
//        System.out.println("------------");
//    }

    int avail_bal = 5600;

    public static void main(String[] args) {
//        address();
//        address();
        Functions fn = new Functions();
        int x= fn.deposit(1400);  // submit
        System.out.println("Available Balance is "+x);
    }

    int deposit(int deposit_Amt) {
        avail_bal = avail_bal + deposit_Amt;
        //System.out.println("Available Balance is "+avail_bal);

        return avail_bal;
    }

}
