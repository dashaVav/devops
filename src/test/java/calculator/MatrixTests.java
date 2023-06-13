package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixTests {
    Matrix underTest;
    @BeforeEach
    void setUp() {
        var mtrx = new ArrayList<ArrayList<ComplexNumber>> ();
        for (int i = 0; i < 3; i++) {
            var mas = new ArrayList<ComplexNumber>();
            String[] numbers = "2 5 8".split(" ");
            for (int j = 0; j < 3; j++) {
                mas.add(new ComplexNumber(numbers[j]));
            }
            mtrx.add(mas);
        }

        underTest = new Matrix(3, 3, mtrx);
    }

    @Test
    void matrixAsStrTest() {
        String expectedResult = """
                2,000000 5,000000 8,000000\s
                2,000000 5,000000 8,000000\s
                2,000000 5,000000 8,000000\s
                """;

        String result = underTest.matrixAsStr();

        assertEquals(result, expectedResult);
    }

}
