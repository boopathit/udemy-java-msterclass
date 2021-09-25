public class NumberToWords {
    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int noOfDigits = getDigitCount(number);
        int reversedNumber = reverse(number);
        for (int i = 0; i < noOfDigits; i++) {
            int ld = reversedNumber % 10;
            switch (ld) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                default:
                    System.out.println("Zero");
                    break;
            }
            reversedNumber /= 10;
        }

    }

    public static int reverse(int number) {
        int reverseNo = 0;
        boolean isNegative = false;
        if (number < 0) {
            isNegative = true;
            number *= -1;
        }
        while (number > 0) {
            int ld = number % 10;
            reverseNo *= 10;
            reverseNo += ld;
            number /= 10;
        }
        return isNegative ? reverseNo * -1 : reverseNo;
    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number == 0) {
            return 1;
        }
        if (number < 0) {
            return -1;
        }
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
}
