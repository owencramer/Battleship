/* Battleships randomizer
 * 28 April 2021
 * Randomizes battleships on game board
 */

import java.awt.*;
import java.util.*;

public class Player {
    private int id;
    private int lives;
    Game_Generate board = new Game_Generate();
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
    }
}
