package Assignment05;

import java.util.Scanner;

public class IPCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an IP address: ");
        String ipAddress = sc.next();

        if (isValidIP(ipAddress)) {
            System.out.println("Valid IP address.");
        } else {
            System.out.println("Invalid IP address.");
        }
        sc.close();
    }

    public static boolean isValidIP(String ipAddress) {


        String[] segments = ipAddress.split("\\.");

        // Check if the number of segments is exactly 4
        if (segments.length != 4) {
            return false;
        }

        for (String segment : segments) {
            int value;
            try {
                value = Integer.parseInt(segment);
            } catch (NumberFormatException e) {
                return false;
            }


            if (value < 0 || value > 255) {
                return false;
            }


            if (segment.length() != String.valueOf(value).length()) {
                return false;
            }
        }
        return true;
    }
}
