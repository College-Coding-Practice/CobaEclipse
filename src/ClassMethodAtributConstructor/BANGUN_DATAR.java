package ClassMethodAtributConstructor;

public class BANGUN_DATAR {
	//deklarasi atribut
	int sisi1, sisi2;
	int panjang;
	int lebar;
	double alas;
	double tinggi;
	private static BANGUN_DATAR luasPersegi;
	private static BANGUN_DATAR luasPersegiPanjang;
	private static BANGUN_DATAR luasSegitiga;
	private static BANGUN_DATAR luasTrapesium;
	
	//overload konstruktor
	//luas persegi
	public BANGUN_DATAR(int sisi) {
		this.sisi1=sisi;
		System.out.println("Luas Persegi="+sisi*sisi);
	}
	//luas persegi panjang
	public BANGUN_DATAR(int panjang, int lebar) {
	this.panjang=panjang;
	this.lebar=lebar;
	System.out.println("Luas Persegi Panjang="+panjang*lebar);
	}
	//luas segitiga
	public BANGUN_DATAR(double alas, double tinggi) {
		this.alas=alas;
		this.tinggi=tinggi;
		System.out.println("Luas Segitiga="+alas*tinggi*0.5);
	}
	//luas trapesium
	public BANGUN_DATAR(int sisi1, int sisi2, double tinggi) {
		this.sisi1=sisi1;
		this.sisi2=sisi2;
		this.tinggi=tinggi;
		System.out.println("Luas Trapesium="+0.5*(sisi1+sisi2)*tinggi);
	}
	//pembuatan object
	public static void main(String[]args) {
		System.out.println("LUAS BANGUN DATAR"+"\n");
		setLuasPersegi(new BANGUN_DATAR(25));
		setLuasPersegiPanjang(new BANGUN_DATAR(12,13));
		setLuasSegitiga(new BANGUN_DATAR(3,12));
		setLuasTrapesium(new BANGUN_DATAR(2,5,14));
	}
	public static BANGUN_DATAR getLuasPersegi() {
		return luasPersegi;
	}
	public static void setLuasPersegi(BANGUN_DATAR luasPersegi) {
		BANGUN_DATAR.luasPersegi = luasPersegi;
	}
	public static BANGUN_DATAR getLuasPersegiPanjang() {
		return luasPersegiPanjang;
	}
	public static void setLuasPersegiPanjang(BANGUN_DATAR luasPersegiPanjang) {
		BANGUN_DATAR.luasPersegiPanjang = luasPersegiPanjang;
	}
	public static BANGUN_DATAR getLuasSegitiga() {
		return luasSegitiga;
	}
	public static void setLuasSegitiga(BANGUN_DATAR luasSegitiga) {
		BANGUN_DATAR.luasSegitiga = luasSegitiga;
	}
	public static BANGUN_DATAR getLuasTrapesium() {
		return luasTrapesium;
	}
	public static void setLuasTrapesium(BANGUN_DATAR luasTrapesium) {
		BANGUN_DATAR.luasTrapesium = luasTrapesium;
	}
	

}
