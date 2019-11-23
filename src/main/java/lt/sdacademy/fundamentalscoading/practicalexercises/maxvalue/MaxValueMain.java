package lt.sdacademy.fundamentalscoading.practicalexercises.maxvalue;

import java.util.Scanner;

public class MaxValueMain {
    public static void main(String[] args) {
// skaiciu seka su kebleliais nuskaito kaip teksta, tada sudalina i string masyva (.split),
// pavercia integeriu (.parseInt) ir iskau didziausio skaiciaus
        Scanner inputScanner = new Scanner(System.in); // objektas skaiciams ivesti
        Scanner actionScanner = new Scanner(System.in); //

        boolean skaito = true;
        while (skaito) {
            int result = 1;
            System.out.println("Iveskite skaiciu seka x,y,z ir t.t.: "); // pvz.: 123,455,-222,
            String stringNum = inputScanner.nextLine();

            String[] splitNum = stringNum.split(",");
            int maxNum = Integer.parseInt(splitNum[0]);
            for (int i = 1; i < splitNum.length; i++) {
                int intNum = Integer.parseInt(splitNum[i]);
                if (intNum > maxNum) {
                    maxNum = intNum;
                }
            }

            System.out.println("Rezultatas x: " + maxNum);
            System.out.println("Ar norite testi?  t/n");
            String answer = actionScanner.nextLine();

            if (answer.equals("N") || answer.toLowerCase().equals("n")) { // mazosios/didziosios
                skaito = false;
            }
        }

    }
}