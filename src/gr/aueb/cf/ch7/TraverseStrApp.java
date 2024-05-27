package gr.aueb.cf.ch7;

/**
 * Demo of charAt().
 */
public class TraverseStrApp {

    public static void main(String[] args) {
        String s = "Athens University of Economics and Business";

        for(int i = 0; i < s.length(); i++ ) {
           System.out.print(s.charAt(i) + " ");
        }

        System.out.println();

        //reverse order
        for(int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i) + " ");
        }
    }
}
