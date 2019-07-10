import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzTest {


    @Test
    @Parameters({
            "1,1",
            "3, Fizz",
            "5, Buzz",
            "15, FizzBuzz"
    })

    public void numberChanger(int input, String expected) {
        assertEquals(expected, FizzBuzz.fizzBuzz(input));
    }
}
