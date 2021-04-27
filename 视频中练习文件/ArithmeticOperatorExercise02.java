
public class ArithmeticOperatorExercise02{
	public static void main(String[] args){
		// 还有59天放假，计算多少星期多少天
		int days = 59;
		int weeks = days / 7;
		int leftday = days % 7;
		System.out.println(days + "天放假，合" + weeks + "星期" + leftday + "天");
	}
}