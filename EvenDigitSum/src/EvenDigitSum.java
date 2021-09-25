public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int ld = number % 10;
            if (ld % 2 == 0) {
                sum += ld;
            }
            number /= 10;
        }
        return sum;
    }
}
