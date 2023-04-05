import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputVerfication verifier = new InputVerfication();

        System.out.print(Constans.ENTER_FIRST_NUMBER);
        double operating1 = verifier.VerifyInput();

        System.out.print(Constans.ENTER_SECOND_NUMBER);
        double operating2 = verifier.VerifyInput();

        String operation = null;
        boolean isValidOperation = false;
        while (!isValidOperation) {
            System.out.print(Constans.ENTER_OPERATION);
            operation = verifier.scanner.next();
            isValidOperation = InputVerfication.OperationVerification(operation);
            if (!isValidOperation) {
                System.out.println(Constans.INVALID_OPERATION);
            }
        }

        double result = Calculator.operator(operating1, operating2, operation);
        System.out.println(Constans.RESULT + result);
    }
}







