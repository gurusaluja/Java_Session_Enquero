public class GreatestCommonDivisor {
	public static int getGreatestCommonDivisor(int first, int second) {
		
		if (first >= 10 && second >= 10) {
			int minNum = first < second ? first : second;
			
			int greatestDivisor = 1;
			
			for (int i = minNum; i >= 1; i--) {
				if ((first % i == 0) && (second % i == 0)) {
					greatestDivisor = i;
					break;
				}
			}
			return greatestDivisor;
		}
		return -1;
	}
}