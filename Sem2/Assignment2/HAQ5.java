class PointType{
	double x,y;
	public PointType(double x, double y) {
		this.x=x;
		this.y=y;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public void setXY(double x, double y) {
		this.x = x;
		this.y = y;
	}
	void show() {
		System.out.println("x = "+x+" y = "+y);
	}
	
}
class CircleType extends PointType{
	double radius;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public CircleType(double x, double y) {
		super(x,y);
	}
	public double Area(){
		return Math.PI*radius*radius;
	}
	public double perimeter() {
		return 2*Math.PI*radius;
	}
}
public class HAQ5 {

	public static void main(String[] args) {
		PointType pt1 = new PointType(3, 4);
		System.out.println("The coordinates of the point are :");
		pt1.show();
		CircleType c1 = new CircleType(2, 3);
		c1.setRadius(5);
		System.out.println("The position of the circle is : ( "+c1.getX()+", "+c1.getY()+" )");
		System.out.println("Radius of circle = "+c1.getRadius());
		System.out.println("Area of circle = "+c1.Area());
		System.out.println("Circumference of circle = "+c1.perimeter());
		
		
	}

}
