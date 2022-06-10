package Array;

public class ClassMultidimensi {
	public static void main(String[]args) {
		//langkah 1: deklarasi variable array dan penciptaan array int int2DArr[][] = new
		int int2DArr[][]=new int[4][5];
		int k=0;
		for (int i=0;i<4;i++) {
			for (int j=0;j<5;j++) {
				int2DArr[i][j]=k++;
			}
		}
		for (int i=0;i<4;i++) {
			for (int j=0;j<5;j++) {
				System.out.println(int2DArr[i][j]+"");
			}
			System.out.println();
			}
		}
	}
