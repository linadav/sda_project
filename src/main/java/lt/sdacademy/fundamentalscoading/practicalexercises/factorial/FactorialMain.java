package lt.sdacademy.fundamentalscoading.practicalexercises.factorial;

import java.util.Scanner;

public class FactorialMain {

    public static void main(String[] args) {


        Scanner numberScanner = new Scanner(System.in); // objektas skaiciams ivesti
        Scanner actionScanner = new Scanner(System.in); // objektas skaiciams ivesti

        boolean faktorial = true;
        while (faktorial) {
            int result = 1;
            System.out.println("Iveskite skaiciu foaktorialui skaiciuoti x: ");
            int factorialNum = numberScanner.nextInt();
            for (int i = 1; i <= factorialNum; i++) {
                result *= i;
            }

            System.out.println("Rezultatas x: " + result);
            System.out.println("Ar norite testi?  t/n");
            String answer = actionScanner.nextLine();

            if (answer.equals("N") || answer.toLowerCase().equals("n")) { // mazosios/didziosios
                faktorial = false;
            }
        }
    }
}
