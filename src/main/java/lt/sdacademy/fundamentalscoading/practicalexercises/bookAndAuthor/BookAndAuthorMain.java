package lt.sdacademy.fundamentalscoading.practicalexercises.bookAndAuthor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookAndAuthorMain {
    public static void main(String[] args) {
        List<Author> authorsList = new ArrayList<>();
        //List<Author> authorsListBook = new ArrayList<>();
        List<Book> bookList = new ArrayList<>();
        int authorsNum;

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\lina\\IdeaProjects\\First project\\src\\main\\java\\lt\\sdacademy\\fundamentalscoading\\practicalexercises\\bookAndAuthor\\BookData.txt"))) {
            String line = br.readLine();

            while (line != null) {
                authorsNum = findAuthorNum(line.split(";"));

                String[] text = line.split(";");
                String[] authorText = text[1].split("-"); //autoriai atskirti -

                List<Author> authorsListBook = new ArrayList<>();

                for (int i = 0; i < authorsNum; i++) {
                    String textToAuthor = authorText[i];
                    authorsListBook.add(mapDataToAuthorObject(textToAuthor.split(",")));
                }
                authorsListBook.forEach(author -> {
                    System.out.println("Name: " + author.getName() + " Email: " + author.getEmail() + ", Phone: " + author.getPhoneNumber());
                });
                bookList.add(mapDataToBookObject(text, authorsListBook));
                authorsList.addAll(authorsListBook); // vienos knygos autorius prijungiam prie visu autoriu masyvo

                line = br.readLine(); //SKAITO SEKANCIA EILUTE!!!
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("KLAIDA!");
        }
        bookList.forEach(book -> {
            System.out.println("Title: " + book.getTitle() + ", First Author: " + book.getBookAuthors().get(0).getName() + ", Price: " + book.getPrice() + ", Quantity " + book.getQnt());
            //System.out.println("Title: " + book.getTitle() + ", Price: " + book.getPrice() + ", Quantity " + book.getQnt());
        });
    }

    private static int findAuthorNum(String[] authorData) { //
        String authorText = authorData[1];
        String[] authorTextAll = authorText.split("-");
        int authorsNum = authorTextAll.length;
        return authorsNum;
    }

    private static Author mapDataToAuthorObject(String[] authorData) { //
        //"AUthor", su laukais: "name", "email", "phoneNumber"
        return new Author(authorData[0], authorData[1], authorData[2]);
    }

    private static Book mapDataToBookObject(String[] text, List<Author> authorsListBook) { //
        //Book (String title, List<Author>bookAuthors, int price, int qnt){
        return new Book(text[0], authorsListBook, Integer.parseInt(text[2]), Integer.parseInt(text[3]));
    }
}
