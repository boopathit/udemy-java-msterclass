public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int min = first - second >= 0 ? first : second;
        int firstDivisor[] = new int[first];
        int secondDivisor[] = new int[second];
        for (int i = 1; i <= min; i++) {
            if (first % i == 0) {
                firstDivisor[(i - 1)] = i;
            }
            if (second % i == 0) {
                secondDivisor[(i - 1)] = i;
            }
        }
        for (int i = (firstDivisor.length - 1); i >= 0; i--) {
            for (int j = (secondDivisor.length - 1); j >= 0; j--) {
                if (firstDivisor[i] == secondDivisor[j] && firstDivisor[i] != 0) {
                    return firstDivisor[i];
                }
            }

        }
        return -1;
    }
}
