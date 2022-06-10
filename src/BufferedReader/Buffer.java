package BufferedReader;

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class Buffer {
	public static void main(String[]args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int a,t,h=0;
		String nama="";
		try {
			System.out.print("Masukkan namamu:");
			nama=input.readLine();
			System.out.println("\nMenghitung Luas Segitiga");
			System.out.println("==========================");
			System.out.print("Masukkan Alas:");
			a=Integer.parseInt(input.readLine());
			System.out.print("Masukkan Tinggi:");
			t=Integer.parseInt(input.readLine());
			h=(a*t/2);
		}catch(Exception e) {
			System.out.println("Error");
		}
		System.out.println("Namaku adalah :"+nama);
		System.out.println("Luas dari Segitiga adalah:"+h);
	}

}
