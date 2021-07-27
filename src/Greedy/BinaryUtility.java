package Greedy;

import java.util.Arrays;

public class BinaryUtility {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 5, 7};

        int search = 4;

        System.out.println(Arrays.binarySearch(arr,5));

        System.out.println(Arrays.binarySearch(arr,search));

        int index = Arrays.binarySearch(arr,search);

        // |index| - 2 :-> immidiate smaller  (in case of element not found in array)
        // |index| - 1 :-> immidiate larger (in case of element not found in array)

        System.out.println("Immidiate Larger " + arr[Math.abs(index) - 1]);
        System.out.println("Immidiate Smaller " + arr[Math.abs(index) - 2]);
    }
}
