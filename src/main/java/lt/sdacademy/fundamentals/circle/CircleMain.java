package lt.sdacademy.fundamentals.circle;

import lt.sdacademy.fundamentals.object_oriented.bicycle.Bicycle;

import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        // naudotojas turi ivesti apskritimo ilgi
        Scanner inputScanner = new Scanner(System.in); // objektas skaiciams ivesti

        System.out.println("Iveskite apritimo ilgi: ");
        int radius = inputScanner.nextInt();
        System.out.println("Apskritinimo ilgis: " + radius);

        Circle circle = new Circle(radius, "baltas");
        double circleArea = getCircleArea(circle);
        System.out.printf("Apskritinimo plotas: %.2f", circleArea);


    }

    private static double getCircleArea(Circle circle) { // F U N K C I J A
        return Math.pow(circle.getRadius(),2) * Math.PI; // apskritimo plotas
    }
}
