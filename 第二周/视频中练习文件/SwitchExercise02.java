// Switch���
import java.util.Scanner;
public class SwitchExercise02{
	public static void main(String[] args){
		// ����ɼ��ж��Ƿ񼰸�
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������ɼ���");
		double score = myScanner.nextDouble();
		if(score >= 0 && score <= 100){
			switch((int)(score/60)){
				case 1:
					System.out.println("����");
					break;
				case 0: 
					System.out.println("������");
					break;
			}
		} else{
			System.out.println("����ɼ���Χ����");
		}
	}
}