package lt.sdacademy.fundamentals.control_flow.switch_case;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] arga) {
        //Scanner scanner= new Scanner(System.in);
        char direction = 'w';
       // char direction = scanner.next().charAt();

        switch (direction) {
            case 'n':
                System.out.println("Keliaujame i siaure!");
                break;
            case 's':
                System.out.println("Keliaujame i pietus!");
                break;
            case 'e':
                System.out.println("Keliaujame i rytus!");
                break;
            case 'w':
                System.out.println("Keliaujame i vakarus!");
                break;
            default:
                System.out.println("Keliaujame kazhikur!");
        }
    }
}
