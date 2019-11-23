package lt.sdacademy.fundamentalscoading.practicalexercises.bookAndAuthor;

public class Author {
    //Susikurti objektą "AUthor", su laukais: "name", "email", "phoneNumber"

    private String name;
    private String email;
    private String phoneNumber;
    static int count = 0;

    public Author(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        count++;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static int getCount() {
        return count;
    }

    public String toSting(){
        return String.format("Autoriaus vardas: %s, pastas: %s", name, email);
    }
}
