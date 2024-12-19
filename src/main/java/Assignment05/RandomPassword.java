package Assignment05;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {

        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numeric = "0123456789";
        String specialChar = "!@#$%^&";
        String allChar = upperCase + lowerCase + numeric + specialChar;

        Random random = new Random();
        StringBuilder password = new StringBuilder();

        // Add at least one character from each category
        password.append(upperCase.charAt(random.nextInt(upperCase.length())));
        password.append(lowerCase.charAt(random.nextInt(lowerCase.length())));
        password.append(numeric.charAt(random.nextInt(numeric.length())));
        password.append(specialChar.charAt(random.nextInt(specialChar.length())));

        // Add remaining characters to complete the password
        for (int i = 4; i < 8; i++) {
            password.append(allChar.charAt(random.nextInt(allChar.length())));
        }

        // Output the password
        System.out.println(" Random Generated Password: " + password.toString());
    }
}