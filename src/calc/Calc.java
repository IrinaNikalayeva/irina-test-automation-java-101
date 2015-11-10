package calc;

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


               /* if (operator.equals("+")) {
                    System.out.println("Summ is: " + Operations.Summ(a, b));
                } else if (operator.equals("-")) {
                    System.out.println("Substraction is: " + Operations.Substr(a, b));
                } else if (operator.equals("*")) {
                    System.out.println("Multiple is: " + Operations.Multipl(a, b));
                } else if (operator.equals("/")) {
                    System.out.println("Divide is: " + Operations.Divide(a, b));
                } else {
                    System.out.println("Wrong expression! Please use Math Operator");
                }*/

                Operators.ChooseOperator(firstValue, operator, secondValue);

                System.out.println("Do you want to continue? Press y if you do ");
                restart = scanner.next();
            } catch (InputMismatchException e) {
                System.out.println("Please correct your expression!");
            }


        }
    }


}

