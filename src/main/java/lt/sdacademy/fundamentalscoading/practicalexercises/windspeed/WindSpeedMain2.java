package lt.sdacademy.fundamentalscoading.practicalexercises.windspeed;
// PRIVATE konstantu naudojimas!
// ivedam greiti km/h, apskaiciuojame vejo greiti mazgais (myliom),
// beaufort skaleje: vejo (greitis/3.01)^1.5 Math.pow(number, power)
//3.1 Beuforto skales matmuo negali buti didesnis uz 12
// jeigu vejo greitis didesnis nei 2 km -> rezultatas vejas yra "stifprus"
import java.util.Scanner;

public class WindSpeedMain2 {

    private static final double NAUTICAL_MILE = 1.852;
    private static final double BEAUFORT_CONSTANT = 3.01;

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in); // objektas skaiciams ivesti
        Scanner actionScanner = new Scanner(System.in); // objektas skaiciams ivesti

        boolean nuskaitymas = true;
        while (nuskaitymas) {
            int result = 1;
            System.out.println("Iveskite vejo greiti (sveikas skaicius), km/h: ");
            int windSpeed = inputScanner.nextInt();
            System.out.println(windSpeed);

            // perskaiciuojam mazgais:
            double windMiles = windSpeed * NAUTICAL_MILE;
            System.out.println("Vejo greitis myliomis arba mazgais: " + windMiles);

            //beaufort skaleje: vejo (greitis/3.01)^1.5 Math.pow(number, power)
            double windInBscale = Math.pow(windSpeed / BEAUFORT_CONSTANT, 1.5);
            if (windInBscale>12){
                windInBscale=12;
            }
            System.out.println("Vejo greitis Beaufoto skaleje: " + windInBscale);

            if (windSpeed > 20) {
                System.out.println("Vejo greitis yra labai didelis: " + windSpeed + " km/h");
            }


            //System.out.println("Rezultatas x: " + result);
            System.out.println("Ar norite testi?  t/n");
            String answer = actionScanner.nextLine();

            if (answer.equals("N") || answer.toLowerCase().equals("n")) { // mazosios/didziosios
                nuskaitymas = false;
            }
        }
    }
}