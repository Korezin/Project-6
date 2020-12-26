package project6;

public class Rectangle extends Shape{
	protected double width;
	protected double length;
	Rectangle(){
		
	}
	Rectangle(double width, double length){
		this.width = width;
		this.length = length;
	}
	Rectangle(double width, double length, String color, boolean filled){
		this.width = width;
		this.length = length;
		this.color = color;
		this.filled = filled;
	}
	double getWidth(){
		return width;
	}
	void setWidth(double width) {
		this.width = width;
	}
	double getLength(){
		return length;
	}
	void setLength(double length) {
		this.length = length;
	}
	
	@Override
	double getArea(){
		return width * length;
	}
	
	@Override
	double getPerimeter() {
		return 2.0 * (width + length);
	}
	
	public String toString() {
		return "Width = "+width+"\n"+"Length = "+length+"\n"+"Area = "+getArea()+"\n"+"Perimeter = "+getPerimeter()+"\n";
	}
}
