package Exception;

public class TryCatch {
	public static void main(String[]args) {
		int i=1;
		int j=0; try
		{
			System.out.println("i="+i+"j="+j);
			System.out.println(i/j);
			System.out.println("Blok Terakhir dari try");
		}
		catch(ArithmeticException e) {
			System.out.println("Keterangan exception="+e);
		}
		System.out.println("Setelah blok try");
		return;
	}

}
