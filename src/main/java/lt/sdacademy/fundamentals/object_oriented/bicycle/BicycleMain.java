package lt.sdacademy.fundamentals.object_oriented.bicycle;

public class BicycleMain {
    public static void main(String[] args){
        Bicycle bike = new Bicycle(75, 2,20);

        bike.getModel(); // grazina 75
        System.out.println(bike.getModel()); //isveda i ekrana 75

        int model = bike.getModel();
        System.out.println("Model is: " + model); // isveda i ekrana 1

        System.out.println(Bicycle.count);
        Bicycle anotherBike = new Bicycle(80, 4, 25);
        System.out.println(Bicycle.count);

        System.out.println(Bicycle.count == bike.count);
        System.out.println(bike.count == anotherBike.count);
    }
}
