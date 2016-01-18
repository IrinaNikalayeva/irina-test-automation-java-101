package Module4.CalculatorTests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivTest {
    public Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @Test(dataProvider = "dataForDouble")
    public void divDoubleTest(double a, double b, double resDouble){
        double result = calculator.div(a, b);
        Assert.assertEquals(result, resDouble, "wrong value!");
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void divideByZero(){
        calculator.div(2, 0);
    }

    @Test(dataProvider = "dataForLong")
    public void divLongTest(long a, long b, long resDouble){
        long result = calculator.div(a, b);
        Assert.assertEquals(result, resDouble, "Operation error: result was rounded!");
    }

    @DataProvider(name = "dataForDouble")
    public Object[][] doubleValues() {
        return new Object[][]{
                {1.1, 2.1, 0.5238095238095238},
                {5.0, 5.0, 1},
                {1.0, -2.0, -0.5},
                {1, 5, 0.2},
        };
    }


    @DataProvider(name = "dataForLong")
    public Object[][] lngeValues() {
        return new Object[][]{
                {200, 2, 100},
                {5, 5, 1},
                {2, -2, -1},
                {-10, 5, -2},
        };
    }
}
