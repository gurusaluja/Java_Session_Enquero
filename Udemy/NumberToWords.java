public class NumberToWords {
    public static void numberToWords(int number) {
        if (number <0) {
            System.out.println("Invalid Value");
        }
        int num = reverse(number);
        if (num == 0) {
            System.out.println("Zero");
        }
        else {
            int digits = getDigitCount(number);
            int reverseDigits = getDigitCount(num);
            while (num != 0) {
                int wordNumber = num % 10;
                if (wordNumber == 0) {
                    System.out.println("Zero");
                } else if (wordNumber == 1) {
                    System.out.println("One");
                } else if (wordNumber == 2) {
                    System.out.println("Two");
                } else if (wordNumber == 3) {
                    System.out.println("Three");
                } else if (wordNumber == 4) {
                    System.out.println("Four");
                } else if (wordNumber == 5) {
                    System.out.println("Five");
                } else if (wordNumber == 6) {
                    System.out.println("Six");
                } else if (wordNumber == 7) {
                    System.out.println("Seven");
                } else if (wordNumber == 8) {
                    System.out.println("Eight");
                } else if (wordNumber == 9) {
                    System.out.println("Nine");
                }
                num /= 10;
            }
            if (reverseDigits < digits) {
                int difference = (digits - reverseDigits);
                for (int i = 1; i <= difference; i++) {
                    System.out.println("Zero");
                }
            }
        }
    }
    public static int reverse(int number) {
        int reverse = 0;
        while (number!=0){
            reverse *=10;
            reverse += number % 10;
            number /=10;
        }
        return reverse;
    }
 
    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        else if (number == 0){
                return 1;
            }
 
        else{
            int count = 0;
            while (number > 0) {
                count++;
                number /= 10;
            }
            return count;
        }
    }
}