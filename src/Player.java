/* Battleships randomizer
 * 28 April 2021
 * Randomizes battleships on game board
 */

import battleship.board.Board;
import battleship.constants.Constants;
import battleship.ship.Ship;

import java.awt.Point;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Player {
    private int id;
    private int lives;
    private Board board;
    private Map<Point, Boolean> targetHistory;
    private Scanner scanner;

    public Player (int id) {
        System.out.printf("%n=== Settings up everything for Player %s ====", id);
        this.id = id;
        this.lives = Constants.PLAYER_LIVES;
        this.targetHistory = new HashMap<>();
        this.scanner = new Scanner(System.in);
    }

    public int getId() {
        return id;
    }

    public int getLives() {
        return lives;
    }

    public void decrementLiveByOne() {
        lives--;
    }

    public void playerPlay(Player opponent) {
        System.out.printf("%n%nPlayer %d, Choose coordinates you want to hit (x, y) ", id);
        Point point = new Point(scanner.nextInt(), scanner.nextInt());

        while(targetHistory.get(point) != null) {
            System.out.print("This position has already been tried");
            point = new Point(scanner.nextInt(), scanner.nextInt());

        }
        attack(point, opponent);
    }

    private void attack(Point point, Player opponment) {
        Ship ship = opponment.board.targetShip(point);
        boolean isShipHit = (ship != null) ? true : false;

        if (isShipHit) {
            ship.shipWasHit();
            opponment.decrementLiveByOne();
            targetHistory.put(point, isShipHit);
            System.out.printf("Player %d, targets (%d, %d)",
                    id, (int)point.getX(), (int)point.getY());
            System.out.println("...and " + ((isShipHit) ? "HITS!" : "misses..."));
        }
    }
}