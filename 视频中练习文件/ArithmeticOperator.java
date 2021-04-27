// 演示算术运算符的使用
public class ArithmeticOperator{
	public static void main(String[] args){
		System.out.println(10 / 4);  
		System.out.println(10.0 / 4); 
		double d = 10 / 4;
		System.out.println(d); //2.0
		//注释快捷键CTRL+/,再次输出ctrl+/取消注释
		// %使用：取余
		// %的本质：看公式 a % b = a - a / b * b
		System.out.println(10 % 3); // 输出1
		System.out.println(-10 % 3); 
		// 输出-1，-10 - (-10) / 3 * 3 = -10 + 9 = -1
		System.out.println(10 % -3); 
		// 输出1，10 - 10 / (-3) * (-3) = 10 - 9 = 1
		System.out.println(-10 % -3);
		//输出-1，-10 - (-10) / (-3) * (-3) = -10 + 9 = -1
		/* ++使用
		作为表达式使用：i++ 是先赋值后自增， ++i 是先自增后赋值
		*/
 		int i = 10;
		i++;
		System.out.println("i=" + i);
		++i;
		System.out.println("i=" + i);
		// 
		int j = 8;
		int k = j++;//作为独立的使用i++和++i都等价于i = i + 1
		System.out.println("k=" + k);
		j = 8;
		k = ++j;
		System.out.println("k=" + k);
	}
}