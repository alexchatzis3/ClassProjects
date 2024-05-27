package gr.aueb.cf.ch10;

public class NotPaired {

    public static void main(String[] args) {
        int[] arr = new int[] {1, 1, 1};
        int result = 0;

        for (int num : arr) {
            //Το ΧΟΡ ακυρώνει τα ζεύγη όμοιων αριθμών
            result ^= num;
        }
        System.out.println("Result: " + result);
    }
}
