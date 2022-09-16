import java.util.*;

public class Calc {
    public static void main(String[] args) {
        char operator;
        double number1, number2, result;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Welcome to basic calculator:\n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Reminder\n6. Square\n7. Square root\n8. 1/x\n\n");
        operator = input.next().charAt(0);

        // ask users to enter numbers
        System.out.println("Enter first number");
        number1 = input.nextDouble();

        System.out.println("\nEnter second number\n");
        number2 = input.nextDouble();

        switch (operator) {

            // performs addition between numbers
            case '1': {
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;
            }

            // performs subtraction between numbers
            case '2' : {
                result = number1 - number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                System.out.println(number1 + " - " + number2 + " = " + Math.round(result) + " (rounded answer)");
                break;
            }

            // performs multiplication between numbers
            case '3' : {
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;
            }

            // performs division between numbers
            case '4' : {
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;
            }
            case '5' : {
                Double quotient = number1 / number2;
                Double reminder = number1 % number2;
                System.out.println( number1 + "%" + number2 + "=" + reminder);
                break;
            }
            case '6' : {
                result = number1 * number1;
                System.out.println( number1 + "*" + number1 + "=" +result);
                break;
            }
            case '7': {
                System.out.println(Math.sqrt(number1));
                break;
            }
            default : System.out.println("Invalid operator!");

        }

        input.close();
    }
}
