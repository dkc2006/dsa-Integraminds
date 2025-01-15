package day_2.arrays.multidimensionalArray;

public class TwoD_Array_1 {
    public static void main(String[] args) {
        int[] ar = new int[3];  // [0,0,0]
        ar[0] = 11;             //[11,0,0]

        //Syntax
        //DataType[][] VariableName=new DataType[Row Size][Column Size];

        int[][] mat = new int[2][3];    //   [0,0,0]
        //   [0,0,0]

        mat[0][0] = 1;                  //   [1,0,0]
        //   [0,0,0]

        mat[1][1] = 5;                  //   [1,0,0]
        //   [0,5,0]
    }
}
