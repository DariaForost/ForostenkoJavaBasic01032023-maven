import org.apache.commons.math3.stat.descriptive.moment.Mean;

public class ArrayUtils {
    public static double calculateMean(double[] arr) {
        Mean mean = new Mean();
        return mean.evaluate(arr);
    }

    public static boolean isSquareMatrix(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;
        return numRows == numCols;
    }
}
