package battleship.utils;

import java.awt.Point;

public class Utils {
    private Utils() {

    }

    public static double distanceBetweenPoints(Point from, Point to) {
        double startPointX = from.getX();
        double startPointY = from.getY();
        double endPointX = to.getX();
        double endPointY = to.getY();

        return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)) + 1;
    }

    public static boolean isPointBetween(Point point, Position position) {
        Point from =
    }
}
