package problem4;

final public class Circle {
	private final double radius;
	Circle(double radius)
	{
		this.radius=radius;
	}
 public double computeArea(){
		
		return radius * radius * Math.PI;
	}
}
