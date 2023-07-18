public class PalindromeChecker {

    public static boolean isPalindrome(int number) {
        String numString = String.valueOf(number);
        int left = 0;
        int right = numString.length() - 1;

        while (left < right) {
            if (numString.charAt(left) != numString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        int num = 12321; // Change this number to test different cases
        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
}
