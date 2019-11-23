package lt.sdacademy.ND20191029;

import java.util.Scanner;

public class ND1_4uzdFull100 {
    public static void main(String[] args) {
/* 4. Parašykite programą, kuri priimtų vieną skaitmenį iš naudotojo ir pasakytų, kiek skaičių iš 100 dalinasi be liekanos.
Pvz: įvestas skaitmuo buvo 20, programos atsakymas turi būti: 5.
 */
        Scanner numberScanner = new Scanner(System.in); // objektas skaiciams ivesti
        Scanner actionScanner = new Scanner(System.in); // objektas veiksmams ivesti

        boolean full100 = true;
        boolean proceed = true;
        while (proceed) {

            System.out.println(" 100/x : Iveskite dalikli x: ");
            double number = numberScanner.nextDouble();
            double i = 0;
            double n = 0;
            while (full100) {
                i = i + 1;
                n = number * i;
                if (n > 100) {
                    full100 = false;
                }
            }
            // System.out.println("ATSAKYMAS: 100/" + number + " = " + i + " + liekana");
            System.out.println("ATSAKYMAS: 100-uke telpa " + n + " skaiciu " + number);

            System.out.println("Ar norite testi?  t/n");
            String answer = actionScanner.nextLine();

            if (answer.equals("N") || answer.toLowerCase().equals("n")) { // mazosios/didziosios
                proceed = false;
            }
           /* obj = new Double("30.0");
            i = obj.intValue();
            System.out.println("Value = " + i); */
        }
    }
}
