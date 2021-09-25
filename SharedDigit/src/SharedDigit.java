public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }
        boolean hasSharedDigit = false;
        while (num1 > 0) {
            int ld1 = num1 % 10;
            int tempNum2 = num2;
            while (tempNum2 > 0) {
                int ld2 = tempNum2 % 10;
                if (ld1 == ld2) {
                    hasSharedDigit = true;
                    break;
                }
                tempNum2 /= 10;
            }
            num1 /= 10;
            if (hasSharedDigit) {
                break;
            }
        }
        return hasSharedDigit;
    }
}
