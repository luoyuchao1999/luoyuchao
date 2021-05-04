// 嵌套if-else语句
import java.util.Scanner;
public class NestedIfExercise{
	public static void main(String[] args){
		// 出票系统
		// 旺季(4-10)：成人(18-60)：60；儿童(<18)：30；老人(>60)：20
		// 淡季：成人：40；其他：20
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入月份：");
		int month = myScanner.nextInt();
		System.out.println("请输入年龄：");
			int age = myScanner.nextInt();
		if(month >= 4 && month <= 10){
			if (age >0 && age < 18){
				System.out.println("儿童票价30");
			}
			else if(age >= 18 && age <= 60){
				System.out.println("成人票价60");
			}
			else if(age > 60 && age < 120){
				System.out.println("老人票价20");
			}
			else{
				System.out.println("年龄输入有误");
			}
		}
		else if(month >= 1 && month <= 12){
			if(age >= 18 && age <= 60){
				System.out.println("票价40");
			}
			else if (age > 0&& age<120){
				System.out.println("票价20");
			}
			else{
				System.out.println("年龄输入有误");
			}
		}
		else{
			System.out.println("月份输入有误");
		}
	}
}