package lt.sdacademy.fundamentals.file_read.bufferedreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderMain { // JAVA vienu metu nuskaito tik VIENA ka
    public static void main(String[] args) {
        try { // duomenu nuskaitymo blokas
            // BufferedReader br = new BufferedReader(new FileReader("lt/sdacademy/fundamentals/file_read/TextFileResource.txt"));
            // fileReader paima, BufferedReader igalina veiksmus su textu...
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\lina\\IdeaProjects\\First project\\src\\lt\\sdacademy\\fundamentals\\file_read\\TextFileResource.txt"));
            StringBuilder stringBuilder = new StringBuilder();
            String line;  //viena texto eilute

            while (true) { // begalinis ciklas
                line = br.readLine();
                if (line == null){
                    break;
                }
                stringBuilder.append(line);
            }

           /* do {
                line = br.readLine();
                stringBuilder.append(line);
            } while (line != null); // != reiskia "nelygu"
            */
            System.out.println(stringBuilder.toString());

            br.close(); // butina faila uzdaryti // senas variatas
        } catch (IOException e) { // input/output exception
            e.printStackTrace();
        }
    }
}
