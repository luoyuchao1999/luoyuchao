// if-else语句练习
import java.util.Scanner;
public class IfExercise02{
	public static void main(String[] args){
		// 声明两个int型变量并赋值，判断两个数之和，是否能被3、5整除，打印提示信息
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入两个数字：");
		int a = myScanner.nextInt();
		int b = myScanner.nextInt();
		int sum = a + b;
		if(sum % 3 == 0&&sum % 5 == 0)
				System.out.println("两数之和" + sum + "能被3和5同时整除");
			
			else{
				System.out.println("两数之和" + sum + "不能被3、5整除");
			}
		
		}
	}