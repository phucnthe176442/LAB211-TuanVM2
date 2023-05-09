public class Operator {
    public static int[][] addMatrix(int[][] matrix1, int[][] matrix2) {
        int n = matrix1.length;
        int m = matrix1[0].length;
        int[][] result = new int[n][m];
        // loops from first to last index of row
        for (int i = 0; i < n; ++i)
            // loops from first to last index of col
            for (int j = 0; j < m; ++j)
                result[i][j] = matrix1[i][j] + matrix2[i][j];

        return result;
    }

    public static int[][] subMatrix(int[][] matrix1, int[][] matrix2) {
        int n = matrix1.length;
        int m = matrix1[0].length;
        int[][] result = new int[n][m];
        // loops from first to last index of row
        for (int i = 0; i < n; ++i)
            // loops from first to last index of col
            for (int j = 0; j < m; ++j)
                result[i][j] = matrix1[i][j] - matrix2[i][j];

        return result;
    }

    public static int[][] mulMatrix(int[][] matrix1, int[][] matrix2) {
        int n = matrix1.length;
        int m = matrix2.length;
        int p = matrix2[0].length;
        int[][] result = new int[n][p];
        // loops from first to last index of row
        for (int i = 0; i < n; ++i)
            // loops from first to last index of col
            for (int j = 0; j < p; ++j) {
                result[i][j] = 0;
                for (int k = 0; k < m; ++k)
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
            }

        return result;
    }
}
