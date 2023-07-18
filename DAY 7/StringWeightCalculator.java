public class StringWeightCalculator {

    public static int calculateStringWeight(String str) {
        int weight = 0;

        for (char c : str.toCharArray()) {
            weight += c; // Add the ASCII value of the character to the weight
        }

        return weight;
    }

    public static void main(String[] args) {
        String input = "hello"; // Change this string to calculate the weight for a different string
        int weight = calculateStringWeight(input);
        System.out.println("Weight of the string \"" + input + "\": " + weight);
    }
}
