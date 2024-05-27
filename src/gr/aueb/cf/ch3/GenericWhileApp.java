package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Nested while. Το Generic While τρέχει
 * τρείς φορές.
 */
public class GenericWhileApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int beginValue = 0;
        int endValue = 0;
        int step = 0;
        int counter = 0;
        int times = 1;

        while (times <= 3) {
            System.out.println("Please insert beginValue, endValue and step.");
            beginValue = in.nextInt();
            endValue = in.nextInt();
            step = in.nextInt();

            while (beginValue <= endValue) {
                counter += 1;
                beginValue += step;
            }

            System.out.println("Iterations count " + counter);
            times++;
        }
    }
}
