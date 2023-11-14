import javax.swing.*;
import java.text.DecimalFormat;
public class Example4 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		String productName = JOptionPane.showInputDialog("Input product name : ");
		
		/*//input unit price form dialog box
		String strUnit = JOptionPane.showInputDialog("Input porduct unit : ");
		//convert string to int
		int productUnit = Integer.parseInt(strUnit);*/
		
		
		int productUnit = Integer.parseInt(JOptionPane.showInputDialog("Input product unit : "));
		
		//input unit price form dialog box
		String strPrice = JOptionPane.showInputDialog("Input price per unit : ");;
		float pricePerUnit = Float.parseFloat(strPrice);
		
		//calculate total price 
		float totalPrice = productUnit * pricePerUnit;
		float addvat = totalPrice + (totalPrice*7/100);
		//display data to dialog box
		JOptionPane.showMessageDialog(null, "Total price is "+totalPrice +" baht."
				+"\nAdd VAT 7 % is" +frm.format(addvat)+"Baht."
				,"INFORMATION_MESSAGE"
				,JOptionPane.INFORMATION_MESSAGE);
		
		
		
		
		//show data to dialog box
		
	}

}
