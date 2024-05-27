package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * Χρησιμοποιεί την κλάση BigInteger ώστε να μην
 * έχουμε υπερχείλιση (overflow)
 */
public class BigIntegerApp {

    public static void main(String[] args) {
        BigInteger myBigNum1 = new BigInteger("123456789123456789");
        BigInteger myBigNum2 = new BigInteger("123456789876543");

        BigInteger result = myBigNum1.add(myBigNum2);

        System.out.println("The result is: " + result);
        System.out.printf("The result is: %,d\n", result);

    }
}
