// 演示算术运算符细节
public class ArithmeticOperatorExercise01{
	public static void main(String[] args){
		// int i = 1;
		// i = i++;
		// System.out.println("i=" + i);

		// int j = 1;
		// j = ++j;
		// System.out.println("j=" + j);


		int i1 = 10;
		int i2 = 20;
		int i = i1++;
		System.out.println("i=" + i);//10
		System.out.println("i2=" + i2);//20
		i = --i2;
		System.out.println("i=" + i);//19
		System.out.println("i2=" + i2);//19
	}
}