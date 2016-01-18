package Module4.CalculatorTests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Created by Iryna on 1/15/2016.
 */
public class SqrtTest {
    public Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @Test(dataProvider = "dataForDouble")
    public void SqrtTest(double a, double resultSqrt){
       double result =  calculator.sqrt(a);
        Assert.assertEquals(result, resultSqrt, "wrong");
    }

    @DataProvider(name = "dataForDouble")
    public Object[][] doubleValues() {
        return new Object[][]{
                {1, 1},
                {4, 2},
                {6.25, 2.5}
                };
    }
}
