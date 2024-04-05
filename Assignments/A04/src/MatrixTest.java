import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MatrixTest {

    @Test
    void testConstructorAndToString() {
        int[][] array = {{1, 2}, {3, 4}};
        Matrix matrix = new Matrix(2, 2, array);
        assertEquals("1 2 \n3 4 \n", matrix.toString(), "Constructor or toString does not work correctly.");
    }

    @Test
    void testSet() {
        Matrix matrix = new Matrix(2, 2, new int[2][2]);
        matrix.set(0, 0, 5);
        assertEquals("5 0 \n0 0 \n", matrix.toString(), "Set method does not work correctly.");
    }

    @Test
    void testAdd() {
        Matrix matrix1 = new Matrix(2, 2, new int[][]{{1, 2}, {3, 4}});
        Matrix matrix2 = new Matrix(2, 2, new int[][]{{2, 3}, {4, 5}});
        matrix1.add(matrix2);
        assertEquals("3 5 \n7 9 \n", matrix1.toString(), "Add method does not work correctly.");
    }

    @Test
    void testMultiply() {
        Matrix matrix1 = new Matrix(2, 3, new int[][]{{1, 2, 3}, {4, 5, 6}});
        Matrix matrix2 = new Matrix(3, 2, new int[][]{{7, 8}, {9, 10}, {11, 12}});
//        matrix1.multiply(matrix2);
//        assertEquals("58 64 \n139 154 \n", matrix1.toString(), "Multiply method does not work correctly.");
        System.out.println(matrix1);
        System.out.println(matrix1.getColumns());
        System.out.println(matrix2.getRows());
    }

    @Test
    void testTranspose() {
        Matrix matrix = new Matrix(2, 3, new int[][]{{1, 2, 3}, {4, 5, 6}});
        matrix.transpose();
        assertEquals("1 4 \n2 5 \n3 6 \n", matrix.toString(), "Transpose method does not work correctly.");
    }

    @Test
    void testRotate() {
        Matrix matrix = new Matrix(2, 2, new int[][]{{1, 2}, {3, 4}});
        matrix.rotate();
        assertEquals("3 1 \n4 2 \n", matrix.toString(), "Rotate method does not work correctly.");
    }
}
