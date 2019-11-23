package lt.sdacademy.ND2.Dog;

import java.util.ArrayList;
import java.util.List;

/*
Susikurti objektą "Dog", su laukais: "name", "age", "color"
    a) Naudotojas ciklą inicializuoti 3 "Dog" objektus;
    b) Objektai turi būti saugojami sąraše (ne masyve) - List<Dog>, susikurti 3 objektus;
    c) Sukurti funkciją vyriausio šuns radimui ir jo vardo išspausdinimui;
    d) Sukurti funkciją šunų vidutiniam amžiui rasti.
 */
public class DogMain_M {

    public static void main(String[] args) {

        // a) Naudotojas ciklą inicializuoti 3 "Dog" objektus;
        // https://www.callicoder.com/java-arraylist/

        /*String name1[] = {"Sargis1", "Kukis2", "Fengas3"};
        int age1[] = {4, 44, 444};
        String color1[] = {"brawn1, wight2, black"};

        ArrayList<Dog> dogs = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            dogs.add(new Dog(name1[i], age1[i], color1[i]); // kazkas nepatinka compileriui
        }*/

        List<Dog> dogs = new ArrayList<>(); // pvz: https://www.geeksforgeeks.org/list-interface-java-examples/
         // for (int i = 0; i < 3; i++) {
         //   dogs.add(i, buildDog);
        // }
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

        dogs.forEach(dog -> {
            //System.out.println("Name: " + OldestDog(3, age, name) + dog.getName() + ", Age: " + dog.getAge() + ", Color: " + dog.getColor());
            System.out.println("Name: " + dog.getName() + ", Age: " + dog.getAge() + ", Color: " + dog.getColor());

        });

        System.out.println("Seniausias suo yra vardu: " + OldestDog(dogs));
        //System.out.println("Name: " + OldestDog(dogs));
    }
    private static String OldestDog(List<Dog> dogs) { //https://www.geeksforgeeks.org/custom-arraylist-java/

        String oldestDogName = "";
        int oldestDog = dogs.get(0).getAge();
        for (Dog dog : dogs) {
            if (oldestDog < dog.getAge()) {
                oldestDog = dog.getAge();
                oldestDogName = dog.getName();
            }
            System.out.println(dog.getAge() + " " + dog.getName() + " " + dog.getColor());
        }
        return oldestDogName;
    }
}






