
import java.util.Scanner;
public class Array01{
	public static void main(String[] args){
		/* ��ʾ �������� ������[] = new ��������[��С]
			ѭ����������ɼ������浽double���飬�����
		*/

		// ����1. ����һ��double���飬��С5
		double scores[]; // �������飬��ʱscores��null
		scores = new double[5]; // �����ڴ�ռ䣬���Դ������
		// ���������new���ᱨ���ָ���쳣
		// ����2. ѭ������
		Scanner myScanner = new Scanner(System.in);
		for(int i = 0; i < scores.length; i++){
			System.out.println("�������" + (i+1) + "��Ԫ�ص�ֵ��");
			scores[i] = myScanner.nextDouble();
		}
		// ����3. ѭ����ӡ
		System.out.println("====�����Ԫ��ֵ���������====");
		for(int i = 0; i < scores.length; i++){
			System.out.println("��" + (i+1) + "��Ԫ�ص�ֵ=" + scores[i]);
		}
	}
}