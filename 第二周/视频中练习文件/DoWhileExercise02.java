// do whileѭ����ϰ
import java.util.Scanner;
public class DoWhileExercise02{
	public static void main(String[] args){
		// ��ծ����Ǯ����ֹ������Ǯ��������
		Scanner myScanner = new Scanner(System.in);
		char answer = ' ';
		do{
			System.out.println("����������");
			System.out.println("�ʣ���Ǯ��");
			answer = myScanner.next().charAt(0);
			System.out.println(answer);
		}while(answer != 'y');
		System.out.println("С�����ڻ�Ǯ��");
	}
}