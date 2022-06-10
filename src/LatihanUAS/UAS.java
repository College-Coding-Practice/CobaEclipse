package LatihanUAS;
import java.util.Scanner;
public class UAS {
	static void header(String header){
        System.out.println(header);            
    }

    public static void main(String[] args) {
        try (Scanner masukan = new Scanner(System.in)) {
			header("Kalkulator Hutang");
			int pinjaman, lamaAngsuran, bunga, angsuran, pembayaran;

			System.out.print("Masukkan besar pinjaman : ");
			pinjaman = masukan.nextInt();

			System.out.print("Masukkan lama angsuran (bulan) : ");
			lamaAngsuran = masukan.nextInt();

			System.out.print("Masukkan besar bunga (%) : ");
			bunga = masukan.nextInt();

			angsuran = pinjaman/lamaAngsuran;

			for(int i=0; i<lamaAngsuran; i++){
			   pembayaran = angsuran + (pinjaman * bunga / 100);
			   System.out.println("Pembayaran bulan ke-"+(i+1)+" = "+pembayaran);
			   pinjaman = pinjaman - angsuran;
			}
		}

    }

}
