public class Main {
    public static void main(String[] args) {
        // loops infinity
        while (true) {
            // step 1: display menu
            displayMenu();
            // step 2: user enter selected option
            int option = Input.getInt("Your choice:\n", "Input should be integer", 1, 4);
            // check if option quit
            if (option == 4)
                break;
            // step 3: user enter matrix 1
            int[][] matrix1 = Input.getMatrix1(option);
            // step 4: user enter matrix 2
            int[][] matrix2 = Input.getMatrix2(option, matrix1.length, matrix1[0].length);
            // step 5: perform corresponding operator based on option
            int[][] result = new int[1][1];
            switch (option) {
                case 1:
                    result = Operator.addMatrix(matrix1, matrix2);
                    break;
                case 2:
                    result = Operator.subMatrix(matrix1, matrix2);
                    break;
                case 3:
                    result = Operator.mulMatrix(matrix1, matrix2);
                    break;
            }
            // step 6: display result
            displayResult(matrix1, matrix2, result, option);
        }
    }

    private static void displayMenu() {
        System.out.println("=======Calculator program======");
        System.out.println("1. Addition Matrix");
        System.out.println("2. Subtraction Matrix");
        System.out.println("3. Multiplication Matrix");
        System.out.println("4. Quit");
    }

    private static void displayResult(int[][] matrix1, int[][] matrix2, int[][] result, int option) {
        String[] operators = { "+", "-", "*" };
        System.out.println("-------- Result --------");
        displayMatrix(matrix1);
        System.out.println(operators[option - 1]);
        displayMatrix(matrix2);
        System.out.println("=");
        displayMatrix(result);
    }

    private static void displayMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        // loops from first to last index of row
        for (int i = 0; i < n; ++i) {
            // loops from first to last index of col
            for (int j = 0; j < m; ++j) {
                System.out.print("[" + matrix[i][j] + "]");
            }
            System.out.println();
        }
    }
}
