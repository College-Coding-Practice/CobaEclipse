package ThrowandThrows;

public class DemoEksepsiThrowModifikasi {
	public static void methodLain() {
		try
		{
			throw new ArrayIndexOutOfBoundsException(1);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Eitsssss ada apa ya()");
			throw e;
		}
	}
	public static void main(String[]args) {
		try
		{
			methodLain();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Eitsssss ada apa ya()*");
		}
	}

}
