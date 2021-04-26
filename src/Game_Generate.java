public class Game_Generate {
    private void printLine(int dots, boolean newLine) {
        for (int i = 0; i < dots; i++) {
            System.out.print(" * ");
        }
        if (newLine) System.out.println();
    }

    private void printBoardOne() {
        for (int i = 12; i > 1; i--) {
            System.out.print(" * ");
        }
    }

    private void printBoardTwo() {

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