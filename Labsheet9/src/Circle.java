
public class Circle {
		
	public static final double DEFAULT_RADIUS = 1.0;
	public static final String DEFAULT_COLOR = "red";
	
		private double radius;
		private String color;
		
		//Default constructor
		Circle(){
			radius= DEFAULT_RADIUS;
			color = DEFAULT_COLOR;
		
	}
		
		
		//constructor with parameter radius and default color
		Circle(double radius){
			this.radius = radius;
			this.color = DEFAULT_COLOR;
		}
		
		// constructor with parameter radius and color
		Circle(double radius,String color){
			this.radius = radius;
			this.color = color;
		}
		
		//return the radius
		public double getRadius() {
			return this.radius;
		}
		
		//set the radius - the public setter for private attribute radius
		public void setRadius(double radius) {
			this.radius = radius;
		}
		
		//return the color-the public
		public String getColor() {
			return this.color;
		}
		
		//set the color
		public void setColor(String color) {
			this.color = color;
		}
		
		//return a string 
		public String toString() {
	        return "Circle[radius = "+radius + ",color= "+color + "]";  		
		}
		
		//return the area
		public double getArea() {
		return getRadius() * getRadius() * Math.PI;
		}
		public double get

}
