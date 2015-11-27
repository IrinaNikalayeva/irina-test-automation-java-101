package module3.task3;

import module3.task5.NegativePriceException;

import java.util.ArrayList;

public class FlowerKind extends Flower {


    public FlowerKind(int id, String flowerName, Double flowerPrice) {
        super(id, flowerName, flowerPrice);
        if (flowerPrice < 0) {
            try {
                throw new NegativePriceException("");
            } catch (NegativePriceException e) {
                e.printStackTrace();
                System.exit(0);
            }
        }

    }


    public static ArrayList<FlowerKind> createflower() {
        FlowerKind flower1 = new FlowerKind(1, "rose", 350.0);
        FlowerKind flower2 = new FlowerKind(2, "chamomile", 150.0);
        FlowerKind flower3 = new FlowerKind(3, "clove", 350.0);
        FlowerKind flower4 = new FlowerKind(4, "lily", 400.0);
        FlowerKind flower5 = new FlowerKind(5, "peony", 450.0);

        ArrayList<FlowerKind> flowers = new ArrayList<FlowerKind>();

        flowers.add(flower1);
        flowers.add(flower2);
        flowers.add(flower3);
        flowers.add(flower4);
        flowers.add(flower5);

        flowers.trimToSize();


        return flowers;

    }


}
