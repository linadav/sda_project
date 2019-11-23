package lt.sdacademy.ND2.Dog;

public class Dog {

    private String name;
    private int age;
    private String color;
    static int count = 0;

    public Dog(String name, int age, String color) { //konstruktoriaus: vardas turi sutapti su class NAME
        this.name = name;
        this.age = age;
        this.color = color;
        this.count++;

    }

    public String getName() { // getteris
        return name;
    }

    public int getAge() { // getteris
        return age;
    }

    public String getColor() { // getteris
        return color;
    }

    public static int getCount() {
        return count;
    }
}
