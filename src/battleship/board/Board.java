/* Generates board
 * Mehmet, Owen, Max
 */

package battleship.board;

import battleship.constants.Constants;
import battleship.ship.Ship;
import battleship.utils.Position;
import battleship.utils.Utils;

import java.awt.Point;
import java.nio.channels.Pipe;
import java.util.Scanner;

public class Board {
    private static final Ship[] ships;
    private char[][] board;

    static {
        ships = new Ship[]{
                new Ship("Carrier", Constants.CARRIER_SIZE),
                new Ship("Battleship", Constants.BATTLESHIP_SIZE),
                new Ship("Cruiser", Constants.CRUISER_SIZE),
                new Ship("Submarine", Constants.SUBMARINE_SIZE),
                new Ship("Destroyer", Constants.DESTROYER_SIZE)
        };
    }

    public Board() {
        board = new char[Constants.BOARD_SIZE][Constants.BOARD_SIZE];

        for (int i = 0; i < Constants.BOARD_SIZE; i++) {
            for (int j = 0; j < Constants.BOARD_SIZE; j++) {
                board[i][j] = Constants.BOARD_ICON;
            }
        }

        placeShipsOnBoard();
    }

    public Ship targetShip(Point point) {
        boolean isHit = false;
        Ship hitShip = null;
        for (int i = 0; i < ships.length; i++) {
            Ship ship = ships[i];
            if (ship.getPosition() != null) {
                if (Utils.isPointBetween(point, ship.getPosition())) {
                    isHit = true;
                    hitShip = ship;
                    break;
                }
            }
        }
        final char result = isHit ? Constants.SHIP_IS_HIT_ICON : Constants.SHOT_MISSED_ICON;
        updateShipOnBoard(point, result);
        printBoard();

        return (isHit) ? hitShip : null;
    }

    private void placeShipsOnBoard() {
        System.out.printf("%nAlright - Time to place out your ships%n%n");
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < ships.length; i++) {
            Ship ship = ships[i];
            boolean isShipPlacemenLegal = false;

            System.out.printf("%nEnter position of %s (length %d): ", ships.getName(), ship.getSize());
            while (!isShipPlacemenLegal) {
                try {
                    Point from = new Point(s.nextInt(), s.nextInt());
                    Point to = new Point(s.nextInt(), s.nextInt());

                    while (ship.getSize() != Utils.distanceBetweenPoints(from, to)) {
                        System.out.printf("The ship is currently being placed on the board is of length: %d. Change your coordinates and try again",
                                ship.getSize());
                        from = new Point(s.nextInt(), s.nextInt());
                        to = new Point(s.nextInt(), s.nextInt());
                    }
                    Position position = new Position(from, to);

                    if (!isPositionOccupied(position)) {
                        drawShipOnBoard(position);
                        ship.setPosition(position);
                        isShipPlacemenLegal = true;
                    } else {
                        System.out.println("A ship in that position already exists. Please try again.")
                    }
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Invalid coordinates - Outside board!");
                }
            }
        }
    }

    private void updateShipOnBoard(Point point, final char result) {
        int x = (int) point.getX() - 1;
        int y = (int) point.getY() - 1;
        board[y][x] = result;
    }

    private boolean isPositionOccupied(Position position) {
        boolean isOccupied = false;
        Point from = position.getFrom();
        Point to = position.getTo();

        outer:
        for (int i = (int) from.getY() - 1; i < to.getY(); i++) {
            for (int j = (int) from.getX() - 1; j < to.getX(); j++) {
                if (board[i][j] == Constants.SHIP_ICON) {
                    isOccupied = true;
                    break outer;
                }
            }
        }

        return isOccupied;
    }
}