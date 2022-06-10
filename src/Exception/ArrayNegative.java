package Exception;

public class ArrayNegative {
	public static void main(String[]args) {
		try {
			int data []=new int[-1];//size array negative
			data[-1]=9;
			System.out.println(data[-11]);
		}catch(NegativeArraySizeException e) {
			System.out.println("Error size array tidak boleh negative"+e);
		}
	}

}
