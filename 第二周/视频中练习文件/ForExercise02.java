// for循环练习
public class ForExercise02{
	public static void main(String[] args){
		// 循环打印99乘法口诀表
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
}