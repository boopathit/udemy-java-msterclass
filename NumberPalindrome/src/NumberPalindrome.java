public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        if (number < 0) {
            number *= -1;
        }
        int n = number;
        while (number > 0) {
            int lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
        if (reverse == n) {
            return true;
        }
        return false;
    }
}
