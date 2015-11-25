package module3.task3;

import module3.task5.NullFlowerQuantityException;

import java.util.ArrayList;
import java.util.List;

public interface Interface {
    public void displayList(ArrayList<FlowerKind> flower);

    public int[] createBouquetByNum(int flowerCount) throws NullFlowerQuantityException;

    public List<FlowerKind> composeBouquet(ArrayList<FlowerKind> flower, int[] composedListOfNumbers);

    public double returnTotalPrice(ArrayList<FlowerKind> bouqetList);

}