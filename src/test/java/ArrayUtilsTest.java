import org.junit.Test;
import static org.junit.Assert.*;
public class ArrayUtilsTest {
    @Test
    public void testCalculateMean() {
        double[] arr = {1, 2, 3, 4, 5};
        double expected = 3.0;
        double actual = ArrayUtils.calculateMean(arr);
        assertEquals(expected, actual, 0.001);
    }

    @Test
    public void testIsSquareMatrix() {
        int[][] squareMatrix = {{1, 2}, {3, 4}};
        int[][] nonSquareMatrix = {{1, 2, 3}, {4, 5, 6}};

        assertTrue(ArrayUtils.isSquareMatrix(squareMatrix));
        assertFalse(ArrayUtils.isSquareMatrix(nonSquareMatrix));
    }
}
