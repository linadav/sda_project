package lt.sdacademy.ND2.Dog.refactored;

import lt.sdacademy.ND2.Dog.Dog;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DogMainRefactored {

    private static final String FILE_LOCATION = "C:\\Users\\lina\\IdeaProjects\\First project\\src\\lt\\sdacademy\\ND2\\Dog\\refactored\\DogsData.txt";

    public static void main(String[] args) {
        //List<Dog> dogList = new ArrayList<>();
        List<Dog> dogList = getDogsFromFile();

       // System.out.println("Seniausias suo vardu " + findOldestDog(dogList));
       // System.out.println("Vidutins sunu amzius " + findAverageYearOfDogs(dogList));
    }

    private static List<Dog> getDogsFromFile() { // f-ja grazins sarasa sunu
        List<Dog> dogList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION))) {
            String line = br.readLine();
            while (line != null) {
              // String[] splittedLine =  line.split(",");
                dogList.add(mapDataToObject(line.split(","))); //istisa texta suskaidom elementus ir priskiriam list
                line = br.readLine();
                //text += line.split(","); //istisa texta suskaidom elementus
            }
        } catch (IOException e) {
            System.out.println("KLAIDA!");
        }
        return dogList; //grazinam sarasa
    }

    // paduodam stringus, gaunam nauja Dog objekta!!!
    private static Dog mapDataToObject(String[] dogsData) { // Dog pasako, kad kokia objekto forma bus grazinta
        return new Dog(dogsData[0], Integer.parseInt(dogsData[1]), dogsData[2]);
    }

    private static String findOldestDog(List<Dog> dogList) {
       /*return dogList.stream()
                .max(Comparator.comparingInt(Dog::getAge))
                .get()
                .getName();*/

        int oldestDog = dogList.get(0).getAge();
        String oldestDogName = dogList.get(0).getName();
        for (Dog dog : dogList) {
            if (oldestDog < dog.getAge()) {
                oldestDog = dog.getAge();
                oldestDogName = dog.getName();
            }
        }
        return oldestDogName;
    }

    private static double findAverageYearOfDogs(List<Dog> dogList) {
        double averageYear = 0;

        for (Dog dog : dogList) {
            averageYear += dog.getAge();
        }
        return averageYear;
    }
}


