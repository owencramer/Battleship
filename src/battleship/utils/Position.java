/* Max Robins, Mehmet Buegel, Owen Cramer
 * 22 April 2021
 * Defines where the battleships will be placed on the board.
 */

package battleship.utils;

import battleship.constants.Constants;
import java.awt.Point;

public class Position {
    private Point from;
    private Point to;
    /* Defining some of the tools for the position calculator

     */
    public Position(Point from, Point to) {
        if (from.getX() > Constants.BOARD_SIZE || from.getX() < 0
                || from.getY() > Constants.BOARD_SIZE || from.getY() < 0
                || to.getX() > Constants.BOARD_SIZE || to.getX() < 0
                || to.getY() > Constants.BOARD_SIZE || to.getY() < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.from = from;
        this.to = to;
    }

    public Point getFrom() {
        return from;
    }

    public Point getTo() {
        return to;
    }
}
