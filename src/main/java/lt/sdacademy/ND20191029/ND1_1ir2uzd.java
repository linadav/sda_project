package lt.sdacademy.ND20191029;

import java.util.Scanner;

public class ND1_1ir2uzd {
    public static void main(String[] args) {
/*
1. Parašykite programą, kuri į ekraną išvestų skaičius nuo 1 iki 100 (naudoti ciklą for).
2. Parašykite programą, kuri priimtų naudotojo įvestą skaičių ir pasakytų, ar ivestas skaičius yra pirminis.
3. Parašykite programą, kuri priimtų 2 koordinates (x, y) iš naudotojo ir atsakykite kokiame  ketvirtyje yra taškas.
Jei taškas pagal koordinates yra ant linijos, programa turi pasakyti ant kurios ašies yra taškas.
Jei įvesta (2;4) -> pirmas ketvirtis, jei (-3;120) ketvirtas ketvirtis.

4. Parašykite programą, kuri priimtų vieną skaitmenį iš naudotojo ir pasakytų, kiek skaičių iš 100 dalinasi be liekanos. Pvz: įvestas skaitmuo buvo 20, programos atsakymas turi būti: 5.
5. Parašykite programą, kuri priimtų savaitės dienos vardą ir atsakytų, savaitės dienos numeriu. Naudoti switch case. Pvz.: penktadienis - 5, antradienis -2.
*/
// 1. Uzduotis: skaiciu sekos (1;100) isvedimas
        for (int i = 0; i < 100; i = i + 1) {
            System.out.println(i + 1);
        }
// 2. Uzduotis: priima naudojo skaiciu ir pasako, ar jis pirminis
        // tikrinsiu, ar dalinasi be liekanos is 2 ir 3: operatorius %
        // pvz.: 10%3 yra 1 (http://www.cs.ukzn.ac.za/~hughm/java/intro/week2/21.html)
        Scanner numberScanner = new Scanner(System.in); // objektas skaiciams ivesti

        System.out.println("Iveskite sveika skaiciu");
        double firstNum = numberScanner.nextDouble(); // nuskaito ivesta skaiciu

        double k2;
        double k3;
        boolean pirminis = true;


        if (firstNum <= 1) {
            System.out.println("1. Skaicius nepirminis: " + firstNum);
        } else {
            k2 = firstNum % 2;
            k3 = firstNum % 3;

            if (k2 == 0) {
                pirminis = false;
            } else if (k3 == 0) {
                pirminis = false;
            }

            if (pirminis) {
                System.out.println("Ivedete PIRMINI skaiciu: " + firstNum);
            } else {
                System.out.println("2. Skaicius nepirminis: " + firstNum);
            }

        }
    }
}

