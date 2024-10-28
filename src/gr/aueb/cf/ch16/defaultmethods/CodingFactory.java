package gr.aueb.cf.ch16.defaultmethods;

import java.sql.SQLOutput;

public class CodingFactory implements IWelcome{
    @Override
    public void saySomething(String message) {
        System.out.println(message);
    }

    @Override
    public void sayHelloCoding() {
        IWelcome.super.sayHelloCoding();
        System.out.println("\u2764".repeat(5)); // red heart
    }
}
