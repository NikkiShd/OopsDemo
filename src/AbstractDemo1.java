abstract class Shape1{
	String objectNmae="";
	
	Shape1(String name){
		this.objectNmae=name;
	}
	public void moveTo(int x, int y) {
		System.out.println(this.objectNmae+" "+"has been moved to"+"x="+ x + " and y="+y);
	//abstract methods which will be implemented by its subclass(es)
	}
	abstract double area();
    abstract void  draw();
}
	class Rectangle extends Shape1{
		int length,width;
		//constructor
		Rectangle(int length, int width, String name){
			super(name);
			this.length=length;
			this.width=width;
			
		}
		public void draw() {
			System.out.println("Rectangle has been drawn");
			
		}
		public double area() {
			return(double)(length*width);
	}
	}
	class Circle extends Shape1{
		double pi=3.14;
		int radius;
		Circle(int radius,String name) {
			super(name);
			this.radius=radius;
			
		}
		public void draw() {
			System.out.println("Circle has been drawn");
		}
		public double area() {
			return (double)((pi*radius*radius)/2);
		}
		
	}
public class AbstractDemo1 {

	public static void main(String[] args) {
		
//creating the Object of Rectangle class and using shape class reference.
		
		
	Shape1 rect=new Rectangle(2,3,"Rectangle");
	System.out.println("Area od Rectangle:"+rect.area());
	System.out.println(" ");
	rect.moveTo(2, 3);
	rect.draw();
	//creating object of circle class
	Shape1 circle=new Circle(2,"Circle");
	System.out.println("Area of Circle"+circle.area());
	circle.moveTo(2, 3);
	
	circle.draw();
	}

}
