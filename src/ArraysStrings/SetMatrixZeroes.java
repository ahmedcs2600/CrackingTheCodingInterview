package ArraysStrings;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        //setZeroes();
    }

    public static void setZeroes(int[][] matrix) {

        int rowSize = matrix.length;
        int colSize = matrix[0].length;


        boolean row_flag = false;
        boolean col_flag = false;


        for(int row = 0 ; row < rowSize ; row++) {
            for(int col = 0 ; col < colSize ; col++) {

                if (row == 0 && matrix[row][col] == 0) row_flag = true;

                if(col == 0 && matrix[row][col] == 0) col_flag = true;

                if(matrix[row][col] == 0) {
                    matrix[row][0] = matrix[0][col] = 0;
                }
            }
        }


        for(int row = 1; row < rowSize; row++) {
            for(int col = 1; col < colSize; col++) {

                if(matrix[0][col] == 0 || matrix[row][0] == 0) {
                    matrix[row][col] = 0;
                }
            }
        }


        if (row_flag == true) {
            for (int i = 0; i < matrix[0].length; i++){
                matrix[0][i] = 0;
            }
        }

        // modify first col if there was any 1
        if (col_flag == true) {
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
