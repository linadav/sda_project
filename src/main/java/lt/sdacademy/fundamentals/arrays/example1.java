package lt.sdacademy.fundamentals.arrays;

public class example1 {
    public static void main(String[] args) {

        int[] arraysOfInts = new int[5];
        // inicializavimas
        arraysOfInts[0] = 10;
        arraysOfInts[1] = 15;
        arraysOfInts[2] = 20;
        arraysOfInts[3] = 25;
        arraysOfInts[4] = 30;
/*
        for (int value: arraysOfInts) {
            System.out.println(value);
        }
 */
        for (int i = 0; i < arraysOfInts.length + 1; i++) {
            try {
                System.out.println(arraysOfInts[i]);
            } catch (Exception e) {
                System.out.println("KLAIDA !");
            }
        }
    }
}