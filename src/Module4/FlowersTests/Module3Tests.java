package Module4.FlowersTests;


import module3.task3.FlowerKind;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class Module3Tests {
    ArrayList<FlowerKind> flowerKinds;

       @BeforeClass
            public void setUp() {
        flowerKinds = FlowerKind.createflower();
    }

    @Test(description = "Total cost for all list of flowers")
    public void getTotalCost() {
        double price = 0;
        for (int i = 0; i < flowerKinds.size(); i++) {
            price = price + flowerKinds.get(i).getFlowerPrice();
            System.out.println(price);
        }
        System.out.println(price);
        Assert.assertEquals(price, 1700.0);
    }

    @Test(description = "Total quantity of all flowers")
    public void getTotalQuantity() {
        int quantity = 0;
        for (int i = 0; i < flowerKinds.size(); i++) {
            quantity++;
        }
        Assert.assertEquals(quantity, 5);
    }

    @Test(description = "Check that all items match", dataProvider = "flowerData")
    public void composeBouquet(int id, String expectedflowerName, double expectedFlowerPrice) {
        String flowerName = flowerKinds.get(id-1).getFlowerName();
        double flowerPrice = flowerKinds.get(id-1).getFlowerPrice();
       Assert.assertEquals(flowerName, expectedflowerName);
        Assert.assertEquals(flowerPrice, expectedFlowerPrice);
    }

    @DataProvider(name = "flowerData")
    public Object[][] valuesForDiv() {
        return new Object[][]{
                {1, "rose", 350.0},
                {2, "chamomile", 150.0},
                {3, "clove", 350.0},
                {4, "lily", 400.0},
                {5, "peony", 450.0}
        };

    }
}
