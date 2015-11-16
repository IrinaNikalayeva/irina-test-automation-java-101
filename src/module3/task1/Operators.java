package module3.task1;

public class Operators extends Calc {


    public static void ChooseOperator(double a, String operator, double b) {

        if (operator.equals("+")) {
            System.out.println("Summ is: " + Operations.Summ(a, b));
        } else if (operator.equals("-")) {
            System.out.println("Substraction is: " + Operations.Substr(a, b));
        } else if (operator.equals("*")) {
            System.out.println("Multiple is: " + Operations.Multipl(a, b));
        } else if (operator.equals("/")) {
            if (b == 0) {
                System.out.println("Division on 0 is not allowed!");
            } else {
                System.out.println("Divide is: " + Operations.Divide(a, b));
            }
        } else {
            System.out.println("Wrong expression! Please use Math Operator");
        }

    }

}
