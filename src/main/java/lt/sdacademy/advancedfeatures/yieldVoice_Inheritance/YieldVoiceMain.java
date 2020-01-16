package lt.sdacademy.advancedfeatures.yieldVoice_Inheritance;

import lt.sdacademy.advancedfeatures.yieldVoice_Inheritance.Animal;
import lt.sdacademy.advancedfeatures.yieldVoice_Inheritance.Cat;
import lt.sdacademy.advancedfeatures.yieldVoice_Inheritance.Dog;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class YieldVoiceMain {
    public static void main(String[] args) {
        Animal[] animals = {new Cat(5, 20), new Dog(20, 50)};
        for (Animal a : animals) {
            System.out.println("Animal says: " + yieldVoice(a.getClass().toString(), a));
        }
    }

    public static String yieldVoice(String animal, Animal a) {
        if (animal.contains(".Dog")) {
            Dog dog = new Dog(a.getWeight(), a.getHeight());
            return dog.getDogVoice();
        }
        if (animal.contains(".Cat")) {
            Cat cat = new Cat(a.getWeight(), a.getHeight());
            return cat.getCatVoice();
        }
        return "nepazistamas gyvunas";
    }
    /*
    public static String yieldVoice(Dog animal) {
        Dog dog = new Dog(animal.getWeight(), animal.getHeight());
        return dog.getDogVoice();
    }

    public static String yieldVoice(Cat animal) {
        Cat cat = new Cat(animal.getWeight(), animal.getHeight());
        return cat.getCatVoice();
    }     */

}
