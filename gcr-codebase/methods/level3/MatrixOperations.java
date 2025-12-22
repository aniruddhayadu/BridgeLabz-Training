import java.util.Random;

public class MatrixOperations {

    	// Method to create a random matrix
    	public static int[][] createRandomMatrix(int rows, int cols) {
        	int[][] matrix = new int[rows][cols];
        	Random rand = new Random();
        	for (int i = 0; i < rows; i++) {
            		for (int j = 0; j < cols; j++) {
                		matrix[i][j] = rand.nextInt(10); // random numbers 0-9
            		}	
        	}
        	return matrix;
    	}

    	// Method to display a matrix
    	public static void displayMatrix(int[][] matrix) {
        	for (int[] row : matrix) {
            		for (int val : row) {
                		System.out.printf("%4d", val);
            		}
            		System.out.println();
        	}
    	}

    	// Method to add two matrices
    	public static int[][] addMatrices(int[][] a, int[][] b) {
        	int rows = a.length;
        	int cols = a[0].length;
        	int[][] sum = new int[rows][cols];
        	for (int i = 0; i < rows; i++) {
            		for (int j = 0; j < cols; j++) {
                	sum[i][j] = a[i][j] + b[i][j];
            		}
        	}
        	return sum;
    	}

    	// Method to subtract two matrices
    	public static int[][] subtractMatrices(int[][] a, int[][] b) {
        	int rows = a.length;
        	int cols = a[0].length;
        	int[][] diff = new int[rows][cols];
        	for (int i = 0; i < rows; i++) {
            		for (int j = 0; j < cols; j++) {
                		diff[i][j] = a[i][j] - b[i][j];
            		}
        	}
        	return diff;
    	}

    	// Method to multiply two matrices
    	public static int[][] multiplyMatrices(int[][] a, int[][] b) {
        	int rowsA = a.length;
        	int colsA = a[0].length;
        	int rowsB = b.length;
        	int colsB = b[0].length;

        	if (colsA != rowsB) {
            		System.out.println("Matrix multiplication not possible. Columns of A must equal rows of B.");
            	return null;
        	}

        	int[][] product = new int[rowsA][colsB];

        	for (int i = 0; i < rowsA; i++) {
            		for (int j = 0; j < colsB; j++) {
                		for (int k = 0; k < colsA; k++) {
                    			product[i][j] += a[i][k] * b[k][j];
                		}
            		}
        	}

        	return product;
    	}

    	public static void main(String[] args) {
        	int rows = 3;
        	int cols = 3;

        	// Generate random matrices
        	int[][] matrixA = createRandomMatrix(rows, cols);
        	int[][] matrixB = createRandomMatrix(rows, cols);

        	System.out.println("Matrix A:");
        	displayMatrix(matrixA);

        	System.out.println("\nMatrix B:");
        	displayMatrix(matrixB);

        	// Addition
        	System.out.println("\nA + B:");
        	int[][] sum = addMatrices(matrixA, matrixB);
        	displayMatrix(sum);

        	// Subtraction
        	System.out.println("\nA - B:");
        	int[][] diff = subtractMatrices(matrixA, matrixB);
        	displayMatrix(diff);

        	// Multiplication
        	System.out.println("\nA * B:");
        	int[][] prod = multiplyMatrices(matrixA, matrixB);
        	if (prod != null) {
            		displayMatrix(prod);
        	}
    	}
}
