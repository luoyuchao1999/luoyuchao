
public class z4Homework06{
	public static void main(String[] args){
		/* ���1+(1+2)+(1+2+3)+...+(1+2+..+100)
		*/
		int sum = 0;
		for(int i = 1; i <= 100; i++){
			for (int j = 1; j <=i; j++){
				sum += j;
			}
		}
		System.out.println("1+(1+2)+(1+2+3)+...+(1+2+..+100)��ͽ��Ϊ" + sum);
	}
}