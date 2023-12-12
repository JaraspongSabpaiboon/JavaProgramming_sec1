
import java.util.*;
public class Lab503 {
 
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.print("Message : ");
	String m = scan.nextLine();	
	String mg = m.toLowerCase();
	
	
	String t ="";
	int cWord = 0;
	
	if(m.indexOf("nichi")>=0) {
		cWord++;
	}
	if(cWord==0) {
		System.out.print(m );
	}
	
	else {
		System.out.print("Nichi is a sentence");
	}
	
	
	}
 
}
 