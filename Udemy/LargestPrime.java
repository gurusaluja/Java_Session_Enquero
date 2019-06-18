public class LargestPrime{
    public static int getLargestPrime(int number){
        if(number<0){
            return -1;
        }
 
        else {
            int sum;
 
            for(int i=number;i>1;i--){
                if(number%i==0){
                    sum = i;
                    if(sum==2){
                        return 2;
                    }
 
                    for(int j=sum-1; j>1;j--){
                        if(sum%j==0){
                            break;
                        }
 
                        else if(j==2){
                            return sum;
                        }
                    }
                }
 
            }
            return -1;
        }
    }
}