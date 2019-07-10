import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;


public class CalculatorTest {

    Calculator calculator;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before

    public void before() {
        calculator = new Calculator();
    }

    @Test(expected = IllegalArgumentException.class)

    public void dividedByZeroTest() {

        //given
        int a = 2;
        int b = 0;

        //when
        double result = calculator.divide(a, b);

        //then
        //throw exceptions


    }

    @Test
    public void dividedNullPointerTest() {

        //given
        Integer a = 1;
        Integer b = null;
        expectedException.expect(IllegalArgumentException.class);

        //when
        double result = calculator.divide(a, b);

        //then
        //throw exception

//        try {
//
//            double result = calculator.divide(a, b);
//            assert false;
//        } catch (IllegalArgumentException exception) {
//            assertEquals("Bad argument", exception.getMessage());
//            assert true;
//        }


    }
}