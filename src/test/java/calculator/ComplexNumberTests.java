package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComplexNumberTests {
    private ComplexNumber underTest;

    @BeforeEach
    void setUp() {
        underTest = new ComplexNumber(1, 2);
    }

    @Test
    void getRealTest() {
        double expectedResult = 1;

        double  result = underTest.getReal();

        assertEquals(result, expectedResult);
    }

    @Test
    void getImagTest() {
        double expectedResult = 2;

        double  result = underTest.getImag();

        assertEquals(result, expectedResult);
    }

    @Test
    void addTest() {
        ComplexNumber another = new ComplexNumber(2, 5);
        ComplexNumber expectedResult = new ComplexNumber(3, 7);

        ComplexNumber result = underTest.add(another);

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void decrTest() {
        ComplexNumber another = new ComplexNumber(1, 1);
        ComplexNumber expectedResult = new ComplexNumber(0, 1);

        ComplexNumber result = underTest.decr(another);

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void mulTest() {
        ComplexNumber another = new ComplexNumber(3, 2);
        ComplexNumber expectedResult = new ComplexNumber(-1, 8);

        ComplexNumber result = underTest.mul(another);

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void divTest() {
        ComplexNumber another = new ComplexNumber(2, 2);
        ComplexNumber expectedResult = new ComplexNumber(0.75, 0.25);

        ComplexNumber result = underTest.div(another);

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void trigonometricFormTest() {
        String expectedResult = "2,236068 * (cos(63,434949) + i * sin(63,434949))";

        String result = underTest.trigonometricForm();

        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void algebraicFormTest() {
        String expectedResult = "1,000000+2,000000i";

        String result = underTest.algebraicForm();

        assertThat(result).isEqualTo(expectedResult);
    }

}
