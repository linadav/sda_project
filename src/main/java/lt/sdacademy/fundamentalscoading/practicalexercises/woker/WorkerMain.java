package lt.sdacademy.fundamentalscoading.practicalexercises.woker;

import com.google.common.primitives.Chars;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static lt.sdacademy.fundamentalscoading.practicalexercises.woker.Util.FILE_LOCATION2;

public class WorkerMain {

    public static void main(String[] args){
        List <Worker> workerList = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION2))){
            String line = br.readLine();

            while (line != null){
                workerList.add(mapDataToObject(line.split(",")));
                // System.out.println("Darbuotojas: " + workerList.get());
                line = br.readLine();
            }
        } catch (IOException e){
            System.out.println("Klaidele!");
        }

        System.out.println("Vidutinis darbuotoju amzius ir atlyginimas: " + averageAge(workerList));
        System.out.println("Daugiausiai uzdirbantis darbuotojas");
        System.out.println("Jauniausias darbuotojas");

        System.out.println("Programos pabaiga!");
    }

    private static double averageAge(List<Worker> workerList){
        double yearsSum = 0;

        for(Worker worker : workerList){
            yearsSum += worker.getAge();
        }
        return yearsSum/ workerList.size();
    }

    private static Worker mapDataToObject(String[] workerData) { //  pasako, kad kokia objekto forma bus grazinta
        String charForGender = workerData[3];
        char charGender = charForGender.charAt(0);
        //         Worker(String name, int salary, int age, char gender){
        System.out.printf("Darbuotojas: %s %s %s %s ", workerData[0], Integer.parseInt(workerData[1]), Integer.parseInt(workerData[2]), charGender);
        System.out.println();
        return new Worker(workerData[0], Integer.parseInt(workerData[1]), Integer.parseInt(workerData[2]), charGender);
    }
}
