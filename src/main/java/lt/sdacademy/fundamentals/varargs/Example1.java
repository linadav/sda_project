package lt.sdacademy.fundamentals.varargs;

public class Example1 {
    public static void main(String[] args) {

        System.out.println(sum(1, 2, 3, 4)); // 10
        System.out.println(sum(1)); // 1
        System.out.println(sum()); //0
    }

    private static int sum(int... elements) { // viena skaiciu seka, parametras gali buti pries seka: (int a, int... elements)
        int result = 0;

        for (int i : elements) {
            result += i;
        }
        return result;
    }
}


