package lt.sdacademy.ND2.AdAstra;

import java.util.regex.Pattern;

/*
Susikurti String tipo kintamąjį su tekstu: "Ad Astra Per Aspera" (žemiau pateiktas užduotis atlikti naudojantis String funkcijas)
    a) Paversti tekstą tik mažosiomis raidėmis;
    b) Paversti tekstą tik didžiosiomis raidėmis;
    c) Pakeisti visas 'A' raides, raidėmis 'X';
    d) Patikrinkite ar jūsų tekstas prasideda tekstu: "Ad".
 */
public class AdAstraMain {
    public static void main(String[] args) {

        String textStr = "Ad Astra Per Aspera";
        System.out.println(textStr);
        //a) String methods: https://www.w3schools.com/java/java_ref_string.asp
        System.out.println("a) " + textStr.toLowerCase());
        // b)
        System.out.println("b) " + textStr.toUpperCase());
        //c)
        System.out.println("c) " + textStr.replace('A', 'X'));  //rep
        //d)
        System.out.println("d) ar tekstas prasideda tekstu: Ad? " + Pattern.matches("Ad", "Ad"));
        // TEXT.startsWith(prefix) // prefix nurodomas kreipmesi
    }
}
