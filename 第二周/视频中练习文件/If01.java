// if-else���
import java.util.Scanner;
public class If01{
	public static void main(String[] args){
		// �����˵����䣬������18�꣬��������������18���ѳ��꣬Ҫ���Լ�����Ϊ����
		Scanner myScanner = new Scanner(System.in);
		System.out.println("���������䣺");
		int age = myScanner.nextInt();
		if(age > 18){
			System.out.println("���������18���ѳ��꣬Ҫ���Լ�����Ϊ����");
		}
		System.out.println("�������ڽ���...");
	}
}