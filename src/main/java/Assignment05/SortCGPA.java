package Assignment05;

import java.util.Arrays;

public class SortCGPA {
    public static void main(String[] args) {
        double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};


        for (int i = 0; i < cgpa.length - 1; i++) {
            for (int j = 0; j < cgpa.length - 1 - i; j++) {
                if (cgpa[j] > cgpa[j + 1]) {
                    double temp = cgpa[j];
                    cgpa[j] = cgpa[j + 1];
                    cgpa[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted CGPA in ascending order: " + Arrays.toString(cgpa));
    }
}
