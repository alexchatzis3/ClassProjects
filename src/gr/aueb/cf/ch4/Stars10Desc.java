package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει 10 γραμμές με
 * 1η γραμμη -> 10 aστεράκια,
 * 2η γραμμη -> 9 αστεράκια,
 * κ.ο.κ.
 */
public class Stars10Desc {

    public static void main(String[] args) {

//        for(int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 10; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 10; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
