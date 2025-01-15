package day_2;

public class Nested_For {
    public static void main(String[] args) {
        int index;
        for (index = 0; index <= 3; index++) {
            int j;
            for (j = 0; j <= 3; j++) {
                System.out.println(index);
            }
            System.out.println(); // Print a blank line after each inner loop iteration
        }
    }
}


//int k=1;
//int i;
// for(i=1;i<=4;i++)
//        {
//int j;
// for(j=1;j<=i;j++)
//        {
//        System.out.print(k);
//k++;
//        }
//        System.out.println();
//		   }
//
