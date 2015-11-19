package module3.task3;

import java.util.List;

public interface Interface {
    public void displayList(List<FlowerKind> flower);

    public int[] createBouqeteByNum(int flowerCount);

    public List<FlowerKind> composeBouqete(List<FlowerKind> flower, int[] composedListOfNumbers);

    public double returnTotalPrice(List<FlowerKind> bouqetList);
}
