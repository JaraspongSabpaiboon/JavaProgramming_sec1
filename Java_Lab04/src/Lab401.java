import java.util.*;

public class Lab401 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input value of X : ");
		int x = input.nextInt();
		System.out.print("Input value of Y : ");
		int y = input.nextInt();
		if (y<x ) {
			do {
				System.out.print("Input valvw of y. again: ");
				y = input.nextInt();
			}while (y<x);{
				
			}
			
			int news = x;
			int sum = 0;
			int newy;
			
			for (int i =x; i<y; i++) {
				newy = i+1;
				sum = news+newy;
				System.out.println(news+"+"+newy+"="+sum);
				news=sum;
						
			}
			
			
			
			
			
		}

	}

}
