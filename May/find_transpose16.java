// Java Program to Find Transpose of a Matrix

public class find_transpose16 {

  public static void main(String[] args) {
    int row = 2, column = 3;
    int[][] matrix = { { 2, 3, 4 }, { 5, 6, 4 } };

    // Display current matrix
    display(matrix);

    // Transpose the matrix

    int[][] transpose = new int[column][row];

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        transpose[j][i] = matrix[i][j];
      }
    }
    System.out.println();
    // Display tranposed matrix
    display(transpose);
  }

  public static void display(int[][] matrix) {
    for (int[] row : matrix)
    {
      for (int column : row)
      {
        System.out.print(column + "   ");
      }
      System.out.println();
    }
  }
}
