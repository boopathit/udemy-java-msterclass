public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!(isValid(num1) && isValid(num2) && isValid(num3))) {
            return false;
        }
        int ld1 = num1 % 10;
        int ld2 = num2 % 10;
        int ld3 = num3 % 10;
        if (ld1 == ld2 || ld2 == ld3 || ld1 == ld3) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int num) {
        return num >= 10 && num <= 1000;
    }
}
