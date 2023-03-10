package home;

import java.util.Arrays;

public class InsertElementInArray {
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 4, 5, 6};
	        int index = 2;
	        int element = 3;

	        // Make space for the new element by shifting elements to the right
	        for (int i = arr.length - 1; i > index; i--) {
	            arr[i] = arr[i - 1];
	        }

	        // Insert the new element at the desired position
	        arr[index] = element;

	        // Print the updated array
	        System.out.println(Arrays.toString(arr));
	    }
	}


