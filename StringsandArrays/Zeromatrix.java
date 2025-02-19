//Write a program such that if an element in an m*n matrix is 0,then the entire row and column is set to 0.
public class zeromatrix {

    public static void zeroMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return; // Edge case: empty matrix
        }

        int m = matrix.length;    // Number of rows
        int n = matrix[0].length; // Number of columns

        // Step 1: Initialize flags to track rows and columns to be zeroed
        boolean[] zeroRows = new boolean[m];
        boolean[] zeroCols = new boolean[n];

        // Step 2: Mark rows and columns that need to be zeroed
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true; // Mark row i
                    zeroCols[j] = true; // Mark column j
                }
            }
        }

        // Step 3: Zero out marked rows
        for (int i = 0; i < m; i++) {
            if (zeroRows[i]) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Step 4: Zero out marked columns
        for (int j = 0; j < n; j++) {
            if (zeroCols[j]) {
                for (int i = 0; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 0, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println("Original Matrix:");
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        zeroMatrix(matrix);

        System.out.println("\nMatrix after zeroing rows and columns:");
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
