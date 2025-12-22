import java.util.Random;

public class MatrixManipulation {

    	// Generate random matrix with given rows and cols (values 1-9 for simplicity)
    	public static int[][] createRandomMatrix(int rows, int cols) {
        	Random rand = new Random();
        	int[][] matrix = new int[rows][cols];
        	for (int i=0; i<rows; i++) {
            		for (int j=0; j<cols; j++) {
                		matrix[i][j] = 1 + rand.nextInt(9);
            		}
        	}
        	return matrix;
    	}


    	// Display matrix
    	public static void displayMatrix(double[][] matrix) {
        	for (double[] row : matrix) {
            		for (double val : row) {
                		System.out.printf("%8.3f ", val);
            		}
            		System.out.println();
        	}
    	}
    

    	// Overloaded display for int matrices
    	public static void displayMatrix(int[][] matrix) {
        	for (int[] row : matrix) {
            		for (int val : row) {
                		System.out.printf("%4d ", val);
            		}
            		System.out.println();
        	}
    	}


    	// Transpose of matrix
    	public static int[][] transpose(int[][] matrix) {
        	int rows = matrix.length;
        	int cols = matrix[0].length;
        	int[][] trans = new int[cols][rows];
        	for (int i=0; i<rows; i++) {
            		for (int j=0; j<cols; j++) {
                		trans[j][i] = matrix[i][j];
            		}
        	}
        	return trans;
    	}

    	// Determinant of 2x2 matrix
    	public static int determinant2x2(int[][] matrix) {
        	return matrix[0][0]*matrix[1][1] - matrix[0][1]*matrix[1][0];
    	}


    	// Determinant of 3x3 matrix
    	public static int determinant3x3(int[][] matrix) {
        	int a = matrix[0][0], b = matrix[0][1], c = matrix[0][2];
        	int d = matrix[1][0], e = matrix[1][1], f = matrix[1][2];
        	int g = matrix[2][0], h = matrix[2][1], i = matrix[2][2];
        	return a*(e*i - f*h) - b*(d*i - f*g) + c*(d*h - e*g);
    	}


    	// Inverse of 2x2 matrix (returns double[][])
    	public static double[][] inverse2x2(int[][] matrix) {
        	int det = determinant2x2(matrix);
        	if (det == 0) {
            		System.out.println("Inverse not possible, determinant is 0");
            		return null;
        	}

        	double[][] inverse = new double[2][2];
        	inverse[0][0] = matrix[1][1] / (double)det;
        	inverse[0][1] = -matrix[0][1] / (double)det;
        	inverse[1][0] = -matrix[1][0] / (double)det;
        	inverse[1][1] = matrix[0][0] / (double)det;

        	return inverse;
    	}

    	// get minor matrix for 3x3 
	private static int[][] getMinor(int[][] matrix, int r, int c) {
        	int[][] minor = new int[2][2];
        	int mRow = 0, mCol = 0;
        	for (int i=0; i<3; i++) {
            		if (i == r) continue;
            		mCol = 0;
            		for (int j=0; j<3; j++) {
                		if (j == c) continue;
                		minor[mRow][mCol] = matrix[i][j];
                		mCol++;
            		}
            		mRow++;
        	}
        	return minor;
    	}

    	// Cofactor matrix for 3x3
    	private static double[][] cofactorMatrix(int[][] matrix) {
        	double[][] cofactors = new double[3][3];
        	for (int i=0; i<3; i++) {
            		for (int j=0; j<3; j++) {
                		int sign = ((i+j) % 2 == 0) ? 1 : -1;
                		int[][] minor = getMinor(matrix, i, j);
                		cofactors[i][j] = sign * determinant2x2(minor);
           	 	}
        	}
        	return cofactors;
    	}

    	// Inverse of 3x3 matrix (returns double[][])
    	public static double[][] inverse3x3(int[][] matrix) {
        	int det = determinant3x3(matrix);
        	if (det == 0) {
            		System.out.println("Inverse not possible, determinant is 0");
            		return null;
        	}

        	double[][] cofactors = cofactorMatrix(matrix);

        	// Transpose of cofactor matrix = adjoint
        	double[][] adjoint = transpose(cofactors);

        	double[][] inverse = new double[3][3];
        	for (int i=0; i<3; i++) {
            		for (int j=0; j<3; j++) {
                		inverse[i][j] = adjoint[i][j] / det;
            		}
        	}

        	return inverse;
    	}

    	// Transpose for double matrix
    	public static double[][] transpose(double[][] matrix) {
        	int rows = matrix.length;
        	int cols = matrix[0].length;
        	double[][] trans = new double[cols][rows];
        	for (int i=0; i<rows; i++) {
            		for (int j=0; j<cols; j++) {
                		trans[j][i] = matrix[i][j];
            		}
        	}
        	return trans;
    	}

    	public static void main(String[] args) {

        	// Test with 2x2 matrix
        	System.out.println("2x2 Matrix Operations:");
        	int[][] mat2x2 = createRandomMatrix(2, 2);
        	displayMatrix(mat2x2);

        	System.out.println("Transpose:");
        	displayMatrix(transpose(mat2x2));

        	int det2 = determinant2x2(mat2x2);
        	System.out.println("Determinant: " + det2);

        	System.out.println("Inverse:");
        	double[][] inv2 = inverse2x2(mat2x2);
        	if (inv2 != null) displayMatrix(inv2);

        	// Test with 3x3 matrix
        	System.out.println("3x3 Matrix Operations:");
        	int[][] mat3x3 = createRandomMatrix(3, 3);
        	displayMatrix(mat3x3);

        	System.out.println("Transpose:");
        	displayMatrix(transpose(mat3x3));

        	int det3 = determinant3x3(mat3x3);
        	System.out.println("Determinant: " + det3);

        	System.out.println("Inverse:");
        	double[][] inv3 = inverse3x3(mat3x3);
        	if (inv3 != null) displayMatrix(inv3);
    	}
}
