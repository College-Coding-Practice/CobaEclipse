package ThrowandThrows;

public class DemoEksepsiThrow {
	public static void methodLain() {
		try
		{
			throw new ArrayIndexOutOfBoundsException(1);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Penanganan eksespi dalam Method MethodLain()");
			throw e;
		}
	}
	public static void main(String[]args) {
		try
		{
			methodLain();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Penanganan eksespi dalam Method main()*");
		}
	}

}
