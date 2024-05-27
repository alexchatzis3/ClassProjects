package gr.aueb.cf.ch2;

import java.util.Locale;

/**
 * Output Demo
 *
 * @author alexha
 */
public class OutputApp {

    public static void main(String[] args) {
        int num = 1;
        long num2 = 201238942;

        /*System.out.println("Hello");
        System.out.print("Hello2");
        System.out.println();
        System.out.printf("Hello");

        System.out.println("Num is " + num);
        System.out.printf("Num is %d", num);*/

        System.out.printf(Locale.forLanguageTag("eng"), "Num is %04d, Num2 is: %,04d", num, num2);
    }
}
