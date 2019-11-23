package lt.sdacademy.ND20191029;

import java.util.Scanner;

public class ND1_5uzdSavaitesDiena {
    /* 5. Parašykite programą, kuri priimtų savaitės dienos vardą ir atsakytų, savaitės dienos numeriu.
    Naudoti switch case. Pvz.: penktadienis - 5, antradienis -2.
    */
    public static void main(String[] args) {
        // Scanner numberScanner = new Scanner(System.in); // objektas skaiciams ivesti
        Scanner actionScanner = new Scanner(System.in); // aritmetiniams veiksmams

        String[] savDiena = {"pirmadienis", "antradienis", "treciadienis", "ketvirtadienis", "penktadienis", "sestadienis", "sekmadienis"};
        System.out.println(savDiena[0]);

        boolean diena = true;
        while (diena) {

            System.out.println("Koki savaites dienos pavadinima: pr/an/tr/kt/pn/st/sk ");
            String action = actionScanner.nextLine();

            switch (action) {
                case ("pr"): {
                    System.out.println("ATSAKYMAS: " + savDiena[0] + " yra nr.: " + 1);
                    break;
                }
                case ("an"): {
                    System.out.println("ATSAKYMAS: " + savDiena[1] + " yra nr.: " + 2);
                    break;
                }
                case ("tr"): {
                    System.out.println("ATSAKYMAS: " + savDiena[2] + " yra nr.: " + 3);
                    break;
                }
                case ("kt"): {
                    System.out.println("ATSAKYMAS: " + savDiena[3] + " yra nr.: " + 4);
                    break;
                }
                case ("pn"): {
                    System.out.println("ATSAKYMAS: " + savDiena[4] + " yra nr.: " + 5);
                    break;
                }
                case ("st"): {
                    System.out.println("ATSAKYMAS: " + savDiena[5] + " yra nr.: " + 6);
                    break;
                }
                case ("sk"): {
                    System.out.println("ATSAKYMAS: " + savDiena[6] + " yra nr.: n" + 7);
                    break;
                }
                default: { // visiems kitiems galimiems variantams
                    System.out.println("Tokios dienos turbut dar nera...");
                }
            }
            System.out.println("Ar norite testi?  t/n");
            String answer = actionScanner.nextLine();
            if (answer.equals("N") || answer.toLowerCase().equals("n")) { // mazosios/didziosios
                // if (answer.equals("NE")) {
                diena = false;
            }
        }
    }
}