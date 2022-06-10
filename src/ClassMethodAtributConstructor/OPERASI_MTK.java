package ClassMethodAtributConstructor;

public class OPERASI_MTK {
	//overloading method
	//perkalian
	public int OPERASI(int A,int B,int C) {
		return(A*B*C);
	}
	
	//penjumlahan
	public int OPERASI(int A, int B, int C, int D, int E) {
		return(A+B+C+D+E);
	}
	//pembagian
	public int OPERASI(int A, int B) {
		return(A/B);
	}

//pembuatan object
	public static void main(String[]args) {
		OPERASI_MTK MTK= new OPERASI_MTK();
		
		System.out.println("OPERASI MTK OVERLOAD METHOD"+"\n");
		System.out.println("Operasi Perkalian="+MTK.OPERASI(3,4,5));
		System.out.println("Operasi Penjumlahan="+MTK.OPERASI(2,4,6,7,9));
		System.out.println("Operasi Pembagian="+MTK.OPERASI(6,2));
		
	}

}
