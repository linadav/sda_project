package lt.sdacademy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.print("Labas rytas");
        System.out.println();
        System.out.println(20 * 5);
        System.out.println(20 / 5);
        // masyvas
        int[] array = new int[2];
        array[0] = 54;
        array[1] = 123;
        // for (int i = 0; i < array.length; i = i + 1) {
        for (int i = 0; i < array.length; i = i + 1) {
            System.out.println(array[i]);
            System.out.println("Result: " + array[i] + array[i] + " Ajajai");
            System.out.println(array[i] + array[i]);
            System.out.println("Result: " + (array[i] + array[i]) + " Ajajai");
        }
        // lauziam cikla
        for (int i = 0; i < 5; i = i + 1) {
           if (i<2) { // iskart "else if" negali buti!!!
                System.out.println("Int maziau uz 2");
           } else if (i == 3) {
                System.out.println("Indeksas lygus 3-ims");
           } else {
               System.out.println("Indeksas daugiau uz 3");
           }

            /*try {
                System.out.println(array[i]);
            } catch (Exception exception) {
                System.out.println("KLAIDA" + exception);
            } */
        }

    }
}
