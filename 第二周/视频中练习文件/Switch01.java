// Ƕ��if-else���
import java.util.Scanner;
public class Switch01{
	public static void main(String[] args){
		// �������һ���ַ���abcdefg��a��ʾ����һ��b��ʾ���ڶ�...
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������һ���ַ�(a-g):");
		char day = myScanner.next().charAt(0);
		switch(day){
			case 'a':
			System.out.println("����һ");
			break;
			case 'b':
			System.out.println("���ڶ�");
			break;
			case 'c':
			System.out.println("������");
			break;
			case 'd':
			System.out.println("������");
			break;
			case 'e':
			System.out.println("������");
			break;
			case 'f':
			System.out.println("������");
			break;
			case 'g':
			System.out.println("������");
			break;
			default:
			System.out.println("��������");
		}

		System.out.println("�˳���switch����������������");
	}
}