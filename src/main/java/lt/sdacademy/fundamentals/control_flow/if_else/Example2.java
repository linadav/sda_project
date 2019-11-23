package lt.sdacademy.fundamentals.control_flow.if_else;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Example2 {
    public static void main(String[] args) {
        int age = 115;

        if (age < 18) {
            System.out.println("Tu paauglys!");
        } else if (age > 100) {
            System.out.println("Tu labai senas!");
        } else {
            System.out.println("Tu suauges!");
        }
    }
}
