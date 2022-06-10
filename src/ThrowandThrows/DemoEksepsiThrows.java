package ThrowandThrows;
import java.rmi.RemoteException;
/**
 * 
 * @author edi
 *
 */
public class DemoEksepsiThrows {
	public static void methodLain()
		throws java.rmi.ServerException,java.rmi.RemoteException
	{
		System.out.println("Eksepsi dalam method MethodLain()");
		int i=10;
		if(i==10)
			throw new java.rmi.ServerException("Eksepsi dalam method MethodLain()");
		else
			throw new java.rmi.RemoteException("Eksepsi lainnya dalam MethodLain()");
	}
	public static void main(String[]args) {
		try {
			methodLain();
		}catch (RemoteException e) {
			System.out.println("Eksepsi lainnya dalam MethodLain()");
		}
	}

}
