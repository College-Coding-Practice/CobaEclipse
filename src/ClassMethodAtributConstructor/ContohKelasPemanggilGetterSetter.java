package ClassMethodAtributConstructor;

public class ContohKelasPemanggilGetterSetter {
	public static void main(String[]args) {
		//mengeset nilai atribut objek-objek instance kelas //ContohKelasPakaiGetterSetter 
		ContohKelasPakaiGetterSetter objekKelas_1=new 
		ContohKelasPakaiGetterSetter();
		objekKelas_1.setNim("AAA111");
		objekKelas_1.setNama("PAK BEYE");
		objekKelas_1.setAlamat("Cigondeweh");
		objekKelas_1.setJurusan("Ilmu Palak");
		
		ContohKelasPakaiGetterSetter objekKelas_2=new 
		ContohKelasPakaiGetterSetter();
		objekKelas_2.setNim("BBB222");
		objekKelas_2.setNama("ANI YUDO");
		objekKelas_2.setAlamat("Cikawaoyeh");
		objekKelas_2.setJurusan("Ilmu Pertanian");
		
		//mengambil nilai atribut dari objek-objek instanc kelas//
		//ContohKelasPakaiGetterSetter 
		String nim_1=objekKelas_1.getNim();
		String nama_1=objekKelas_1.getNama();
		String alamat_1=objekKelas_1.getAlamat();
		String jurusan_1=objekKelas_1.getJurusan();
		
		String nim_2=objekKelas_2.getNim();
		String nama_2=objekKelas_2.getNama();
		String alamat_2=objekKelas_2.getAlamat();
		String jurusan_2=objekKelas_2.getJurusan();
		
		//tampilkan output nilai atribut setiap objek
		System.out.println("NIM :"+nim_1+"\tNAMA :"+nama_1+"\tALAMAT :"+alamat_1+"\tJURUSAN :"+jurusan_1);
		
		System.out.println("NIM :"+nim_2+"\tNAMA :"+nama_2+"\tALAMAT :"+alamat_2+"\tJURUSAN :"+jurusan_2);

		
	}

}
