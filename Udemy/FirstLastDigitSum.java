public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int n) {
        if (n<0)
            return -1;
        if (n<10)
            return n*2;
        int sum = n % 10, x = 0;
        while (n > 0) {
            x = n % 10;
            n = n / 10;
        }
        sum += x;
        return sum;
 
    }
} 