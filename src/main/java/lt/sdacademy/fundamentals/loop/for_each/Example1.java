package lt.sdacademy.fundamentals.loop.for_each;

public class Example1 {
    public static void main(String[] args) {

        Animal dog = new Animal("Boss", "Kovinis");
        Animal cat = new Animal("Dolly", "Ciau ciau");

        Animal[] animals = {dog, cat};

        for (Animal anim : animals) {
            System.out.println(anim.getName());
            System.out.println(anim.getBreed());
        }
    }
}

class Animal { // objektas
    //kintamieji
    private String name;
    private String breed;

    // Kontruktorius
    Animal(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    //Kintamojo getteris
    public String getName() {
        return name;
    }
    public String getBreed() {
        return breed;
    }
}
