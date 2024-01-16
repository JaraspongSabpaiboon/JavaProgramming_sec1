
public class testCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c1 = new Circle(1.1,"blue");
		System.out.print(c1);

		Circle c2 = new Circle(2.2);
		System.out.print(c2);
		
		Circle c3 = new Circle(); //
		System.out.print(c3);
		System.out.println();
		
		
		//
		c1.setRadius(3.3);
		c1.setColor("green");
		System.out.print("The radius is: "+c1.getRadius());
		System.out.println("The color is:"+c1.getColor());
		
		//
		System.out.printf("The area is: %.2f", c1.getArea());
		System.out.printf("The citcumferrnce is: %.2f",c1.getCitcumferrnce());
		
	}

}
