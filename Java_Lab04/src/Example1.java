import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		//define object for input data from keyboard
		Scanner scan = new Scanner(System.in);
		
		//define message and input data
		System.out.print("Input a munber : ");
		int previousNumber = scan.nextInt();
		
		int currentNumber;
		
		//loop for input next number
		while(true) {
			System.out.print("Input a number : ");
			currentNumber = scan.nextInt();
			if(currentNumber < previousNumber) {
				System.out.println("Bye Bye");
				break;
				
			}
			previousNumber = currentNumber;
			
			
			
			
		}

	}

}
