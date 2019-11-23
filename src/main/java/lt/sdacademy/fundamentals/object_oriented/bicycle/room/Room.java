package lt.sdacademy.fundamentals.object_oriented.bicycle.room;

public class Room {
    private int length;
    private int height;

    public Room(int length, int height) {
        this.length= length;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }
}
