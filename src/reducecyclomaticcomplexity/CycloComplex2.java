/**
 * 
 */
package reducecyclomaticcomplexity;

/**
 * @author reddy
 *
 */
public class CycloComplex2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 19;
		System.out.println(convertToString(n));
		System.out.println(convertToStringCC(n));
	}

	private static String convertToStringCC(int n) {
		String[] strings = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		if (n<=strings.length) {
			return strings[n];
		} else {
			return "UnKnown";
		}
	}

	private static String convertToString(int n) {
		switch (n) {
		case 0:
			return "zero";
		case 1:
			return "one";
		case 2:
			return "two";
		case 3:
			return "three";
		case 4:
			return "four";
		case 5:
			return "five";
		case 6:
			return "six";
		case 7:
			return "seven";
		case 8:
			return "eight";
		case 9:
			return "nine";
		default:
			return "unknown";
		}
	}
}