import java.util.Scanner;
public class InputVerfication {
    public Scanner scanner;

    public InputVerfication() {
        scanner = new Scanner(System.in);
    }

    public double VerifyInput() {
        double number = 0;
        boolean isNumber = false;
        while (!isNumber) {
            try {
                number = scanner.nextDouble();
                isNumber = true;
            } catch (Exception e) {
                System.out.println("Enter a valid number");
                scanner.next();
            }
        }
        return number;
    }
    public static boolean OperationVerification(String operation){
        boolean isOperation = false;
        if (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) {
            isOperation = true;
        }
        return isOperation;
    }

}
