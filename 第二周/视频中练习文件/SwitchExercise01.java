// Switch���
import java.util.Scanner;

public class SwitchExercise01{
	// ��дһ��main����
	public static void main(String[] args){
		// ʹ��switch��佫�����Сд�ַ�ת��Ϊ��д�����ֻabcde������Ϊother
		Scanner myScanner = new Scanner(System.in);
		System.out.println("��������ĸ��a-z����");
		char c = myScanner.next().charAt(0);
		switch(c){
			case 'a':
				System.out.println("A");
				break;
			case 'b': 
				System.out.println("B");
				break;
			case 'c':
				System.out.println("C");
				break;
			case 'd':
				System.out.println("D");
				break;
			case 'e':
				System.out.println("E");
				break;
			default:
				System.out.println("other");
		}
	}
}