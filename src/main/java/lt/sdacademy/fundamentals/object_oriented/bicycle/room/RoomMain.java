package lt.sdacademy.fundamentals.object_oriented.bicycle.room;

import java.util.Scanner;

public class RoomMain {
    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in); // objektas skaiciams ivesti

        System.out.println("Iveskite kampario auksti: ");
        int roomHeight = numberScanner.nextInt();

        System.out.println("Iveskite kampario ilgi: ");
        int roomLength = numberScanner.nextInt();

        Room room = new Room(roomHeight, roomLength);

        //int squareOfRoom = room.getHeight() * room.getLength();
        int squareOfRoom = getSquareOfRoom(room.getLength(), room.getHeight());
        System.out.println("KAMBARIO PLOTAS " + squareOfRoom + " kv.m");
    }

    private static int getSquareOfRoom(int length, int width) { // F U N K C I J A
        return length * width;
    }
}
