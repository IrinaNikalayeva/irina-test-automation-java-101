package module3.task3;

import module3.task5.NullFlowerQuantityException;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Runner {
    public static void main(String[] args) throws NullFlowerQuantityException, FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        try {
            ArrayList<FlowerKind> flower = FlowerKind.createflower();
            Operations operations = new Operations();

            IO.writeFile(flower);
            System.out.println("We have the following flowers: ");
            String text = IO.readList("ListOfFlowers.txt");
            System.out.println(text);
            System.out.println("Would you like to compose a bouquet? Press y if you do.. ");
            String createDecision = scanner.next();

            if (createDecision.equals("y")) {
                int flowerCount = operations.getFlowerQuantity();
                int[] finalComposeNumbers = operations.createBouquetByNum(flowerCount);
                ArrayList<FlowerKind> composeBouquet = operations.composeBouquet(flower, finalComposeNumbers);

                System.out.println("You've composed the following bouquet: " + "\n" + composeBouquet);
                System.out.println("Total price for your order: " + operations.returnTotalPrice(composeBouquet));
                IO.writeComposedBouquet(composeBouquet);


            }
        } catch (InputMismatchException e) {
            System.out.print("Please use integer!");
        } catch (NegativeArraySizeException e) {
            System.out.println("Use positive numbers!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Doesn't exist!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Doesn't exist! Your value is too big!");
        }

    }


}



