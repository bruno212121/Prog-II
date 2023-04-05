//calculadora de suma, resta y multiplicacion
public class Calculator {
    // agregar variable operation tipo string
    public static double operator(double operating1, double operating2, String operation) {
        double result = 0;
        switch (operation) {
            case "+":
                result = operating1 + operating2;
                break;
            case "-":
                result = operating1 - operating2;
                break;
            case "*":
                result = operating1 * operating2;
                break;
            case "/":
                result = operating1 / operating2;
                break;
            default:
                System.out.println("Operacion no valida");
                break;
        }
        return result;
    }

}
