package lt.sdacademy.fundamentals.object_oriented.bicycle;
 // kuriam OBJEKTA!
public class Bicycle {
    private int model;
    private int gear;
    private int speed;
    static int count = 0;

    public Bicycle (int model, int gear, int speed) { //konstrukriaus: vardas turi sutapti su class NAME
        this.model = model;
        this.gear = gear;
        this.speed = speed;
        this.count++;

    }
    public int getModel(){ // getteris
        return model;
    }
    public static int getCount() {
        return count;
    }
}
