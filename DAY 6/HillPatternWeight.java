public class HillPatternWeight {

    public static int calculateHillPatternWeight(int rows) {
        int currentNumber = 1;
        int weight = 0;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                weight += currentNumber;
                currentNumber++;
            }
        }

        return weight;
    }

    public static void main(String[] args) {
        int rows = 4; // Change this value to the number of rows you want in the hill pattern
        int weight = calculateHillPatternWeight(rows);
        System.out.println("Weight of the hill pattern with " + rows + " rows: " + weight);
    }
}
