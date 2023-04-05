import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputVerfication verifier = new InputVerfication();

        System.out.print("Enter the first number: ");
        double operating1 = verifier.VerifyInput();

        System.out.print("Enter the second number: ");
        double operating2 = verifier.VerifyInput();

        String operation = null;
        boolean isValidOperation = false;
        while (!isValidOperation) {
            System.out.print("Enter an operation (+, -, *, /): ");
            operation = verifier.scanner.next();
            isValidOperation = InputVerfication.OperationVerification(operation);
            if (!isValidOperation) {
                System.out.println("Invalid operation. Please enter a valid operation.");
            }
        }

        double result = Calculator.operator(operating1, operating2, operation);
        System.out.println("The result is: " + result);
    }
}







