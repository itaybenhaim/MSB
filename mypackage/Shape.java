package mypackage;



public abstract class Shape {
	protected String color;
	protected double area;
	
	/*public Shape(String c)
	{
		this.color = c;
	}
	
	public Shape(){	
	}*/
	
	public abstract String getColor();
	/*{
		return this.color;
	}*/
	public abstract void setColor(String c);/*{
		this.color = c;
	}*/
	public abstract double getArea();
	
	
}
