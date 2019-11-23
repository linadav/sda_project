package lt.sdacademy.ND20191029;

import java.util.Scanner;

public class ND1_3uzdKoord {
    public static void main(String[] args) {
/*
3. Parašykite programą, kuri priimtų 2 koordinates (x, y) iš naudotojo ir atsakykite kokiame  ketvirtyje yra taškas.
Jei taškas pagal koordinates yra ant linijos, programa turi pasakyti ant kurios ašies yra taškas.
Jei įvesta (2;4) -> pirmas ketvirtis, jei (-3;120) ketvirtas ketvirtis.
*/
        Scanner numberScanner = new Scanner(System.in); // objektas skaiciams ivesti
        Scanner actionScanner = new Scanner(System.in); // objektas veiksmams ivesti

        boolean coordinates = true;
        while (coordinates) {

            System.out.println("Iveskite kooridnate x: ");
            double firstNum = numberScanner.nextDouble();

            System.out.println("Iveskite koordinate y: ");
            double secondNum = numberScanner.nextDouble();

            System.out.println("Ivedete tasko koordinates (x; y): (" + firstNum + "; " + secondNum + ")");

            if (firstNum == 0.) {
                if (secondNum == 0) {
                    System.out.println("ATSAKYMAS: taskas yra koordinaciu sistemos pradzioje");
                } else {
                    System.out.println("ATSAKYMAS: taskas yra ant x asies");
                }
            } else if (secondNum == 0) {
                System.out.println("ATSAKYMAS: taskas yra ant y asies");
            } else if (firstNum > 0) {
                if (secondNum > 0) {
                    System.out.println("ATSAKYMAS: taskas yra I ketvirtyje");
                } else if (secondNum < 0) {
                    System.out.println("ATSAKYMAS: taskas yra IV ketvirtyje");
                }
            } else if (firstNum < 0) {
                if (secondNum > 0) {
                    System.out.println("ATSAKYMAS: taskas yra II ketvirtyje");
                } else if (secondNum < 0) {
                    System.out.println("ATSAKYMAS: taskas yra III ketvirtyje");
                }
            }
            System.out.println("Ar norite ivesti naujas koordinates? t/n");
            String answer = actionScanner.nextLine();
            if (answer.equals("N") || answer.toLowerCase().equals("n")) { // mazosios/didziosios
                // if (answer.equals("NE")) {
                coordinates = false;
                System.out.println("Programa baigta!");
            }
        }
    }
}