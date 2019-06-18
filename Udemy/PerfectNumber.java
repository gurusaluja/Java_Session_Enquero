public class PerfectNumber {
	public static boolean isPerfectNumber(int number) {
		
		if (number >= 1) {
			int sumOfDividors = 0;
			
			for (int i = 1; i < number; i++) {
				if (number % i == 0) {
					sumOfDividors += i;
				}
			}
			return number == sumOfDividors;
		}
		return false;
	}
}