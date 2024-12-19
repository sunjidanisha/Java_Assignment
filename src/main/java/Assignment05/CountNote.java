package Assignment05;

public class CountNote {
    public static void main(String[] args) {
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int amount = 546;
        countNotes(notes, amount);
    }

    public static void countNotes(int[] notes, int amount) {
        System.out.println("Breakdown of the amount: " + amount);

        for (int note : notes) {
            if (amount >= note) {
                int count = amount / note;
                amount %= note; // Update the remaining amount
                System.out.println(note + " x " + count);
            }
        }

        if (amount > 0) {
            System.out.println("Remaining amount that cannot be broken down: " + amount);
        }
    }
}
