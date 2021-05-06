package battleship.utils;

import java.awt.Point;
import java.nio.file.attribute.PosixFileAttributes;

public class Utils {
    private Utils() {

    }

    public static double distanceBetweenPoints(Point from, Point to) {
        double x1 = from.getX();
        double y1 = from.getY();
        double x2 = to.getX();
        double y2 = to.getY();

        return Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2)) + 1;
    }

    public static boolean isPointBetween(Point point, Position position)
}
