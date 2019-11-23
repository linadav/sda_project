package lt.sdacademy.calculator;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.Scanner;
import java.util.function.Function;

public class CalculatorMain {
    public static void main(String[] args) {
//
        Scanner actionScanner = new Scanner(System.in); // aritmetiniams veiksmams

        boolean calculate = true;
        double result = 0;

        while (calculate) {
            /*
            System.out.println("Iveskite pirmaji skaiciu");
            double firstNum = numberScanner.nextDouble();

            System.out.println("Iveskite antraji skaiciu");
            double secondNum = numberScanner.nextDouble();
            */
            double firstNum = getNum("Iveskite pirmaji skaiciu");
            //System.out.println("Iveskite pirmaji skaiciu");
           // double firstNum = numberScanner.nextDouble();
            double secondNum = getNum("Iveskite antraji skaiciu");
            // variantas 2:  double secondNum = getNum(numberScanner, "Iveskite antraji skaiciu");
//          System.out.println("Iveskite antraji skaiciu");
//          double secondNum = numberScanner.nextDouble();

            System.out.println("Koki veiksma norite atlikti? + - / * ");
            String action = actionScanner.nextLine();

            result = getResult(action, firstNum, secondNum); // funkcija
            System.out.println("Gautas rezultatas " + result);

            System.out.println("Ar norite skaiciuoti toliau? TAIP : NE");
            String answer = actionScanner.nextLine();
            //if (answer.equals("NE") || answer.toLowerCase().equals("ne")) { // mazosios/didziosios
            if (answer.equalsIgnoreCase("NE")){
                // if (answer.equals("NE")) {
                calculate = false;
            }
        }
       /* if (action.equals("+")) { // == tik skaiciams palyginti
            System.out.println(firstNum + secondNum);
        } else if (action.equals("-")) { // == tik skaiciams palyginti
            System.out.println(firstNum - secondNum);
        } else if (action.equals("*")) { // == tik skaiciams palyginti
            System.out.println(firstNum * secondNum);
        } else if (action.equals("/")) { // == tik skaiciams palyginti
            System.out.println(firstNum / secondNum);
        } else {
           System.out.println("Nezinomas veiksmas");
        } */

    }
    private static double getNum(String message){
        Scanner num = new Scanner(System.in); // objektas skaiciams ivesti
        System.out.println(message);
        return num.nextDouble();
        // arba
        // double num = num.nextDouble();
        // return num;
    }

    private static double getResult(String action, double num1, double num2) {
        switch (action) {
            case ("+"): {
                return(num1 + num2);
            }
            case ("-"): {
                return(num1 - num2);
            }
            case ("*"): {
                return(num1 * num2);
            }
            case ("/"): {
                return (num1 / num2);
            }
            default: { // visiems kitiems galimiems variantams
                System.out.println("Veiksmas nerastas");
                return 0;
            }
        }
    }
}