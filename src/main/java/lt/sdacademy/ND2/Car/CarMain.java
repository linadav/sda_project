package lt.sdacademy.ND2.Car;

import lt.sdacademy.ND2.Dog.Dog;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static lt.sdacademy.ND2.Car.Util.FILE_LOCATION1;
import static lt.sdacademy.fundamentals.file_read.Util.FILE_LOCATION;

/*
Susikurti objektą "Car", su laukais: "model", "engine", "year", "price", "type (sedan, touring, suv)"
    a) Inicializuoti 5 "Car" objektus naudojantis ciklą;
    b) Objektai turi būti saugomi sąraše - List<Car>;
    c) Sukurti funkciją naujausiam automobiliui rasti ir išspausdinti automobilio metus;
    d) Sukurti funkciją vidutiniam automobilių amžiui gauti;
    e) Sukurti funkciją brangiausiam automobiliui rasti.
 */
public class CarMain {
    public static void main(String[] args) {
        try (Scanner fileScanner = new Scanner(new File(FILE_LOCATION))) {
            while (fileScanner.hasNext()) {
                System.out.println(fileScanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("KLAIDA!");
        }

        List<Car> carList = getCarsFromFile();
        carList.forEach(car -> {
            //System.out.println("Name: " + OldestDog(3, age, name) + dog.getName() + ", Age: " + dog.getAge() + ", Color: " + dog.getColor());
            System.out.println("Model: " + car.getModel() + ", Engine: " + car.getEngine() + ", Year: " + car.getYear() + "Price: " + car.getPrice() + ", Type: " + car.getType());
        });

        System.out.println("Naujausias automobilis: " + findNewestCar(carList));
        System.out.println("Vidutinis automobiliu amzius: " + findAverageCarsYear(carList));
        System.out.println("Automobilio automobilio kaina: " + findMostExpansiveCar(carList)); //Math.max
    }

    private static String findNewestCar(List<Car> carList) {
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

    private static String findMostExpansiveCar(List<Car> carList) {
        double maxPrice = carList.get(0).getPrice();

        for (Car car : carList) {
            maxPrice = Math.max(maxPrice, car.getPrice());
        }
       //  return maxPrice;
        return String.valueOf(maxPrice);
    }
    private static List<Car> getCarsFromFile() { // f-ja grazins sarasa auto
        List<Car> carList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION1))) {
            String line = br.readLine();
            while (line != null) {
                carList.add(mapDataToObject(line.split(","))); //istisa texta suskaidom elementus ir priskiriam list
                line = br.readLine();
            }
            return carList; //grazinam sarasa
        } catch (IOException e) {
            System.out.println("KLAIDA!");
        }
        return null;
    }

    //Priskiria nuskaityta teksta objektui "Car", su laukais: "model", "engine", "year", "price", "type (sedan, touring, suv)"
    private static Car mapDataToObject(String[] carsData) { // Dog pasako, kad kokia objekto forma bus grazinta
        return new Car(carsData[0], Integer.parseInt(carsData[1]), Integer.parseInt(carsData[2]), Double.parseDouble(carsData[3]), carsData[4]);
    }
}
