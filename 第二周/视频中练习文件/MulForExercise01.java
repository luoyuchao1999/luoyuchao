// ����ѭ����ϰ
import java.util.Scanner;
public class MulForExercise01{
	public static void main(String[] args){
		// ͳ��������ɼ���ÿ�������ͬѧ
		// ����������ƽ���ֺ����а��ƽ����
		Scanner myScanner = new Scanner(System.in);
		double schoolScore = 0;
		int totalPass = 0;
		for(int i = 1; i <= 3; i++){ // i��ʾ�༶
			double classScore = 0;
			for(int j = 1; j <= 5; j++){ // j��ʾѧ��
				System.out.println("�������" + i + "�࣬��" + j + "��ͬѧ�ĳɼ���");
				double score = myScanner.nextDouble();
				if(score >= 60){
					totalPass++;
				}
				classScore += score;
			}
			schoolScore += classScore;
			System.out.println("��" + i + "���ƽ���ɼ�Ϊ" + (classScore/5.0) + ", ��������Ϊ" + passNum);
		}
		System.out.println("3��������ƽ����Ϊ" + (schoolScore/15.0) + ", ��������Ϊ" + totalPass);
	}
}