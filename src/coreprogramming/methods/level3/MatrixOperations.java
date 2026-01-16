package coreprogramming.methods.level3;

public class MatrixOperations {
    public static double[][] createRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = 1 + (int)(Math.random() * 9);
        return matrix;
    }

    // Display matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double val : row)
                System.out.printf("%6.2f ", val);
            System.out.println();
        }
    }

    // Addition
    public static double[][] add(double[][] a, double[][] b) {
        int r = a.length, c = a[0].length;
        double[][] result = new double[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                result[i][j] = a[i][j] + b[i][j];

        return result;
    }

    // Subtraction
    public static double[][] subtract(double[][] a, double[][] b) {
        int r = a.length, c = a[0].length;
        double[][] result = new double[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                result[i][j] = a[i][j] - b[i][j];

        return result;
    }

    // Multiplication
    public static double[][] multiply(double[][] a, double[][] b) {
        int r1 = a.length, c1 = a[0].length, c2 = b[0].length;
        double[][] result = new double[r1][c2];

        for (int i = 0; i < r1; i++)
            for (int j = 0; j < c2; j++)
                for (int k = 0; k < c1; k++)
                    result[i][j] += a[i][k] * b[k][j];

        return result;
    }

    // Transpose
    public static double[][] transpose(double[][] matrix) {
        int r = matrix.length, c = matrix[0].length;
        double[][] t = new double[c][r];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                t[j][i] = matrix[i][j];

        return t;
    }

    // Determinant 2x2
    public static double determinant2x2(double[][] m) {
        return (m[0][0] * m[1][1]) - (m[0][1] * m[1][0]);
    }

    // Determinant 3x3
    public static double determinant3x3(double[][] m) {
        return m[0][0] * (m[1][1]*m[2][2] - m[1][2]*m[2][1])
                - m[0][1] * (m[1][0]*m[2][2] - m[1][2]*m[2][0])
                + m[0][2] * (m[1][0]*m[2][1] - m[1][1]*m[2][0]);
    }

    // Inverse 2x2
    public static double[][] inverse2x2(double[][] m) {
        double det = determinant2x2(m);
        if (det == 0) return null;

        double[][] inv = new double[2][2];
        inv[0][0] = m[1][1] / det;
        inv[0][1] = -m[0][1] / det;
        inv[1][0] = -m[1][0] / det;
        inv[1][1] = m[0][0] / det;
        return inv;
    }

    // Inverse 3x3
    public static double[][] inverse3x3(double[][] m) {
        double det = determinant3x3(m);
        if (det == 0) return null;

        double[][] inv = new double[3][3];

        inv[0][0] = (m[1][1]*m[2][2] - m[1][2]*m[2][1]) / det;
        inv[0][1] = (m[0][2]*m[2][1] - m[0][1]*m[2][2]) / det;
        inv[0][2] = (m[0][1]*m[1][2] - m[0][2]*m[1][1]) / det;

        inv[1][0] = (m[1][2]*m[2][0] - m[1][0]*m[2][2]) / det;
        inv[1][1] = (m[0][0]*m[2][2] - m[0][2]*m[2][0]) / det;
        inv[1][2] = (m[0][2]*m[1][0] - m[0][0]*m[1][2]) / det;

        inv[2][0] = (m[1][0]*m[2][1] - m[1][1]*m[2][0]) / det;
        inv[2][1] = (m[0][1]*m[2][0] - m[0][0]*m[2][1]) / det;
        inv[2][2] = (m[0][0]*m[1][1] - m[0][1]*m[1][0]) / det;

        return inv;
    }

    public static void main(String[] args) {

        double[][] A = createRandomMatrix(3, 3);
        double[][] B = createRandomMatrix(3, 3);

        System.out.println("Matrix A:");
        displayMatrix(A);

        System.out.println("\nMatrix B:");
        displayMatrix(B);

        System.out.println("\nAddition:");
        displayMatrix(add(A, B));

        System.out.println("\nSubtraction:");
        displayMatrix(subtract(A, B));

        System.out.println("\nMultiplication:");
        displayMatrix(multiply(A, B));

        System.out.println("\nTranspose of A:");
        displayMatrix(transpose(A));

        System.out.println("\nDeterminant of A: " + determinant3x3(A));

        double[][] inv = inverse3x3(A);
        if (inv != null) {
            System.out.println("\nInverse of A:");
            displayMatrix(inv);
        } else {
            System.out.println("\nInverse not possible (Determinant = 0)");
        }
    }
}
