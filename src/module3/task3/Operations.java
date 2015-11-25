package module3.task3;

import module3.task5.NullFlowerQuantityException;

import java.util.ArrayList;
import java.util.Scanner;

public class Operations implements Interface {

    ArrayList<FlowerKind> list = FlowerKind.createflower();
    ArrayList<FlowerKind> bouquetList = new ArrayList<FlowerKind>();
    Scanner scanner = new Scanner(System.in);


    public void displayList(ArrayList<FlowerKind> flower) {
        for (FlowerKind flowers : list) {
            System.out.println(flowers);
        }
    }

    public int getFlowerQuantity() throws NullFlowerQuantityException {
        System.out.println("How many flowers do you want?"); //
        int flowerCount = scanner.nextInt(); //
        if (flowerCount == 0) {
            throw new NullFlowerQuantityException(toString());
        }
        return flowerCount;

    }

    public int[] createBouquetByNum(int flowerCount) throws NullFlowerQuantityException {

        System.out.println("Enter Ids of flowers for bouqeut:"); //
        int[] composedListOfNumbers = new int[flowerCount];
        for (int i = 0; i < flowerCount; i++) {
            composedListOfNumbers[i] = scanner.nextInt() - 1;
        }
        return composedListOfNumbers;
    }

    public ArrayList<FlowerKind> composeBouquet(ArrayList<FlowerKind> flower, int[] composedListOfNumbers) {
        for (int i = 0; i < composedListOfNumbers.length; i++) {
            bouquetList.add(flower.get(composedListOfNumbers[i]));
            bouquetList.trimToSize();

        }
        return bouquetList;
    }

    public double returnTotalPrice(ArrayList<FlowerKind> bouqetList) {
        double totalPrice = 0;
        for (int i = 0; i < bouqetList.size() / 2; i++) {
            totalPrice = totalPrice + bouqetList.get(i).getFlowerPrice();
        }
        return totalPrice;

    }


}