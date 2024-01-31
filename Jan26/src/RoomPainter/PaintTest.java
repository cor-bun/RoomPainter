package RoomPainter;

public class PaintTest {

    public static Room roomOne = new Room(12.5, 14.4, 7.8, 2, 2);

    public static void main(String[] args) {
        int gallonsRoomOne = Paint.paintTheRoomInGallons(roomOne);
        System.out.println("Room one requires " + gallonsRoomOne + " gallons of paint.");
        double quartsRoomOne = Paint.paintTheRoomInQuarts(roomOne);
        System.out.println("Room one requires " + quartsRoomOne + " quarts of paint.");
    }
}
