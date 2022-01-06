public class Square 
{
	private MyPoint corner;
	private double length;
	
	public Square(MyPoint corner, double length)
	{
		this.corner=corner;
		this.length=length;
	}
	
	public MyPoint getCorner()
	{
		return corner;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public void translateX(double x)
	{
		corner.translateX(x);
	}
}