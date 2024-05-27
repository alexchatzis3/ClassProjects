package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει τρείς δεκαδικούς που αναπαριστούν τις πλευρές
 * ενός τριγώνου, και το πρόγραμμα ελέγχει άν το τρίγωνο είναι
 * ορθογώνιο.
 */
public class RightTriangleApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final double EPSILON = 0.000005;
        double a = 0.0; //Υποτείνουσα
        double b = 0.0;
        double c = 0.0;
        boolean isRight = false;

        System.out.println("Παρακαλώ εισάγετε τις τρείς πλευρές του τριγώνου.");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        isRight = Math.abs(a*a - b*b - c*c) <= EPSILON;

        System.out.println("Triangle is right: " + isRight);
    }
}
