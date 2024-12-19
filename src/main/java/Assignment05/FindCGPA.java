package Assignment05;

import java.util.Scanner;

public class FindCGPA {
    public static void main(String[] args) {
        double[] cgpaList = {3.30, 3.32, 3.43, 3.48, 3.50, 3.52, 3.60, 3.63, 3.75, 3.86};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a CGPA to search: ");
        double targetCGPA = scanner.nextDouble();

        // Search for the CGPA using binary search
        int position = binarySearch(cgpaList, targetCGPA);

        if (position != -1) {
            System.out.println("CGPA " + targetCGPA + " found at position " + (position + 1) + ".");
        } else {
            System.out.println("CGPA " + targetCGPA + " not found.");
        }

        scanner.close();
    }

    // Method to perform binary search on the array
    public static int binarySearch(double[] array, double target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

            if (array[middle] == target) {
                return middle; // Return the index if found
            }

            if (array[middle] < target) {
                start = middle + 1; // Search right half
            } else {
                end = middle - 1; // Search left half
            }
        }

        return -1;
    }
}
