package lt.sdacademy.fundamentalscoading.practicalexercises.reversetext;

import java.util.Scanner;

public class reversetext {
    public static void main (String[] args) {

        Scanner textScanner= new Scanner(System.in);
        String text;
        String reverseText = "";

        System.out.println("Iveskite teksta");
        text = textScanner.nextLine();

        // iteruosime atbulai
        for(int i = text.length()-1; i >= 0; i--) { //
            // reverseText = reverseText + text.charAt(i);
            reverseText += text.charAt(i);

        }

        System.out.println(reverseText);
    }

}
