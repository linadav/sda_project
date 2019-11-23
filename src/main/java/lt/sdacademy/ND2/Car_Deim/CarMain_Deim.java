package lt.sdacademy.ND2.Car_Deim;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarMain_Deim {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            carList.add(buildCar());
        }

        System.out.println("Naujausias automobilis: " + findNewestCar(carList));
        System.out.println("Vidutinis automobilių amžius: " + findAverageCarsYear(carList));
        System.out.println("Brangiausias automobilis: " + findMostExpensiveCar(carList));

    }

    private static Car buildCar() {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Įveskite automobilio markę");
        String model = inputScanner.nextLine();

        System.out.println("Įveskite automobilio tipą");
        String type = inputScanner.nextLine();

        System.out.println("Įveskite variklio tūrį");
        int engine = inputScanner.nextInt();

        System.out.println("Įveskite automobilio pagaminimo metus");
        int year = inputScanner.nextInt();

        System.out.println("Įveskite automobilio kainą");
        double price = inputScanner.nextDouble();

        return new Car(model, engine, year, price, type);
    }

    private static String findNewestCar(List<Car> carList) {
        /*return carList.stream()
                .max(Comparator.comparingInt(Car::getYear))
                .get()
                .toString();*/

        int newestCarMadeIn = carList.get(0).getYear();
        for (Car car : carList) {
            newestCarMadeIn = Math.max(newestCarMadeIn, car.getYear());
        }

        return String.valueOf(newestCarMadeIn);
    }

    private static double findAverageCarsYear(List<Car> carList) {
        int carsYearSum = 0;

        for (Car car : carList) {
            carsYearSum += car.getYear();
        }

        return (double) carsYearSum / carList.size();
    }

    private static double findMostExpensiveCar(List<Car> carList) {
        /*return carList.stream()
                .max(Comparator.comparingDouble(Car::getPrice))
                .get()
                .toString();*/

        double mostExpensiveCar = carList.get(0).getPrice();
        for (Car car : carList) {
            mostExpensiveCar = Math.max(mostExpensiveCar, car.getPrice());
        }
        return mostExpensiveCar;
    }
}

