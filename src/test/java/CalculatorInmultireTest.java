import org.example.*;
import org.junit.*;

public class CalculatorInmultireTest {
    @Before
    public void before(){
        System.out.println("Test de inceput");
    }
    @Test
    public void addPositiveIntegersTest() {
        CalculatorInmultire calculator = new CalculatorInmultire();
        int result = calculator.add(5, 5);
        Assert.assertEquals(25, result);


    }
}
