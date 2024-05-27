package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Λαμβάνει από τον χρήστη έναν ακέραιο που συμβολίζει
 * ένα ποσό σε ευρώ και τα μετατρέπει με βάση κάποια
 * ισοτιμία(parity) σε US Dollars US Cents.
 */
public class EuroToUSConverter {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση
        Scanner in = new Scanner(System.in);
        int euros = 0;
        int dollars = 0;
        int totalCents = 0;
        int remainingCents = 0;
        final int US_PARITY = 99;

        //Εντολές
        System.out.println("Please insert the amount in euro");
        euros = in.nextInt();

        totalCents = euros * US_PARITY;
        dollars = totalCents / 100;
        remainingCents = totalCents % 100;

        //Εκτύπωση αποτελέσματος
        System.out.printf("%,d euros = %,d total cents = %,d dollars and %,d cents", euros,
                totalCents, dollars, remainingCents);
    }
}
