package home;

public class ArrayCopyExample {
	    public static void main(String[] args) {
	        int[] originalArray = {1, 2, 3, 4, 5};
	        int[] copiedArray = new int[originalArray.length];

	        // iterate over the original array and copy each element to the new array
	        for (int i = 0; i < originalArray.length; i++) {
	            copiedArray[i] = originalArray[i];
	        }

	        // print out the original and copied arrays to verify the copy
	        System.out.println("Original Array:");
	        for (int i = 0; i < originalArray.length; i++) {
	            System.out.print(originalArray[i] + " ");
	        }

	        System.out.println("\nCopied Array:");
	        for (int i = 0; i < copiedArray.length; i++) {
	            System.out.print(copiedArray[i] + " ");
	        }
	    }
	}

