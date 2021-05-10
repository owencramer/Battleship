/* Max Robins, Mehmet Buegel, Owen Cramer
 * 22 April 2021
 * Other program that brings the code together.
 */
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

        return Math.sqrt(Math.pow(startPointX-endPointX, 2) + Math.pow(startPointY-endPointY, 2)) + 1;
    }

    public static boolean isPointBetween(Point point, Position position) {
        Point from = position.getFrom();
        Point to = position.getTo();

        return from.getY() <= point.getY()
                && to.getY() >= point.getY()
                && from.getX() <= point.getX()
                && to.getX() >= point.getX();
    }
}
