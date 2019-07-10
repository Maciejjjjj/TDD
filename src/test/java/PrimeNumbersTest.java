import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;


@RunWith(JUnitParamsRunner.class)
public class PrimeNumbersTest {

    PrimeNumbers primeNumbers;

    @Before

    public void before() {
        primeNumbers = new PrimeNumbers();
    }


    @Test
    public void checkPrimeNumbersTest() {
        List<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        list.add(5);

        assertEquals(list, primeNumbers.getPrimeNumbersInRange(5));
    }

    @Test
    @Parameters({
            "6, 2, 3, 5",
            "2, 2"
    })


    public void checkPrimeNumbersTest(String... args) {
        int range = Integer.parseInt(args[0]);
        List<Integer> list = new ArrayList<Integer>();

        for (int i = 1; i < args.length; i++) {
            list.add((Integer.parseInt(args[i])));
        }


        assertThat(list).isEqualTo(primeNumbers.getPrimeNumbersInRange(range));

    }

    @Test
    @Parameters({
            "2"
    })
    public void primeNumbersLengthTest(int range) {

        Assertions.assertThat(range).isGreaterThan(primeNumbers.getPrimeNumbersInRange(range).size());

    }

    @Test
    @Parameters({
            "3"
    })
    public void primeNumbersMinimumValueTest(int range) {

        Assertions.assertThat(1).isLessThan(primeNumbers.getPrimeNumbersInRange(range).get(0));

    }

    @Test
    @Parameters({
            "5"
    })
    public void primeNumbersMaximumValueTest(int range) {

        Assertions.assertThat(range).isGreaterThan(primeNumbers.getPrimeNumbersInRange(range).get(primeNumbers.getPrimeNumbersInRange(range).size() - 1) - 1);

    }

}
