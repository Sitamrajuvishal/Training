package Assignments;

public class Matrix {
    private int rows;
    private int cols;
    private int[][] data;

//Constructor
    public Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        
// Initialize matrix with all zeros
        this.data = new int[rows][cols]; 
    }

    public void fill(int[] values) {
        if (values.length != rows * cols) {
            throw new IllegalArgumentException("Number of values doesn't match matrix dimensions");
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = values[i * cols + j];
            }
        }
    }

//    public void display() {
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < cols; j++) {
//                System.out.print(data[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }

    public static void main(String[] args) {
        Matrix m = new Matrix(2, 3);
        m.fill(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        //m.display();
    }
}