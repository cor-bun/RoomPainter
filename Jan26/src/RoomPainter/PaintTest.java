package RoomPainter;

public class PaintTest {

    static Room roomOne = new Room(12.5, 14.4, 7.8, 2, 2);

    public static void main(String[] args) {
        System.out.println("Room one requires " + roomOne.paintTheRoomInGallons + " gallons of paint.");
        System.out.println("Room one requires " + roomOne.paintTheRoomInQuarts + " quarts of paint.");
    }
}
