package lt.sdacademy.person;

import java.util.Scanner; // importuojam objekta Scanner

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Jusu vardas:");
        String name = input.nextLine();

        System.out.println("Jusu amzius");
        int age = input.nextInt();

        System.out.println("Jusu ugis, m"); // ivedimas: "1.8" nesupranta; "1,8" ok
        double tall = input.nextDouble();

        System.out.println("Vardas: " + name);
        System.out.println("Amzius: " + age);
        System.out.println("Ugis: " + tall);

        Person zmogusA = new Person(name, age, tall); // inicializuojam nauja Person objekta
       //  Person zmogusB = new Person(name, age, tall);
    }
}
