package Module4.CalculatorTests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SumTest {
    public Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }


    @Test(dataProvider = "dataForDouble")
    public void SumDoubleTest(double a, double b, double resDouble) {
        double result = calculator.sum(a, b);
        Assert.assertEquals(result, resDouble, "wrong");
    }

    @Test(dataProvider = "dataForLong")
    public void SumLongTest(long a, long b, long resLong) {
        long result = calculator.sum(a, b);
        Assert.assertEquals(result, resLong, "wrong");
    }


    @DataProvider(name = "dataForDouble")
    public Object[][] doubleValues() {
        return new Object[][]{
                {1.1, 2.0, 3.1},
                {5.0, 5.0, 10.0},
                {1.0, -2.0, -1},
                {0, 0, 0},
                {1, 2.0, 3},
        };
    }

    @DataProvider(name = "dataForLong")
    public Object[][] longValues() {
        return new Object[][]{
                {1, 2, 3},
                {55555, 548651465, 548707020},
        };

    }
}
