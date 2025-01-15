package day_2.arrays.multidimensionalArray;

public class TwoD_Array_3 {
    public static void main(String[] args) {
        String[][] contact = {{"Jeshwin", "111", "Salem"}, {"Vimal", "222", "Chennai"}, {"Harish", "333", "Mumbai"}};

        int row = contact.length;
        int col = contact[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(contact[i][j] + "  ");
            }
            System.out.println();
        }

    }

}
