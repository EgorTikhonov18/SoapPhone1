import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calc = new Calculator();
    @Test
    void testSum(){
       int s =  calc.sum(10, 15);
        Assertions.assertEquals(25, s);
    }

}
