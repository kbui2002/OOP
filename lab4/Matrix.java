package lab4;

import java.util.Scanner;

/**
 * 1.1 matrix
 */
public class Matrix {
    // Print the matrix
    public static void print(int[][] matrix) { // For Integer Matrix
        if (matrix == null) {
            System.out.println("ERROR!!");
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void print(double[][] matrix) { // For Double Matrix
        if (matrix == null) {
            System.out.println("ERROR!!");
        } else {
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.printf("%.2f ", matrix[i][j]);
                }
            }
            System.out.println();
        }
    }

    // Check two matrix is the same or not
    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2) {// For Integer Matrix
        if (matrix1 == null || matrix2 == null || matrix1.length != matrix2.length)
            return false;

        for (int i = 0; i < matrix1.length; i++) {
            if (matrix1[i].length != matrix2[i].length)
                return false;
        }

        return true;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2) {// For Double Matrix
        if (matrix1 == null || matrix2 == null || matrix1.length != matrix2.length)
            return false;

        for (int i = 0; i < matrix1.length; i++) {
            if (matrix1[i].length != matrix2[i].length)
                return false;
        }

        return true;
    }

    public static boolean haveAllowedDimension(int[][] matrix1, int[][] matrix2) {
        // check first matrix dimension
        int maxLengthM1 = 0;
        for (int[] a : matrix1) {
            maxLengthM1 = (maxLengthM1 <= a.length) ? a.length : maxLengthM1;
        }
        for (int[] a : matrix1) {
            if (maxLengthM1 == a.length) {
                continue;
            }
            return false;
        }

        // check first matrix dimension
        int maxLengthM2 = 0;
        for (int[] b : matrix2) {
            maxLengthM2 = (maxLengthM2 <= b.length) ? b.length : maxLengthM2;
        }
        for (int[] b : matrix2) {
            if (maxLengthM2 == b.length) {
                continue;
            }
            return false;
        }

        // check dimension
        return matrix1[0].length == matrix2.length;
    }

    public static boolean haveAllowedDimension(double[][] matrix1, double[][] matrix2) {
        // check first matrix dimension
        int maxLengthM1 = 0;
        for (double[] a : matrix1) {
            maxLengthM1 = (maxLengthM1 <= a.length) ? a.length : maxLengthM1;
        }
        for (double[] a : matrix1) {
            if (maxLengthM1 == a.length) {
                continue;
            }
            return false;
        }

        // check first matrix dimension
        int maxLengthM2 = 0;
        for (double[] b : matrix2) {
            maxLengthM2 = (maxLengthM2 <= b.length) ? b.length : maxLengthM2;
        }
        for (double[] b : matrix2) {
            if (maxLengthM2 == b.length) {
                continue;
            }
            return false;
        }

        // check dimension
        return matrix1[0].length == matrix2.length;
    }

    // add two matrix
    public static int[][] add(int[][] matrix1, int[][] matrix2) { // For Integer Matrix
        if (haveSameDimension(matrix1, matrix2)) {
            int[][] resultMatrix = new int[matrix1.length][matrix1[0].length];
            for (int i = 0; i < resultMatrix.length; i++) {
                for (int j = 0; j < resultMatrix[i].length; j++) {
                    resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            return resultMatrix;
        }
        return null;
    }

    public static double[][] add(double[][] matrix1, double[][] matrix2) { // For Double Matrix
        if (haveSameDimension(matrix1, matrix2)) {
            double[][] resultMatrix = new double[matrix1.length][matrix2[0].length];
            for (int i = 0; i < resultMatrix.length; i++) {
                for (int j = 0; j < resultMatrix[i].length; j++) {
                    resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            return resultMatrix;
        }
        return null;
    }

    // subtract two matrix
    public static int[][] subtract(int[][] matrix1, int[][] matrix2) { // For Integer Matrix
        if (haveSameDimension(matrix1, matrix2)) {
            int[][] resultMatrix = new int[matrix1.length][matrix2[0].length];
            for (int i = 0; i < resultMatrix.length; i++) {
                for (int j = 0; j < resultMatrix[i].length; j++) {
                    resultMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
            return resultMatrix;
        }
        return null;
    }

    public static double[][] subtract(double[][] matrix1, double[][] matrix2) { // For Double Matrix
        if (haveSameDimension(matrix1, matrix2)) {
            double[][] resultMatrix = new double[matrix1.length][matrix1[0].length];
            for (int i = 0; i < resultMatrix.length; i++) {
                for (int j = 0; j < resultMatrix[i].length; j++) {
                    resultMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
                }
            }
            return resultMatrix;
        }
        return null;
    }

    //
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) { // For Integer Matrix
        if (haveAllowedDimension(matrix1, matrix2) && matrix1.length == matrix2[0].length) {
            int[][] resultMatrix = new int[matrix1.length][matrix2[0].length];
            for (int i = 0; i < resultMatrix.length; i++) {
                for (int j = 0; j < resultMatrix[i].length; j++) {
                    resultMatrix[i][j] = 0;
                    for (int k = 0; k < matrix1.length; k++) {
                        resultMatrix[i][j] += (matrix1[i][k] * matrix2[j][k]);
                    }
                }
            }
            return resultMatrix;
        }
        return null;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2) { // For Double Matrix
        if (haveAllowedDimension(matrix1, matrix2) && matrix1.length == matrix2[0].length) {
            double[][] resultMatrix = new double[matrix1.length][matrix2[0].length];
            for (int i = 0; i < resultMatrix.length; i++) {
                for (int j = 0; j < resultMatrix[i].length; j++) {
                    resultMatrix[i][j] = 0;
                    for (int k = 0; k < matrix1.length; k++) {
                        resultMatrix[i][j] += (matrix1[i][k] * matrix2[j][k]);
                    }
                }
            }
            return resultMatrix;
        }
        return null;
    }

    // input matrix
    public static int[][] inputInt() { // Input int matrix
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of matrix (separated by space): ");
        int m = in.nextInt();
        int n = in.nextInt();

        int[][] array = new int[m][n];

        System.out.print("Enter matrix (separated by space): ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = in.nextInt();
            }
        }

        return array;
    }

    public static double[][] inputDouble() { // Input Double matrix
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of matrix (separated by space): ");
        int m = in.nextInt();
        int n = in.nextInt();

        double[][] array = new double[m][n];

        System.out.print("Enter matrix (separated by space): ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = in.nextDouble();
            }
        }

        return array;
    }

    // Print result
    public static void printResult(int[][] matrix1, int[][] matrix2) {
        System.out.println("Matrix 1:");
        Matrix.print(matrix1);
        System.out.println("Matrix 2:");
        Matrix.print(matrix2);

        System.out.println("Have same dimension: " + Matrix.haveSameDimension(matrix1, matrix2));
        System.out.println("Matrix after add:");
        int[][] matrixAdd = Matrix.add(matrix1, matrix2);
        Matrix.print(matrixAdd);

        System.out.println("Matrix after subtract:");
        int[][] matrixSub = Matrix.subtract(matrix1, matrix2);
        Matrix.print(matrixSub);

        System.out.println("Matrix after multiply:");
        int[][] matrixMul = Matrix.multiply(matrix1, matrix2);
        Matrix.print(matrixMul);
    }

    // MAIN METHOD
    public static void main(String[] args) {
        int[][] array1 = inputInt();
        int[][] array2 = inputInt();

        printResult(array1, array2);

    }
}