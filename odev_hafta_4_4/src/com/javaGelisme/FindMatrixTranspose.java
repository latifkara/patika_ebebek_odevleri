package com.javaGelisme;

public class FindMatrixTranspose {
    // I have defined the matrix values.
    int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
    };
    int[][] matrixTranspose = new int[matrix[0].length][matrix.length];
    // I took the row and column values of the given
    // matrix and assigned it as the column and row of the new matrix.
    public void getMatrixTranspose(){
        System.out.println("Matris : ");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + "   ");
                matrixTranspose[j][i] = matrix[i][j];
            }
            System.out.println();
        }
    }
    // printing matrix values to the screen.
    public void print(){
        getMatrixTranspose();
        System.out.println("Transpoze : ");
        for (int[] transpose: matrixTranspose) {
            for (int number:transpose) {
                System.out.print(number + "   ");
            }
            System.out.println();
        }
    }

}
