package RoomPainter;

public class Paint {
    public int paintTheRoomInGallons (Room pR) {
        double totalSurfaceArea = 2*(pR.getLength()*pR.getHeight()) + 2*(pR.getWidth()*pR.getHeight()) + (pR.getLength()*pR.getWidth());
        double finalSurfaceArea = totalSurfaceArea - (((pR.getNumberOfWindows() * 15)) + (pR.getNumberOfDoors() * 21));
        double gallonsOfPaint = finalSurfaceArea / 350;
        return  (int) (gallonsOfPaint);

    }

    public double paintTheRoomInQuarts (Room pR) {
        double totalSurfaceArea = 2*(pR.getLength()*pR.getHeight()) + 2*(pR.getWidth()*pR.getHeight()) + (pR.getLength()*pR.getWidth());
        double finalSurfaceArea = totalSurfaceArea - ((pR.getNumberOfWindows() * 15)) - (pR.getNumberOfDoors() * 21);
        double gallonsOfPaint = finalSurfaceArea / 350;
        return gallonsOfPaint * 4;
    }
}
