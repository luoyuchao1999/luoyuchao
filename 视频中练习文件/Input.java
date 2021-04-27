// 输入的实现
// 1. 导入该类所在的包
import java.util.Scanner;

public class Input{
	public static void main(String[] args){
		// 2. 创建Scanner对象
		Scanner input = new Scanner(System.in);
		// 3. 接收用户输入(使用相关方法)
		System.out.println("请输入名字:");
		String name = input.next(); // 接收用户输入
		System.out.println("请输入年龄:");
		int age = input.nextInt();
		System.out.println("请输入薪水:");
		double salary = input.nextDouble();
		System.out.println("人的信息如下：");
		System.out.println("名字是" + name);
		System.out.println("年龄为" + age);
		System.out.println("月薪为" + salary);
	}
}