// Switch���-��͸
import java.util.Scanner;
public class SwitchExercise03{
	public static void main(String[] args){
		// �����·ݴ�ӡ�������ڣ�345����678�ģ�9 10 11�C12��
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�������·ݣ�");
		int month = myScanner.nextInt();
		switch(month){
			case 3:
			case 4:
			case 5:
				System.out.println("����");
				break;
			case 6: 
			case 7: 
			case 8: 
				System.out.println("�ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("�＾");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("����");
				break;
			default:
				System.out.println("��������");
		}
	}
}