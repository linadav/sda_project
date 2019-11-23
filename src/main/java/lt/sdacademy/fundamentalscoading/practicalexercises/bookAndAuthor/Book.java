package lt.sdacademy.fundamentalscoading.practicalexercises.bookAndAuthor;

import java.util.List;

public class Book {
    private String title;
    private List<Author> bookAuthors;
    private int price;
    private int qnt;
    static int count = 0;

    public Book (String title, List<Author>bookAuthors, int price, int qnt){
            this.title = title;
            this.price = price;
            this.qnt = qnt;
            this.bookAuthors = bookAuthors;
            count++;
    }

    public String getTitle(){
        return title;
    }
    public int getQnt(){
        return qnt;
    }

    public int getPrice (){
        return price;
    }

    public List<Author> getBookAuthors(){
        return bookAuthors;
    }

    public static int getCount(){
        return count;
    }


}
