/*
 * interface: 
 * 
 */

package my_project;

import mypackage.*;

public class Circle extends Shape {
	//constants
	static final String DEF_COLOR = "black";
	static final double DEF_RADIUS = 5.0;
	
	//fields
	private String color;
	private double radius;
	
	
	//methods
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}
	public double getRadius(){
		return this.radius;
	}
	public double getArea(){
		return Math.PI * radius * radius;
	}
	
	
	//end of methods
	
	
	//ctors
	public Circle(){
		this(DEF_RADIUS, DEF_COLOR);
	}
	public Circle(String color){
		this(DEF_RADIUS, color);
	}
	public Circle(double radius){
		this(radius, DEF_COLOR);
	}
	public Circle(double radius, String color){
		this.radius = radius;
		this.color = color;
	}
	//end of ctors

	public static void main(String[] args) {
		System.out.println("aabbss");
	}
}
