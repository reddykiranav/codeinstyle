/**
 * 
 */
package reducecyclomaticcomplexity;

/**
 * @author reddy
 *
 */
public class CallByRefTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallByRef byRef = new CallByRef();
		byRef.data=0;
		System.out.println(byRef);
		PassItToCallByRef(byRef);
		System.out.println(byRef);
	}

	private static void PassItToCallByRef(CallByRef byRef1) {
		// TODO Auto-generated method stub
		byRef1 = new CallByRef();
		byRef1.data = 5;
		System.out.println("Inside method:" +byRef1);
	}

}

class CallByRef{
	int data;

	@Override
	public String toString() {
		return "CallByRef [data=" + data + "]";
	}
	
	
}
