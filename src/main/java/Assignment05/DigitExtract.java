package Assignment05;

import java.util.Arrays;

public class DigitExtract {
    public static void main(String[] args) {
        String str = "A core i 7 laptop price is 85000 tk and a gaming mouse price is 2500 tk." +
                "If I buy the laptop and 1 piece mouse," +
                "what will be my total cost after giving 15% discount?";

        // Extract digits from the paragraph
        String[] paraArr = str.replaceAll("\\D+", " ").trim().split(" ");
        System.out.println("Digits after extraction: " + Arrays.toString(paraArr));

        int laptopPrice = Integer.parseInt(paraArr[0]);
        int mousePrice = Integer.parseInt(paraArr[1]);
        int mouseQuantity = Integer.parseInt(paraArr[2]);

        int totalPrice = laptopPrice + (mousePrice * mouseQuantity);
        double discount = 0.15;
        double priceAfterDiscount = totalPrice * (1 - discount);

        System.out.printf("Final price after 15%% discount: %.2f bdt%n", priceAfterDiscount);
    }
}
