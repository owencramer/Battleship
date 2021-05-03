import java.util.Random;
public class TestFeature {

}
    public static void initializecomputer() {//generate random positions for computer
        Random rand = new Random();
        for (int i=0; i<10; i++) {
            String coordinate = null;
            int column = 0;
            int row = 0;

            do {

                if (i < 6) {
                    column = rand.nextInt(8);
                    row = rand.nextInt(8);
                    coordinate = column + "" + row;
                    i++;