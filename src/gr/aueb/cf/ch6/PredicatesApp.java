package gr.aueb.cf.ch6;

/**
 * Predicates are boolean methods.
 */
public class PredicatesApp {

    public static void main(String[] args) {
        int[] arr = {1, 34, 56, 67, 42, 52, -123, 12, 14, 61, -47, 33, 23, 25, 27};
        System.out.println("The array has at least one positive: " +  hasOnePositive(arr));
        System.out.println("The array has all positive elements: " + areAllPositive(arr));
        System.out.println("There are less than ten elements positive: " + areLTNPositive(arr, 10));
        System.out.println("There are greater than seven even elements: " + areGTEven(arr,7));
        System.out.println("There are greater than seven odd elements: " + areGTOdd(arr, 7));
        int[] endings = {3, 21, 31, 51, 64, 73, 93, 84, 23, 4};
        System.out.println("There are three elements with the same ending: " +areSameEnding(endings, 3));
        int[] tens = {3, 21, 31, 51, 64, 73, 93, 84, 23, 27};
        System.out.println("There are three elements with the same tens: " + areSameGroupOfTen(tens, 3));
    }

    /**
     * Checks if there is at least one positive in the input array.
     *
     * @param arr   the input array.
     * @return      true, if there is at least one positive,
     *              false otherwise.
     */
    public static boolean hasOnePositive(int[] arr) {
        boolean hasPositive = false;

        for (int item : arr) {
            if (item > 0) {
                hasPositive
                        = true;
                break;
            }
        }
        return hasPositive;
    }

    public static boolean areAllPositive(int[] arr) {
        int count = 0;

        for (int item : arr) {
            if (item > 0) {
                count++;
            }
        }
        return count == arr.length;
    }

    public static boolean areLTNPositive(int[] arr, int threshold) {
        int count = 0;

        for (int item : arr) {
            if (item > 0) {
                count++;
            }
        }
        return count <= threshold;
    }

    public static boolean areGTEven(int[] arr, int threshold) {
        int count = 0;

        for (int item : arr) {
            if (item % 2 == 0) {
                count++;
            }
        }
        return count >= threshold;
    }

    public static boolean areGTOdd(int[] arr, int threshold) {
        int count = 0;

        for (int item : arr) {
            if (item % 2 != 0) {
                count++;
            }
        }
        return count >= threshold;
    }

    public static boolean areSameEnding(int[] arr, int threshold) {
        int[] endings = new int[10];
        boolean sameEnding = false;

        for(int item : arr) {
            endings[item % 10]++;
        }

        for (int item : endings) {
            if (item >= threshold) {
                sameEnding = true;
                break;
            }
        }
        return sameEnding;
    }

    public static boolean areSameGroupOfTen(int[] arr, int threshold) {
        int[] tens = new int[10];
        boolean sameTen = false;

        for(int item : arr) {
            tens[item / 10]++;
        }

        for (int item : tens) {
            if (item >= threshold) {
                sameTen = true;
                break;
            }
        }
        return sameTen;
    }

}
