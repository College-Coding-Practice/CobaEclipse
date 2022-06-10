package Array;

public class ArrayUnequallnt2D {
	public static void main(String[]args) {
		//langkah 1: deklarasi variable array dan penciptaan array int int2DUnequallArr[][]=new
		int int2DUnequalArr[][]=new int[4][];
		int2DUnequalArr[0]=new int[3];
		int2DUnequalArr[1]=new int[3];
		int2DUnequalArr[2]=new int[3];
		int2DUnequalArr[3]=new int[3];
		int k=0;
		for (int i=0;i<2;i++) {
			for (int j=0;j<3;j++) {
					int2DUnequalArr[i][j]=k++;
		}
	}
	for (int i=0;i<2;i++) {
		for (int j=0;j<3;j++) {
			System.out.println(int2DUnequalArr[i][j]+"");
	}
	System.out.println();
		}
	}

}
