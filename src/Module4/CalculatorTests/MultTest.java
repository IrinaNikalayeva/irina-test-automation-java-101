package Module4.CalculatorTests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Iryna on 1/15/2016.
 */
public class MultTest {
    public Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }
    @Test(dataProvider = "dataForDouble")
    public void multDoubleTest(double a, double b, double resDouble){
        double result = calculator.mult(a, b);
        Assert.assertEquals(result, resDouble, "Operation error: result was rounded!");
    }

    @Test(dataProvider = "dataForLong")
    public void multLongTest(long a, long b, long resLong){
        long result = calculator.mult(a, b);
        Assert.assertEquals(result, resLong, "Operation error: result was rounded!");
    }

    @DataProvider(name = "dataForDouble")
    public Object[][] doubleValues() {
        return new Object[][]{
                {1.1, 2.1, 2.31},
                {5.0, 5.0, 25},
                {1.0, -2.0, -2},
                {0, 0, 0},
                {1, 5, 5},
        };
    }

        @DataProvider(name = "dataForLong")
        public Object[][] longValues() {
            return new Object[][]{
                    {1, 2, 2},
                    {5, 5, 25},
                    {1, -2, -2},
                    {0, 0, 0},
                    {1, 5, 5},
            };
    }
}
