import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(value = Parameterized.class)

public class CalculatorAddTestParametrized {

    int a;
    int b;
    int expected;

    Calculator calculator;

    public CalculatorAddTestParametrized(int a, int b, int expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }


    @Parameterized.Parameters(name = "{0} + {1} = {2}")
    public static Collection<Object[]> data() {

        return Arrays.asList(new Object[][]{{1, 2, 3}, {2, 3, 5}, {4, 4, 8}
        });

    }


    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void addTest() {
        int result = calculator.add(a, b);
        assertEquals(expected, result);
    }

    @Test
    public void subTest() {
        //given
        int a = 4;
        int b = 2;
        //when

        int subResult = calculator.substract(a, b);

        //then
        assertEquals(2, subResult);
    }

    @Test
    public void mulTest() {
        //given
        int a = 2;
        int b = 4;
        //when

        int mulResult = calculator.multiply(a, b);

        //then
        assertEquals(8, mulResult);
    }

    @Test
    public void divTest() {
        //given
        int a = 9;
        int b = 3;
        //when

        double divResult = calculator.divide(a, b);

        //then
        assertEquals(3, divResult);
    }
}

