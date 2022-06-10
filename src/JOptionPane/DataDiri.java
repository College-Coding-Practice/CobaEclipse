package JOptionPane;

import javax.swing.JOptionPane;

public class DataDiri {
	public static void main (String[]args) {
		String name="";
		String alamat="";
		int number1;
		int number2;
		int number3;
		double hasilA;
		double hasilB;
		double hasilC;
		name=JOptionPane.showInputDialog("Please enter your name");
		alamat=JOptionPane.showInputDialog("Please enter your address");
		number1=Integer.parseInt(JOptionPane.showInputDialog("Date"));
		number2=Integer.parseInt(JOptionPane.showInputDialog("Month"));
		number3=Integer.parseInt(JOptionPane.showInputDialog("Year"));
		hasilA=(2020-number3);
		hasilB=(number2-12);
		hasilC=(32-number1);
		String msg=("You'r Data"+"\nName :"+ name +"\nAddress :"+ alamat +"\nAge :"+ hasilA +"Year's"+"more"+ hasilB +"Month"+"and"+ hasilC +"Days");
		JOptionPane.showMessageDialog(null, msg);
	}

}
