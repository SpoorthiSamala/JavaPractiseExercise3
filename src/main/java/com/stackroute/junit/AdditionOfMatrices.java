package com.stackroute.junit;

public class AdditionOfMatrices //addition of the two given matrices
{
    public static int[][] additionOfTwoMatrices(int rows, int columns, int[][] matrix1, int[][] matrix2) {
        int[][] output = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                output[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return output;
    }
}
