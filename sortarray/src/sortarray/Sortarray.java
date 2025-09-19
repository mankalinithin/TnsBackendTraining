package sortarray;

import java.util.Arrays;

public class Sortarray {

    public static void main(String[] args) {
        int[] array = {2, 4, 9, 1, 4, 5};  // Use consistent naming (Java convention is lowercase for variables)
        Arrays.sort(array);               // Corrected method name
        System.out.println("Sorted: " + Arrays.toString(array));
    }
}
