// Ƕ��if-else���
import java.util.Scanner;
public class NestedIf{
	// ��дһ��main����
	public static void main(String[] args){
		// �μӸ��ֱ�������������ɼ�����8.0���������������ʾ��̭
		// ��������ʾ���������顢Ů����
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������ɼ����Ա�");
		double score = myScanner.nextDouble();
		// �����ַ�����������ַ����ĵ�һ���ַ�
		char gender = myScanner.next().charAt(0);
		if(score >= 8.0 && score <= 10.0){
			if (gender == '��'){
				System.out.println("��������������");
			}
			else if(gender == 'Ů'){
				System.out.println("�����Ů�������");
			}
			else{
				System.out.println("�Ա���������");
			}
		}
		else if(score >= 0 && score < 8.0){
			System.out.println("���ź���δ�������");
		}
		else{
			System.out.println("��������");
		}
	}
}