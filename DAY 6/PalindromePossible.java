import java.util.HashMap;
import java.util.Map;

public class PalindromePossible {

    public static boolean isPalindromePossible(String s) {
        // Create a frequency map to count the occurrences of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Count the number of characters with odd frequency
        int oddCount = 0;
        for (int freq : frequencyMap.values()) {
            if (freq % 2 != 0) {
                oddCount++;
            }
        }

        // If the length of the string is even, there should be no characters with odd frequency
        // If the length of the string is odd, there should be exactly one character with odd frequency
        return (s.length() % 2 == 0 && oddCount == 0) || (s.length() % 2 == 1 && oddCount == 1);
    }

    public static void main(String[] args) {
        String str = "abac"; // Change this string to test different cases
        if (isPalindromePossible(str)) {
            System.out.println("Palindrome can be formed from the string: " + str);
        } else {
            System.out.println("Palindrome cannot be formed from the string: " + str);
        }
    }
}
