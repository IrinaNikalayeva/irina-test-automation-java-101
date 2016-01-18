package Module4.CalculatorTests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Iryna on 1/15/2016.
 */
public class PowTest {
    public Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @Test(dataProvider = "dataForDouble")
    public void PowDoubleTest(double a, double b, double resultD){
        double reslut = calculator.pow(a, b);
        Assert.assertEquals(reslut, resultD, "The result is rounded! Error in method implementation!");

    }

    @DataProvider(name = "dataForDouble")
    public Object[][] doubleValues() {
        return new Object[][]{
                {1, 2, 1},
                {5, 2, 25},
                {1, -2, 1},
                {0, 0, 1},
                {2, 1.1, 2.14354693},
        };
    }
}
