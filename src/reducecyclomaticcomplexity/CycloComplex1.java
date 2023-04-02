/**
 * 
 */
package reducecyclomaticcomplexity;

/**
 * @author reddy
 *
 */
public class CycloComplex1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = -9;
		System.out.println(greaterOrNot(n));
		System.out.println(gretaerOrNotCC(n));
	}

	private static boolean gretaerOrNotCC(int n) {
		return n>0;
	}

	private static boolean greaterOrNot(int n) {
		// TODO Auto-generated method stub
		if (n>0) {
			return true;
		} else {
			return false;
		}
	}
}