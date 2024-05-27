package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού επιλογών με do/while. Η do/while
 * εκτελείται οπωσδήποτε 1 φορά.
 */
public class MenuApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Επιλέξτε μία από τις παρακάτω CRUD επιλογές. Επιλέξτε το 0 για έξοδο.");
            System.out.println("1.Εισαγωγή (insert) προιόντος");
            System.out.println("2.Ενημέρωση (update) προιόντος");
            System.out.println("3.Διαγραφή (delete) προιόντος");
            System.out.println("4.Αναζήτηση (select) προιόντος");
            choice = in.nextInt();
        } while (choice != 0);

        System.out.println("Ευχαριστούμε!");
    }
}
