package ClassMethodAtributConstructor;

/**
 * 
 * @author EDI
 *
 */
public class Edi {//nama class
	//deklarasi atribut
	
	String shio;
	String zodiac;
	String hobby;
	String motto;
	
	//construktor berisi parameter
	public void set(String shio, String zodiac, String hobby, String motto) {
		this.shio=shio;
		this.zodiac=zodiac;
		this.hobby=hobby;
		this.motto=motto;
	}
	
	//method mencetak
	public void lihat() {
		System.out.println("Ciri-Ciri Edi"+"\n");
		System.out.println("Shio  	 :"+shio);
		System.out.println("Zodiac   :"+zodiac);
		System.out.println("Hobby  	 :"+hobby);
		System.out.println("Motto  	 :"+motto);
	}

//pembuatan object
	public static void main(String[]args) {
		Edi AB = new Edi();
		AB.set("Dragon","Aries","Football, Play Game, do New Things","be Multitalent");
		AB.lihat();
	}

}
