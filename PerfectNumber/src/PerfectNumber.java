public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int count = 1;
        int sum = 0;
        while (count < number) {
            if (number % count == 0) {
                sum += count;
            }
            count++;
        }
        if (sum == number) {
            return true;
        }
        return false;
    }
}
