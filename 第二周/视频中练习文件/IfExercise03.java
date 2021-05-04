// if-else语句练习
import java.util.Scanner;
public class IfExercise03{
	public static void main(String[] args){
		// 判断一个年份是否是闰年
		// 年份能被4整除但不是100的倍数；能被400整除
		int year = 2023;
		if(year % 400 == 0||(year%4==0 && year%100!=0)){
			System.out.println(year + "年是闰年");
		}
		else{
			
				System.out.println(year + "年不是闰年");
			}
			
		}
	}
