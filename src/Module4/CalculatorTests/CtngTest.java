package Module4.CalculatorTests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Iryna on 1/15/2016.
 */
public class CtngTest {
    public Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @Test(dataProvider = "data")
    public void CgTest(double a, double resultTg){
        double result =  calculator.ctg(a);
        Assert.assertEquals(result, resultTg, "wrong result. Method implementation is wrong");
    }

    @DataProvider(name = "data")
    public Object[][] doubleValues() {
        return new Object[][]{
                {0, 0},
                {1, 0.0699268},
                {6.25, 0.1095178}
        };
    }
}
