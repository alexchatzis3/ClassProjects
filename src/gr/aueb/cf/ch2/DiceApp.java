package gr.aueb.cf.ch2;

/**
 *
 */
public class DiceApp {
    public static void main(String[] args) {
        int dice1 = (int) (Math.random() * 6) + 1;
        int dice2 = (int) (Math.random() * 6) + 1;

        System.out.printf("(%d, %d)", dice1, dice2);

    }
}
