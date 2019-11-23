package lt.sdacademy.fundamentals.file_read.scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static lt.sdacademy.fundamentals.file_read.Util.FILE_LOCATION;

public class ScannerExampleMain {
    public static void main(String[] args) {
        // Need to close
        try {
            Scanner fileScanner = new Scanner(new File(FILE_LOCATION));
            while (fileScanner.hasNext()) { // SKAITO KOL "NEPABAIGA"
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close(); // close
        } catch (IOException e) {
            System.out.println("KLAIDA!");
        }
        // Close automatically
        try (Scanner fileScanner = new Scanner(new File(FILE_LOCATION))) {
            while (fileScanner.hasNext()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("KLAIDA!");
        }

    }
}
