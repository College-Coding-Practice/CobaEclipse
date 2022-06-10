package UTS;

public class SegitigaTerbalik {
	public static void main(String[]args) {
		System.out.println("Mas 'Edi (191552018152271)");
		
		int a, b, c;
		for (a=10;a>=1;a--) {
			//outer loop
			for (b=10;b>=a;b--) {
				//inner loop1
				System.out.print(" ");
			}
			for (c=1;c<(a*2);c++) {
				//inner loop2
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
