import javax.swing.*;
public class shop100baht {

	public static void main(String[] args) {
		Product sold = new Product();
		int buttonConfirm = JOptionPane.showConfirmDialog(null, "Pattanakran?");
		if(buttonConfirm == 0) {
			sold = new PattanakarnBranch();
			
		}
		
		
		int numberofProduct = Integer.parseInt(JOptionPane.showInputDialog("input the number of product;"));
		sold.setUnit(numberofProduct);
		
		JOptionPane.showMessageDialog(null, sold.toString());
		

	}

}
