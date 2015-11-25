package module3.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        String restart = "y";
        while (restart.equals("y")) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter your expression (using spaces): ");
                double firstValue = scanner.nextDouble();
                String operator = scanner.next();
                double secondValue = scanner.nextDouble();
                System.out.println(firstValue + operator + secondValue);
                Operators.ChooseOperator(firstValue, operator, secondValue);
                System.out.println("Do you want to continue? Press y if you do ");
                restart = scanner.next();
            } catch (InputMismatchException e) {
                System.out.println("Please correct your expression!");
            }


        }
    }


}

