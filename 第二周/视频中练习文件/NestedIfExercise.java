// Ƕ��if-else���
import java.util.Scanner;
public class NestedIfExercise{
	public static void main(String[] args){
		// ��Ʊϵͳ
		// ����(4-10)������(18-60)��60����ͯ(<18)��30������(>60)��20
		// ���������ˣ�40��������20
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�������·ݣ�");
		int month = myScanner.nextInt();
		System.out.println("���������䣺");
			int age = myScanner.nextInt();
		if(month >= 4 && month <= 10){
			if (age >0 && age < 18){
				System.out.println("��ͯƱ��30");
			}
			else if(age >= 18 && age <= 60){
				System.out.println("����Ʊ��60");
			}
			else if(age > 60 && age < 120){
				System.out.println("����Ʊ��20");
			}
			else{
				System.out.println("������������");
			}
		}
		else if(month >= 1 && month <= 12){
			if(age >= 18 && age <= 60){
				System.out.println("Ʊ��40");
			}
			else if (age > 0&& age<120){
				System.out.println("Ʊ��20");
			}
			else{
				System.out.println("������������");
			}
		}
		else{
			System.out.println("�·���������");
		}
	}
}