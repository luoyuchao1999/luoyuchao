// if-else�����ϰ
import java.util.Scanner;
public class IfExercise02{
	public static void main(String[] args){
		// ��������int�ͱ�������ֵ���ж�������֮�ͣ��Ƿ��ܱ�3��5��������ӡ��ʾ��Ϣ
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�������������֣�");
		int a = myScanner.nextInt();
		int b = myScanner.nextInt();
		int sum = a + b;
		if(sum % 3 == 0&&sum % 5 == 0)
				System.out.println("����֮��" + sum + "�ܱ�3��5ͬʱ����");
			
			else{
				System.out.println("����֮��" + sum + "���ܱ�3��5����");
			}
		
		}
	}