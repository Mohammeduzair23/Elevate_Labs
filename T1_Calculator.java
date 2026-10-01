import java.util.Scanner;

public class T1_Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = addition(a, b);
                break;

            case '-':
                result = subtraction(a, b);
                break;

            case '*':
                result = multiplication(a, b);
                break;

            case '/':
                if (b == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                    sc.close();
                    return;
                }
                result = division(a, b);
                break;

            case '%':
                if (b == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                    sc.close();
                    return;
                }
                result = modulus(a, b);
                break;

            default:
                System.out.println("Invalid operator.");
                sc.close();
                return;
        }

        System.out.println("Result: " + result);

        sc.close();
    }

    public static double addition(double a, double b) {
        return a + b;
    }

    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static double modulus(double a, double b) {
        return a % b;
    }
}