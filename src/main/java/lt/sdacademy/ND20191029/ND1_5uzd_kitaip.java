package lt.sdacademy.ND20191029;

import java.util.Scanner;

public class ND1_5uzd_kitaip {
    /* 5. Parašykite programą, kuri priimtų savaitės dienos vardą ir atsakytų, savaitės dienos numeriu.
   Naudoti switch case. Pvz.: penktadienis - 5, antradienis -2.
   */
    public static void main(String[] args) {
        // Scanner numberScanner = new Scanner(System.in); // objektas skaiciams ivesti
        Scanner actionScanner = new Scanner(System.in); // aritmetiniams veiksmams

        String[] savDiena = {"pirmadienis", "antradienis", "treciadienis", "ketvirtadienis", "penktadienis", "sestadienis", "sekmadienis"};
        System.out.println(savDiena[0]);

        int[] array = new int[7];
        for (int i = 0; i < 7; i = i + 1) {
            array[i] = i + 1;
        }
        int j;
        boolean diena = true;
        while (diena) {

            System.out.println("Koki savaites dienos pavadinima: pr/an/tr/kt/pn/st/sk ");
            String action = actionScanner.nextLine();

            switch (action) {
                case ("pr"): {
                    j = 0;
                    break;
                }
                case ("an"): {
                    j = 1;
                    break;
                }
                case ("tr"): {
                    j = 2;
                    break;
                }
                case ("kt"): {
                    j = 3;
                    break;
                }
                case ("pn"): {
                    j = 4;
                    break;
                }
                case ("st"): {
                    j = 5;
                    break;
                }
                case ("sk"): {
                    j = 6;
                    break;
                }
                default: { // visiems kitiems galimiems variantams
                    j = 7;
                    System.out.println("Tokios dienos turbut dar nera...");
                }
            }
            if (j < 7) {
                System.out.println("ATSAKYMAS: " + savDiena[j] + " yra savaites diena Nr.: " + (j+1));
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
