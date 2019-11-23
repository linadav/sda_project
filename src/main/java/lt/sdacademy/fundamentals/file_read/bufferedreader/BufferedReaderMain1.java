package lt.sdacademy.fundamentals.file_read.bufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static lt.sdacademy.fundamentals.file_read.Util.FILE_LOCATION;

// kai failo skaitymas yra try(), tuomet nebereikia rasyti failo uzdarymo
public class BufferedReaderMain1 {
    // private static final String FILE_LOCATION; // JAVA vienu metu nuskaito tik VIENA ka
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION))){ // ALT+ENTER import static location...
            StringBuilder stringBuilder = new StringBuilder();
            String line;  //viena texto eilute

            while (true) { // begalinis ciklas
                line = br.readLine();
                if (line == null){
                    break;
                }
                stringBuilder.append(line);
            }
            System.out.println(stringBuilder.toString());

            // br.close(); // butina faila uzdaryti // senas variatas
        } catch (IOException e) { // input/output exception
            e.printStackTrace();
        }
    }
}
