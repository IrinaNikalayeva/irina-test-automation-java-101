package Module4.CalculatorTests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SubTest {
    public Calculator calculator;

    @BeforeClass
    public void setUp() {
        calculator = new Calculator();
    }

    @Test(dataProvider = "dataForDouble")
    public void SubDoubleTest(double a, double b, double resDouble) {
        double result = calculator.sub(a, b);
        Assert.assertEquals(result, resDouble, "wrong");
    }

    @Test(dataProvider = "dataForLong")
    public void SubLongTest(long a, long b, long resLong) {
        long result = calculator.sub(a, b);
        Assert.assertEquals(result, resLong, "wrong");
    }


    @DataProvider(name = "dataForDouble")
    public Object[][] doubleValues() {
        return new Object[][]{
                {1.0, 2.0, -1},
                {5.0, 5.0, 0},
                {1.0, -2.0, 3},
                {0, 0, 0},
                {1, 5, -4},
        };
    }

    @DataProvider(name = "dataForLong")
    public Object[][] longValues() {
        return new Object[][]{
                {1, 2, -1},
                {55555, 548651465, -548595910},
        };

    }
}
