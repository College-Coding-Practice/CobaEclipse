package ThrowandThrows;

public class Throws {
	void method1() throws ArithmeticException {
		throw new ArithmeticException("Calculate Error");
		}
		void method2()throws ArithmeticException {
		method1();
		}
		void method3(){
		try {
		method2();
		}
		catch(ArithmeticException e) {
		System.out.println("Arithmetic Exception Handled");
		}
		}
		public static void main(String[] args) {
		Throws obj = new Throws();
		obj.method3();
		System.out.println("End Of Program");
		}
		

}
