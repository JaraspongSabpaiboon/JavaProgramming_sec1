import java.util.*;
public class Lab502 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String j = scan.nextLine();
		Scanner p = new Scanner(System.in);
		System.out.print("The sentence must end with full stop point : ");
		String l = p.nextLine();
		
		while(!l.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			l = p.nextLine();
			}
		int space = 0;
		System.out.println();
		for(int i=0;i<l.length();i++) {
			if(l.charAt(i)==' ') {
				System.out.println();
			}
			else {
				System.out.print(l.charAt(i));
				
			}
			
			
		}
		

	}

}
