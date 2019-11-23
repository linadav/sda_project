package lt.sdacademy.ND2.Car_Deim;
//Susikurti objektą "Car", su laukais: "model", "engine", "year", "price", "type (sedan, touring, suv)"

public class Car {
    private String model;
    private int engine;
    private int year;
    private double price;
    private String type;
    static int count = 0;

    public Car(String model, int engine, int year, double price, String type) {
        this.model = model;
        this.engine = engine;
        this.year = year;
        this.price = price;
        this.type = type;
        count++;
    }

    public String getModel() {
        return model;
    }

    public int getEngine() {
        return engine;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return engine;
    }

    public String getType() {
        return type;
    }

    public static int getCount() {
        return count;
    }
}
