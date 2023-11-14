import java.util.*; //import for input data from keyboard
import java.text.DecimalFormat;
public class Example3 {

	public static void main(String[] args) {
		//2. create class Scanner for input data from keyboard
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Scanner input = new Scanner(System.in);
		//3.display and input data
		System.out.print("Input product name : ");
		String productName = input.nextLine();
		System.out.print("Input product unit : ");
		int productUnit = input.nextInt();
		System.out.print("Input Price per unit: ");
		float priceperUnit = input.nextFloat();
		System.out.println();
		float totalPrice = productUnit * priceperUnit;
		System.out.println("Total Price is "+frm.format(totalPrice)+"baht.");
		
		double addVat = totalPrice + (totalPrice*7/100);
		System.out.println("ADD VAT 7% "+frm.format(addVat)+"baht.");
		
	}

}
