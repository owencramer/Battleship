/* Max Robins, Mehmet Buegel, Owen Cramer
 * Generates the ships and counts how many lives you have left.
 * 22 April 2021
 */

package battleship.ship;

import battleship.utils.Position;

public class Ship {
    private String name;
    private int size;
    private int livesLeft;
    private boolean isSunk;
    private Position position;

    public Ship(String name, int size) {
        this.name = name;
        this.size = size;
        this.livesLeft = size;
        this.isSunk = false;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getLivesLeft() {
        return livesLeft;
    }

    public boolean isSunk() {
        return isSunk;
    }

    public void setSunk(boolean sunk) {
        isSunk = sunk;
    }
}
