public class NumberPalindrome {
    public static boolean isPalindrome(int n) {
        int rev = 0;
        int n1 = n;
        while (n1 != 0) {
            rev = (rev * 10) + (n1 % 10);
            n1 /= 10;
        }
        return (n == rev);
    }
}