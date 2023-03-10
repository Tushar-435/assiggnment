package home;

public class Findindex {
	public static void main(String[] args) {
		int [] marks= {40,45,48,41,10};

        // Define the element we want to find the index of
        int element = 45;

        // find the index of the element
        int index = -1; // Default value if element is not found
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == element) {
                index = i;
                break;
            }
        }

        // Print the index of the element
        if (index == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("The index of the element " + element + " is " + index + ".");
        }
    }
}

