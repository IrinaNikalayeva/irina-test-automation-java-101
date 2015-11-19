package module3.task3;

import java.util.ArrayList;
import java.util.*;


public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<FlowerKind> flower = FlowerKind.createflower();
        Operations operations = new Operations();

        System.out.println("We have the following flowers: ");
        operations.displayList(flower);

        System.out.println("Would you like to compose a bouqet? Press y if you do.. ");
        String createDecision = scanner.next();

        if (createDecision.equals("y")) {
            System.out.println("How many flowers do you want?");
            int flowerCount = scanner.nextInt();
            System.out.println("Enter Ids of flowers for bouqete:");
            //int flowersNum = scanner.nextInt();
            int[] finalComposeNumbers = operations.createBouqeteByNum(flowerCount);
            System.out.println("You've composed the following bouqet: " + operations.composeBouqete(flower, finalComposeNumbers));
            System.out.println("Total pice for your order: " + operations.returnTotalPrice(operations.composeBouqete(flower, finalComposeNumbers)));

        }


    }
}

