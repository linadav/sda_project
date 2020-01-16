package lt.sdacademy.advancedfeatures.object;
// Create class Pocket.
//       a) Add field „money", create constructor, getter and setter.
//      b) Add verification for both getter and setter. Getter should result in returning as much money, as the user asked for. It should return 0 if money <= 10.
//        c) Setter should not accept values below 0 and greater than 3000. It may print a message like „I don't have enough space in my pocket for as much money!"

public class PocketMain {
    public static void main (String [] args){
        int newMoney = 3500;

        Pocket pocket = new Pocket(0);
        System.out.println("Pinigai:" + pocket.getMoney());

        pocket.setMoney(newMoney);
        System.out.println("Pinigai:" + pocket.getMoney());

        newMoney = 30;
        pocket.setMoney(newMoney);
        System.out.println("Pinigai:" + pocket.getMoney());

        newMoney = 50;
        pocket.setMoney(newMoney);
        System.out.println("Pinigai:" + pocket.getMoney());
    }
}
