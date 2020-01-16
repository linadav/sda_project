package lt.sdacademy.advancedfeatures.yieldVoice_Inheritance;

import lt.sdacademy.advancedfeatures.yieldVoice_Inheritance.Animal;

// Extends is what you use to declare that this class is a subclass of the specified class.
// You can only ever extend ONE class.
//Read more: https://www.java-made-easy.com/java-inheritance.html#ixzz6B8jyCF43
public class Cat extends Animal {
   // private String catVoice;

    public Cat (int weight, int height) {
        super(weight,height);
    }

    public String getCatVoice() {
        return "miau";
    }
}
