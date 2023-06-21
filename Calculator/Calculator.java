import java.util.Scanner;
import java.lang.Math;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Select an operation: ");
        System.out.println("   1. Addition (+)");
        System.out.println("   2. Subtraction (-)");
        System.out.println("   3. Multiplication (*)");
        System.out.println("   4. Division (/)");
        System.out.println("   5. Modulo (%)");
        System.out.println("   6. Square root of the first number (√)");
        System.out.println("   7. Square of the first number (^2)");
        System.out.println("   8. Cube of the first number (^3)");
        System.out.println("   9. Raise the first number to the power of the second number (a^b)");
        System.out.println("   10. Calculate the average of the two numbers");
        System.out.println("   11. Log Value");
        System.out.println("   12. Exponential Logarithm");
        System.out.println();
        int operation = scanner.nextInt();
        System.out.println();

        double result = 0;

        switch (operation) {

            case 1:
                result = num1 + num2;
                System.out.println("The result of addition is: " + result);
                break;

            case 2:
                result = num1 - num2;
                System.out.println("The result of subtraction is: " + result);
                break;

            case 3:
                result = num1 * num2;
                System.out.println("The result of multiplication is: " + result);
                break;

            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The result of division is: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;

            case 5:
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println("The result of modulo is: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;

            case 6:
                result = Math.sqrt(num1);
                System.out.println("The square root of the first number is: " + result);
                break;

            case 7:
                result = Math.pow(num1, 2);
                System.out.println("The square of the first number is: " + result);
                break;

            case 8:
                result = Math.pow(num1, 3);
                System.out.println("The cube of the first number is: " + result);
                break;

            case 9:
                result = Math.pow(num1, num2);
                System.out.println(
                        "The result of raising the first number to the power of the second number is: " + result);
                break;

            case 10:
                result = (num1 + num2) / 2;
                System.out.println("The average of the two numbers is: " + result);
                break;

            case 11:
                double logValue = Math.log(num1);
                System.out.println("The logarithm of " + num1 + " is: " + logValue);
                break;

            case 12:

                // Calculate trigonometric functions
                double sine = Math.sin(num1);
                double cosine = Math.cos(num1);
                double tangent = Math.tan(num1);
                double cotangent = 1 / Math.tan(num1);
                double secant = 1 / Math.cos(num1);
                double cosecant = 1 / Math.sin(num1);

                // Print the results
                System.out.println("Sine: " + sine);
                System.out.println("Cosine: " + cosine);
                System.out.println("Tangent: " + tangent);
                System.out.println("Cotangent: " + cotangent);
                System.out.println("Secant: " + secant);
                System.out.println("Cosecant: " + cosecant);

                break;

            default:
                System.out.println("Invalid operation.");
                break;
        }

        scanner.close();
    }
}
