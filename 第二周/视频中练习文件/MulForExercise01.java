// 多重循环练习
import java.util.Scanner;
public class MulForExercise01{
	public static void main(String[] args){
		// 统计三个班成绩，每个班五个同学
		// 求出各个班的平均分和所有班的平均分
		Scanner myScanner = new Scanner(System.in);
		double schoolScore = 0;
		int totalPass = 0;
		for(int i = 1; i <= 3; i++){ // i表示班级
			double classScore = 0;
			for(int j = 1; j <= 5; j++){ // j表示学生
				System.out.println("请输入第" + i + "班，第" + j + "个同学的成绩：");
				double score = myScanner.nextDouble();
				if(score >= 60){
					totalPass++;
				}
				classScore += score;
			}
			schoolScore += classScore;
			System.out.println("第" + i + "班的平均成绩为" + (classScore/5.0) + ", 及格人数为" + passNum);
		}
		System.out.println("3个班总体平均分为" + (schoolScore/15.0) + ", 及格人数为" + totalPass);
	}
}