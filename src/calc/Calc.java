package calc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        String c = "y";


        while (c.equals("y")) {
            try {

                Scanner scanner = new Scanner(System.in);
                //String []massiv = new String[3];
                System.out.print("Enter your expression: ");

                double a = scanner.nextDouble();
                String operator = scanner.next();
                double b = scanner.nextDouble();
                System.out.println(a + operator + b);

               // Operations.Transf(a, b);

                if (operator.equals("+")) {
                    System.out.println("Summ is: " + Operations.Summ(a, b));
                } else if (operator.equals("-")) {
                    System.out.println("Substraction is: " + Operations.Substr(a, b));
                } else if (operator.equals("*")) {
                    System.out.println("Multiple is: " + Operations.Multipl(a, b));
                } else if (operator.equals("/")) {
                    //double a1 = a;
                    //double b1 = b;
                    System.out.println("Divide is: " + Operations.Divide(a, b));
                } else {
                    System.out.println("Wrong expression! Please use Math Operator");
                }

                System.out.println("Do you want to continue? Press y if you do ");
                c = scanner.next();
            }
            catch (InputMismatchException e)
            {
                System.out.println("Please correct your expression!");
            }


             }
        }






}

