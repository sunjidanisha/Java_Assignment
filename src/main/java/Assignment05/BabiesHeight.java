package Assignment05;

public class BabiesHeight {
    public static void main(String[] args) {
        int[] heights = {56, 48, 52, 60, 45, 50, 49, 55, 47, 53};

        int[] result = findTwoLowestHeights(heights);
        System.out.println("The two lowest heights are:");
        System.out.println("1st Lowest: " + result[0] + " cm");
        System.out.println("2nd Lowest: " + result[1] + " cm");
    }

    public static int[] findTwoLowestHeights(int[] heights) {

        int lowest = Integer.MAX_VALUE;
        int secondLowest = Integer.MAX_VALUE;

        for (int height : heights) {
            if (height < lowest) {
                secondLowest = lowest;
                lowest = height;
            } else if (height < secondLowest && height != lowest) {
                secondLowest = height;
            }
        }

        return new int[]{lowest, secondLowest};
    }
}
