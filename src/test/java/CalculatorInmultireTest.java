import org.example.*;
import org.junit.*;

public class CalculatorInmultireTest {
    @Before
    public void before() {
        System.out.println("Test de inceput");
    }

    @Test
    public void dividePositiveIntegersTest() {
        CalculatorInmultire calculator = new CalculatorInmultire();
        int result = calculator.divide(10, 5);
        Assert.assertEquals(2, result);


    }
}
