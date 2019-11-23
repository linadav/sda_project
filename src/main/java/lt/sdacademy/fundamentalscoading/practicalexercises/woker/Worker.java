package lt.sdacademy.fundamentalscoading.practicalexercises.woker;

public class Worker {
    private String name;
    private int salary;
    private int age;
    private char gender;
    static int count = 0;

    public Worker(String name, int salary, int age, char gender){
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
        count++;
    }

    public String getName () {
        return name;
    }
    public int getSalary(){
        return salary;
    }
    public int getAge(){
        return age;
    }
    public char getGender(){
        return gender;
    }
}

