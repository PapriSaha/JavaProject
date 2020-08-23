import java.lang.Math;
public class Circle {
  //private instance variable
	private double radius;
	
	public Circle(double radius) {
		this.radius=radius;
	}
	//returns the radius
	public double getRadius() {
		return this.radius;
	}
	public double getArea() {
		return Math.PI*radius*radius;
	}
	public String toString() {
		return "Circle[radius = " + radius + "]";
	}
}
