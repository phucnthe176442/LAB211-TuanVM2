import java.util.Scanner;

public class Input {
    private static final Scanner sc = new Scanner(System.in);
    private static final String[] headers = { "-------- Addition --------", "-------- Multiplication --------",
            "----- Subtraction ------" };

    public static int getInt(String msg, String err, int minValue, int maxValue) {
        int inputNum;
        // loops infinity
        while (true) {
            System.out.print(msg);
            String input = sc.nextLine().trim();
            // check if empty condition
            if (input.isEmpty())
                System.out.println("Input should not be empty");
            else {
                try {
                    inputNum = Integer.parseInt(input);
                    // check if in valid range
                    if (inputNum >= minValue && inputNum <= maxValue)
                        break;
                    else
                        System.out.println("Input should be int range [" + minValue + ", " + maxValue + "]");
                } catch (Exception e) {
                    System.out.println(err);
                }
            }
        }

        return inputNum;
    }

    private static int[][] getMatrixValues(int row, int col, int id) {
        int[][] matrix = new int[row][col];
        // loops from first to last index of row
        for (int i = 0; i < row; ++i)
            // loops from first to last index of col
            for (int j = 0; j < col; ++j)
                matrix[i][j] = getInt("Enter Matrix" + id + " [" + (i + 1) + "][" + (j + 1) + "]:",
                        "Value of matrix is digit", Integer.MIN_VALUE,
                        Integer.MAX_VALUE);
        return matrix;
    }

    public static int[][] getMatrix1(int type) {
        System.out.println(headers[type - 1]);
        int row = getInt("Enter Row Matrix 1:", "Value of matrix is digit", 1, 10);
        int col = getInt("Enter Column Matrix 1:", "Value of matrix is digit", 1, 10);
        return getMatrixValues(row, col, 1);
    }

    public static int[][] getMatrix2(int type, int row1, int col1) {
        int row = getInt("Enter Row Matrix 2:", "Value of matrix is digit", 1, 10);
        // check if invalid row of matrix 2 in add or sub
        if (type <= 2 && row != row1) {
            while (row != row1) {
                System.out.println("Row of Matrix 2 must equal to row of Matrix 1");
                row = getInt("Enter Row Matrix 2:", "Value of matrix is digit", 1, 10);
            }
        } else if (type == 3 && row != col1) { // check if invalid row of matix 2 in mul
            while (row != col1) {
                System.out.println("Row of Matrix 2 must equal to column of Matrix 1");
                row = getInt("Enter Row Matrix 2:", "Value of matrix is digit", 1, 10);
            }
        }
        int col = getInt("Enter Column Matrix 2:", "Value of matrix is digit", 1, 10);
        // check if invalid col of matrix 2 in add or sub
        if (type <= 2 && col != col1) {
            while (col != col1) {
                System.out.println("Column of Matrix 2 must equal to column of Matrix 1");
                row = getInt("Enter Column Matrix 2:", "Value of matrix is digit", 1, 10);
            }
        }
        return getMatrixValues(row, col, 2);
    }
}
