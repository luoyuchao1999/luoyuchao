public class z6Homework05{
	public static void main(String[] args){
		Cale c1 = new Cale(2,1);	
		c1.divide();
		c1.sum();
		c1.minus();
		Cale c2 = new Cale(7,5);	
		c2.multiply();
	}
}
class Cale{
	double num1;
	double num2;
	public Cale(double num1,double num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	public void sum(){
		double res = num1 + num2;
		System.out.println("�����ĺ�Ϊ" + res);
	}
	public void minus(){
		double res = num1 - num2;
		System.out.println("�����Ĳ�Ϊ" + res);
	}
	public void multiply(){
		double res = num1 * num2;
		System.out.println("�����Ļ�Ϊ" + res);
	}
	public void divide(){
		if(num2 != 0){
			double res = num1 / num2;
			System.out.println("��������Ϊ" + res);
		} else {
			System.out.println("��������Ϊ0");
		}
	}
}