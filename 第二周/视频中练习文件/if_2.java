import java.util.Scanner;
public class if_2{
	// 编写一个main方法
	public static void main(String[] args){
	// 输入人的年龄，若大与18岁，输出“你年龄大于18，已成年，要对自己的行为负责“
		Scanner sca=new Scanner(System.in);
		System.out.println("请输入年龄");
		int age=sca.nextInt();
		if (age>18){
			System.out.println("你年龄大于18，已成年，要对自己的行为负责");
		}
		else System.out.println("未成年");
	
	}
}