import java.util.Scanner;
public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full name: ");
		String fullname =scan.nextLine();
		int space = fullname.trim().indexOf(" ");
		String sd =fullname.toLowerCase();
		if(space==-1) {
			System.out.print(fullname.substring(0,space)+"Incorrect Name");
			
		}else {
		
			System.out.print("First Name: "+sd.substring(0,space)+"\nlast Name: "+sd.substring(space+1));
			
					
			
				
		}

	}

}
