package lt.sdacademy.fundamentalscoading.practicalexercises.guessWord;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class GuessWordMain {
    private static final String INPUT_FILE_LOCATION = "C:\\Users\\lina\\IdeaProjects\\First project\\src\\main\\java\\lt\\sdacademy\\fundamentalscoading\\practicalexercises\\guessWord\\zodis.txt";

    public static void main(String[] args) {
        final String word = getWordFromFile(); // f-ja nuskaito ZODI is failo
        char[] letters = word.toCharArray(); // String pavercia char masyvu
        char[] lettersGuessed = new char[letters.length]; // raidziu skaiciaus ZODYJE ilgio naujas masyvas
        System.out.println("Zodyje yra: " + letters.length + " raides");
        Arrays.fill(lettersGuessed, '_'); // uzpildo char masyva '_'

        boolean cycle = true;
        while (cycle) {
            System.out.println("SPEKITE RAIDE arba ZODI: ");
            for (int i = 0; i < letters.length; i++) {
                System.out.print(" " + lettersGuessed[i]);
            }
            System.out.println("");

            Scanner charScanner = new Scanner(System.in); // ivedimo nuskaitymas
            String input = charScanner.nextLine();
            char[] inputChars = input.toCharArray();

            if (inputChars.length == 1) {
                lettersGuessed = matchAndGetNewCharSet(inputChars, letters, lettersGuessed);
                if (String.valueOf(lettersGuessed).equals(String.valueOf(letters))) {
                    cycle = false;
                }
            } else if (inputChars.length == word.length()) {
                if (input.equals(word)) {
                    cycle = false;
                }
            } else {
                System.out.println("netinkamas atsakymas!");
            }
        }
        System.out.println("Atspetas zodis - " + word);
    }

    public static char[] matchAndGetNewCharSet(char[] inputChar, char[] lettersWord, char[] lettersGuess) {
        for (int i = 0; i < lettersWord.length; i++) {
            if (inputChar[0] == lettersWord[i]) {
                lettersGuess[i] = inputChar[0];
            }
        }
        return lettersGuess;
    }

    public static String getWordFromFile() {
        String text;
        try (BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_LOCATION))) {
            text = br.readLine();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return text = "";
        } catch (IOException e) {
            System.out.println("File read error");
            return text = "";
        }
        return text;
    }
}