import java.util.ArrayList;
import java.util.Scanner;

public class maxelementofarrayusingobjectorientedprogramapprach {

    // Method to find the maximum element in the ArrayList
    public int solve(ArrayList<Integer> A) {
        // Check if the array is empty
        if (A == null || A.isEmpty()) {
            throw new IllegalArgumentException("ArrayList is empty");
        }

        // Initialize the maximum value as the first element in the ArrayList
        int maxElement = A.get(0);

        // Loop through the ArrayList to find the maximum element
        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) > maxElement) {
                maxElement = A.get(i);
            }
        }

        // Return the maximum element
        return maxElement;
    }

    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList of integers
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Take input from the user
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arrayList.add(scanner.nextInt());
        }

        // Create an object of the class
        maxelementofarrayusingobjectorientedprogramapprach maxFinder = new maxelementofarrayusingobjectorientedprogramapprach();

        // Call the method to find the maximum element and print the result
        int maxElement = maxFinder.solve(arrayList);
        System.out.println("The maximum element is: " + maxElement);
    }
}
