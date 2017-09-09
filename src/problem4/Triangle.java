package problem4;

public class Triangle {

	private final double base;
	private final double height;
	Triangle(double base,double height)
	{
		this.base=base;
		this.height=height;
	}
	public double computeArea(){		
		return 0.5 * base * height;
	}
}
