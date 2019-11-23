package lt.sdacademy.fundamentals.arrays;

import java.util.Arrays;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {

        int[] arrayOfInts = {10, 15, 20, 25, 30};

        System.out.println(arrayOfInts[0]); //prints 10
        System.out.println(arrayOfInts[2]);
        System.out.println(arrayOfInts[4]);

        // METODAS 1: isspausdins 10 15 ...
        for (int i = 0; i < arrayOfInts.length; i++) {
            System.out.println(arrayOfInts[i] + " ");
        }

        System.out.println(); // tuscia ln

        // METODAS 2: isspausdins 10 15 ...
        for (int i : arrayOfInts) {
            System.out.println(i + " ");
        }
        // METODAS 3: isspausdins 10 15 ... funkcinis programavimas!
        List<Integer> integerList = Arrays.asList(10, 15, 20, 25, 30); //Alt + enter: pasirenkame "Import call"
        integerList.forEach(number -> System.out.println(number + " "));

    }
}
