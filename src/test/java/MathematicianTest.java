import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class MathematicianTest {

    Calculator calculator = Mockito.mock(Calculator.class);

    @Test

    public void veryCoplicatedCalculationsTest() {

        //given
        Mathematician mathematician = new Mathematician(calculator);
        when(calculator.calculateIntegral()).thenReturn(1);
        when(calculator.add(1, 1)).thenReturn(3);

        //when
        int result = mathematician.calculateVeryComplicatedCalculation();

        //then
        assertEquals(3, result);
        verify(calculator, times(2)).calculateIntegral();

    }

}
