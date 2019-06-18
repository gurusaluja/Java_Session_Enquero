public class SharedDigit {
public static boolean hasSharedDigit(int numOne, int numTwo) {
		
		if ((numOne >= 10 && numOne <= 99) && (numTwo >= 10 && numTwo <= 99)) {
			int numOneFirstDigit = numOne % 10;
			int numOneSecondDigit = numOne / 10;
			int numTwoFirstDigit = numTwo % 10;
			int numTwoSecondDigit = numTwo / 10;
			
			return ((numOneFirstDigit == numTwoFirstDigit || numOneFirstDigit == numTwoSecondDigit)
					|| (numOneSecondDigit == numTwoFirstDigit || numOneSecondDigit == numTwoSecondDigit));
		}
		return false;
	}
}