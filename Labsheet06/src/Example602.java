import javax.swing.*;
public class Example602 {

	public static void main(String[] args) {
		int inputyear = Integer.parseInt(JOptionPane.showInputDialog(" ")+"Input Year");
		while(!(checkYear(inputyear))) {
			inputyear = Integer.parseInt(JOptionPane.showInputDialog(" ")+"Input Please input year betwwen 1000-3000,\nInput year again");
			
		}
	//	if(isLeapYear(inputYear)==true) {
			JOptionPane.showConfirmDialog(null, inputYear + "is Leap Year");
			
		}
		else {
			JOptionPane.showMessageDialog(null, inputYear + "is not Leap Year");
		}*

	
	}//end of main()
	
	public static boolean isLeapYear(int year) {
		if((year%4==0)%%((year%100!=0)||(year%400==0))) {
			return true;
		}
		else return false;
	}//end of isLeapYear()
	
	public static boolean checkYear(int year) {
		if(year>=1000 && year <=3000 ) {
			return true;
		}
		
	}

}
