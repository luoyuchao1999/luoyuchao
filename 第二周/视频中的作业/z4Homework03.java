
public class z4Homework03{
	public static void main(String[] args){
		/* ���1-100�в��ܱ�5����������ÿ���һ��
		*/
		int num = 0;
		for(int i = 1; i <= 100; i++){
			if(i%5 == 0){
				continue;
			}
			System.out.print(i + "\t");
			num++;
			if(num%5 == 0){
				System.out.println();
			}
		}
	}
}