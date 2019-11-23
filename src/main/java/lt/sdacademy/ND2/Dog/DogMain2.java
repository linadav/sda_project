package lt.sdacademy.ND2.Dog;

import sun.plugin.javascript.navig.Array;

import java.util.ArrayList;
import java.util.List;

/*
Susikurti objektą "Dog", su laukais: "name", "age", "color"
    a) Naudotojas ciklą inicializuoti 3 "Dog" objektus;
    b) Objektai turi būti saugojami sąraše (ne masyve) - List<Dog>, susikurti 3 objektus;
    c) Sukurti funkciją vyriausio šuns radimui ir jo vardo išspausdinimui;
    d) Sukurti funkciją šunų vidutiniam amžiui rasti.
 */
public class DogMain2 {
    public static void main(String[] args) {

        // a) Naudotojas ciklą inicializuoti 3 "Dog" objektus;
        // https://www.callicoder.com/java-arraylist/

        List<Dog> dogs = new ArrayList<>(); // pvz: https://www.geeksforgeeks.org/list-interface-java-examples/
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                dogs.add(new Dog("Sargis", 4, "brawn"));
            }
            if (i == 1) {
                dogs.add(new Dog("Kukis", 6, "white"));
            }
            if (i == 2) {
                dogs.add(new Dog("Fengas", 10, "black"));
            }
        }
        //List <Dog> dog = Arrays.asList()
        dogs.forEach(dog -> {
            System.out.println("Name: " + dog.getName() + ", Age: " + dog.getAge() + ", Color: " + dog.getColor());
        });
        //System.out.println("Name: " + OldestDog(dogs));
    }
/*
   // private static String OldestDog(int[] dogAge, String[] dogName, int num) {
     private static String OldestDog(ArrayList <Dog> dogs)   {

        int maxNum = dogs.size();
        int iMaxNum = 0;
        for (int i = 1; i < dog.; i++) {
            int intNum = dogAge[i];
            if (intNum > maxNum) {
                maxNum = intNum;
                iMaxNum = i;
            }
        }
        return dogName[iMaxNum];
    }*/
}



