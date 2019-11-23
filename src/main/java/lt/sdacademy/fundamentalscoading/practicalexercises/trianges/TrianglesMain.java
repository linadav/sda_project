package lt.sdacademy.fundamentalscoading.practicalexercises.trianges;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TrianglesMain {
    private static final String INPUT_FILE_LOCATION = "C:\\Users\\lina\\IdeaProjects\\First project\\src\\main\\java\\lt\\sdacademy\\fundamentalscoading\\practicalexercises\\trianges\\triangleData.txt";
    private static final String OUTPUT_FILE_LOCATION = "C:\\Users\\lina\\IdeaProjects\\First project\\src\\main\\java\\lt\\sdacademy\\fundamentalscoading\\practicalexercises\\trianges\\triangleWrite.txt";

    public static void main(String[] args) {
        List<Triangle> triangles = getTrianglesFromFile();

        calculateTrianglePerimeter(triangles);
        writeTrianglePerimeterToFile(triangles);
    }

    private static List<Triangle> getTrianglesFromFile() { // f-ja grazins sarasa auto
        List<Triangle> triangles = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_LOCATION))) {
            String line = br.readLine();
            while (line != null) {
                triangles.add(mapInfoToModel(line)); //istisa texta suskaidom elementus ir priskiriam list
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("KLAIDA!");
        }
        return triangles; //grazinam sarasa
    }

    private static void calculateTrianglePerimeter(List<Triangle> triangles) {
        for (Triangle t : triangles) {
            int sum = t.getA() + t.getB() + t.getC();
            t.setPerimeter(sum);
        }
    }

    // public Triangle(int a, int b, int c, TriangleType triangleType)
    private static Triangle mapInfoToModel(String line) {
        String[] splittedLine = line.split(",");
        return new Triangle(Integer.parseInt(splittedLine[0]),
                Integer.parseInt(splittedLine[1]),
                Integer.parseInt(splittedLine[2]),
                TriangleType.valueOf(splittedLine[3]));
    }

    private static void writeTrianglePerimeterToFile(List<Triangle> triangles) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE_LOCATION))) {
            for (Triangle t : triangles) {
                bw.write("Trikampio tipas: " + t.getTriangleType().getTriangleDescription() + " perimetras: " + t.getPerimeter() + "\r\n");

                }
        } catch (FileNotFoundException e) {
            System.out.println("Failas nerastas!");
        } catch (IOException e) {
            System.out.println("Ivyko klaida rasant duomenis i faila!");
        }
    }
}
