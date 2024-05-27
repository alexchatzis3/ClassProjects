package gr.aueb.cf.ch6;

/**
 * Arrays Demo.
 * Populate => insert initial values into array.
 */
public class PopulateArray {

    public static void main(String[] args) {
        //Array declaration and init
        int[] arr = new int[5]; // 0 default values

        //Populate
        arr[0] = 1;
        arr[1] = 10;
        arr[2] = 20;
        arr[3] = 60;
        arr[4] = 90;

        // Unsized Initialization
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7}; //arr2.length == 7
        System.out.println(arr2[0]);
        System.out.println(arr2[6]);

        //Array Initializer
        int[] arr3;
        arr3 = new int[] {1, 3, 5, 7};
    }
}
