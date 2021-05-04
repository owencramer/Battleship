/* Generates Battleship board
 * 27 April 2021
 */

public class Game_Generate {
    final private int[] labelsNum = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    private void printLine(int dots, boolean newLine) {
        for (int i = 0; i < dots; i++) {
            System.out.print(labelsNum[i] + " * ");
        }
        if (newLine) System.out.println();
    }


    public void printBoard() {
        printLine(11, true);
        printLine(11, true);
        printLine(11, true);
        printLine(11, true);
        printLine(11, true);
        printLine(11, true);
        printLine(11, true);
        printLine(11, true);
        printLine(11, true);
        printLine(11, true);
        printLine(11, true);
    }

    public void printLogo() {

    }
}