package MyException;
/**
 * 
 * @author edi
 *
 */
class EksepsiKu extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	EksepsiKu(String s){
		super(s);
	}
}
public class TestEksepsiKu {
	public static void methodKu()
	throws EksepsiKu{
		throw new EksepsiKu("Isi EksepsiKu");
	}
	public static void main(String[]args) {
		try {
			methodKu();
		}catch (EksepsiKu e) {
			System.out.println("Terjadi eksepsi: dari"+e);
		}
	}

}
