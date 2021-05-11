/* Player
 * Max Robins, Mehmet Buegel, Owen Cramer
 * 10 May 2021
 * Sets up the player ships
 */

package battleship.player;

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
        this.board = new Board();
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

    public void turnToPlay(Player opponent) {
        System.out.printf("%n%nPlayer %d, Choose coordinates you want to hit (x, y) ", id);
        Point point = new Point(scanner.nextInt(), scanner.nextInt());

        while(targetHistory.get(point) != null) {
            System.out.print("This position has already been tried");
            point = new Point(scanner.nextInt(), scanner.nextInt());

        }
        attack(point, opponent);
    }

    private void attack(Point point, Player opponent) {
        Ship ship = opponent.board.targetShip(point);
        boolean isShipHit = (ship != null) ? true : false;

        if (isShipHit) {
            ship.shipWasHit();
            opponent.decrementLiveByOne();
        }
        targetHistory.put(point, isShipHit);
        System.out.printf("Player %d, targets (%d, %d)",
                id, (int)point.getX(), (int)point.getY());
        System.out.println("...and " + ((isShipHit) ? "HITS!" : "misses..."));
    }
}
