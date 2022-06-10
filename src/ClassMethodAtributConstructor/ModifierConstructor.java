package ClassMethodAtributConstructor;

/**
 * 
 * @author Edi
 *
 */

public class ModifierConstructor {//nama class
	//deklarasi atribut
	
	String one;
	String two;
	String three;
	String four;
	
	//construktor berisi parameter
	public void set(String one, String two, String three, String four) {
		this.one=one;
		this.two=two;
		this.three=three;
		this.four=four;
	}
	
	//method mencetak
	public void lihat() {
		System.out.println("Empat alasan cicak jatoh dari dinding:"+"\n");
		System.out.println("One  	 :"+one);
		System.out.println("Two   	 :"+two);
		System.out.println("Three  	 :"+three);
		System.out.println("Four  	 :"+four);
	}

//pembuatan object
	public static void main(String[]args) {
		ModifierConstructor AB = new ModifierConstructor();
		AB.set("Kepleset","Keseleo","Ga pegangan","Terpesona liat kamu!");
		AB.lihat();
	}


}
