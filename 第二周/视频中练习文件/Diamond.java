// ��ӡ��������
import java.util.Scanner;
public class Diamond{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.print("�����������ܲ�����");
		// totalLevel���������ܲ���
		int totalLevel = myScanner.nextInt();
		for(int i = 1; i <= 2*totalLevel-1; i++){ // i����ǰ����
			if(i <= totalLevel){
				// ��ӡ������
				for(int j = 1; j <= totalLevel - i; j++){ // jѭ����ӡ�ո�
					System.out.print(" ");
				}
				for(int k = 1; k <= 2*i-1; k++){ // kѭ����ӡ*
					if(k == 1 || k == 2*i-1) {
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}else{
				// ��ӡ������
				for(int j = i - totalLevel; j >= 1; j--){ // jѭ����ӡ�ո�
					System.out.print(" ");
				}
				for(int k = 1; k <= 2*i-1; k++){ // kѭ����ӡ*
					if(k == 1 || k == 2*(2*totalLevel-i)-1) {
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}
			}
			// ��ӡ��һ��Ҫ�������
			System.out.print("\n");
		}
	}
}