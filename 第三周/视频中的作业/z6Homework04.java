public class z6Homework04{
	public static void main(String[] args){
		Circle c = new Circle(3);
		c.showGirth();
		c.showArea();
		
	}
}
class Circle{
	double radius;
	public Circle(double radius){
		this.radius = radius;
	}
	public void showGirth(){
		double girth = radius * 2 * Math.PI;
		System.out.println("Բ���ܳ�Ϊ" + girth);
	}
	public void showArea(){
		double area = radius * radius * Math.PI;
		System.out.println("Բ�����Ϊ" + area);
	}
}