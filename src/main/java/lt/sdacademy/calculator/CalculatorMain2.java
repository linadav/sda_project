package lt.sdacademy.calculator;


import java.util.Scanner;

public class CalculatorMain2 {
    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in); // objektas skaiciams ivesti
        Scanner actionScanner = new Scanner(System.in); // aritmetiniams veiksmams

        boolean calculate = true;
        double result = 0;

        while (calculate) {

            System.out.println("Iveskite pirmaji skaiciu");
            double firstNum = numberScanner.nextDouble();

            System.out.println("Iveskite antraji skaiciu");
            double secondNum = numberScanner.nextDouble();

            System.out.println("Koki veiksma norite atlikti? + - / * ");
            String action = actionScanner.nextLine();


            switch (action) {

                case ("+"): {
                    System.out.println(firstNum + secondNum);
                    break;
                }
                case ("-"): {
                    System.out.println(firstNum - secondNum);
                    break;
                }
                case ("*"): {
                    System.out.println(firstNum * secondNum);
                    break;
                }
                case ("/"): {
                    System.out.println(firstNum / secondNum);
                    break;
                }
                default: { // visiems kitiems galimiems variantams
                    System.out.println("Veiksmas nerastas");
                }
            }

            System.out.println("Ar norite skaiciuoti toliau? TAIP : NE");
            String answer = actionScanner.nextLine();
            if (answer.equals("NE") || answer.toLowerCase().equals("ne")) { // mazosios/didziosios
                // if (answer.equals("NE")) {
                calculate = false;
            }
        }

    }
}



