package lt.sdacademy.fundamentals.file_read.filereader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static lt.sdacademy.fundamentals.file_read.Util.FILE_LOCATION;

// nuskaito visa faila iskart
public class FileReaderMain {
    public static void main(String[] args) {
        try {
            List<String> text = Files.readAllLines(Paths.get(FILE_LOCATION)); // eilutes atskiria KABLELIAIS!
            System.out.println(text);

        } catch (IOException e) {
            System.out.println("KLAIDA!");
        }
    }
}
