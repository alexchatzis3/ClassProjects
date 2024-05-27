package gr.aueb.cf.ch2;

import java.util.Scanner;

public class ToSeconds {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int SECS_PER_MINUTE = 60;
        final int SECS_PER_HOUR = 60 * 60;
        final int SECS_PER_DAY = 24 * 60 * 60;
        int days = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        int totalSeconds = 0;

        System.out.println("Please insert total days, hours, minutes and seconds");
        days =  in.nextInt();
        hours = in.nextInt();
        minutes = in.nextInt();
        seconds = in.nextInt();

        totalSeconds = (days * SECS_PER_DAY) + (hours * SECS_PER_HOUR)
                + (minutes * SECS_PER_MINUTE) + seconds;

        System.out.printf("The total seconds are %,d seconds", totalSeconds);

    }
}
