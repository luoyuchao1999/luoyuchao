// forѭ����ϰ
import java.util.Scanner;
public class ForExercise01{
	// ��дһ��main����
	public static void main(String[] args){
		// ѭ����ӡ0-99�ܱ�9�����������������
		Scanner myScanner = new Scanner(System.in);
		System.out.println("��������ʼֵ�ͽ���ֵ��");
		int start = myScanner.nextInt();
		int end = myScanner.nextInt();
		int count = 0;
		for(int i = start; i <= end; i++){
			if(i % 9 == 0){
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\n" + start + "-" + end + "���ܱ�9������������" + count + "��");
	}
}