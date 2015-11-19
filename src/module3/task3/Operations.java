package module3.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operations implements Interface {
    List<FlowerKind> list = FlowerKind.createflower();
    List<FlowerKind> bouqetList = new ArrayList<FlowerKind>();
    Scanner scanner = new Scanner(System.in);


    public void displayList(List<FlowerKind> flower) {
        for (FlowerKind flowers : list) {
            System.out.println(flowers);
        }
    }

    public int[] createBouqeteByNum(int flowerCount) {
        int[] composedListOfNumbers = new int[flowerCount];
        for (int i = 0; i < flowerCount; i++) {
            composedListOfNumbers[i] = scanner.nextInt() - 1;
        }
        return composedListOfNumbers;
    }

    public List<FlowerKind> composeBouqete(List<FlowerKind> flower, int[] composedListOfNumbers) {
        for (int i = 0; i < composedListOfNumbers.length; i++) {
            bouqetList.add(flower.get(composedListOfNumbers[i]));
        }
        return bouqetList;
    }

    public double returnTotalPrice(List<FlowerKind> bouqetList) {
        double totalPrice = 0;
        for (int i = 0; i < bouqetList.size() / 2; i++) {
            totalPrice = totalPrice + bouqetList.get(i).getFlowerPrice();
        }
        return totalPrice;

    }
}

