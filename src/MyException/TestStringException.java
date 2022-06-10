package MyException;

/**
 * 
 * @author edi
 *
 */
class StringException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/* Tidak perlu memasukkan member ataupun construktor*/
}
public class TestStringException {
	public static void main(String args[]) {String
		input = "invalid input"; try {
			if (input.equals("invalid input")) {throw new
				StringException();
			}
			System.out.println("String accepted.");}catch
		(StringException e) {
				System.out.println("I hate this string:"+input+".");
			
		}
	}

}
