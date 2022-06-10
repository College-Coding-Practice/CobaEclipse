package ClassMethodAtributConstructor;

/**
 * 
 * @author Edi
 *
 */

public class ObjectMethod {//nama class
	//deklarasi atribut
	
	String samsung;
	String iPhone;
	String xiomi;
	String asus;
	String vivo;
	String oppo;
	String realme;
	
	//construktor berisi parameter
	public void set(String samsung, String iPhone, String xiomi, String asus, String vivo, String oppo, String realme) {
		this.samsung=samsung;
		this.iPhone=iPhone;
		this.xiomi=xiomi;
		this.asus=asus;
		this.vivo=vivo;
		this.oppo=oppo;
		this.realme=realme;
	}
	
	//method mencetak
	public void lihat() {
		System.out.println("Macam-macam Smartphone Canggih"+"\n");
		System.out.println("Samsung  	 :"+samsung);
		System.out.println("iPhone  	 :"+iPhone);
		System.out.println("Xiomi  		 :"+xiomi);
		System.out.println("Asus  		 :"+asus);
		System.out.println("Vivo 		 :"+vivo);
		System.out.println("Oppo		 :"+oppo);
		System.out.println("Realme 		 :"+realme);
	}

//pembuatan object
	public static void main(String[]args) {
		ObjectMethod AB = new  ObjectMethod();
		AB.set("Samsung Note 20 Pro","iPhone 12 Pro Max","Xiomi Black Shark 3","Asus ROG Phone 3","Vivo X50 Pro+","Oppo Find X2 Pro","Realme X50 Pro");
		AB.lihat();
	}


}
