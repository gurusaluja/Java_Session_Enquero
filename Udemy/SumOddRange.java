public class SumOddRange {
 
    public static boolean isOdd(int number) {
 
        if (number < 0) {
            return false;
        }
        if (number % 2 > 0) {
            return true;
        } else return false;
    }
 
    public static int sumOdd(int start, int end) {
        
        if ((end < start) || (end < 0) || (start < 0)) {
            return -1;
        } else {
            int sum=0;
            for (int i=start; i<=end; i++) {
                if(isOdd(i)){
                    sum+=i;
                    System.out.println(sum);
                }
            }
            return sum;
        }
        
    }
 
}