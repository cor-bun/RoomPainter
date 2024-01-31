package RoomPainter;

public class Paint {

    public static int paintTheRoomInGallons(Room pR) {
        double totalSurfaceArea = 2*(pR.getLength()*pR.getHeight()) + 2*(pR.getWidth()*pR.getHeight()) + (pR.getLength()*pR.getWidth());
        double finalSurfaceArea = totalSurfaceArea - ((pR.getNumberOfWindows() * 15)) - (pR.getNumberOfDoors() * 21);
        double gallonsOfPaint = finalSurfaceArea / 350;
        return  (int) (gallonsOfPaint);
    }

    public static double paintTheRoomInQuarts(Room pR) {
        double totalSurfaceArea = 2*(pR.getLength()*pR.getHeight()) + 2*(pR.getWidth()*pR.getHeight()) + (pR.getLength()*pR.getWidth());
        double finalSurfaceArea = totalSurfaceArea - ((pR.getNumberOfWindows() * 15)) - (pR.getNumberOfDoors() * 21);
        return finalSurfaceArea / 87.5;
    }
}
