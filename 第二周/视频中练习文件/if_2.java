import java.util.Scanner;
public class if_2{
	// ��дһ��main����
	public static void main(String[] args){
	// �����˵����䣬������18�꣬��������������18���ѳ��꣬Ҫ���Լ�����Ϊ����
		Scanner sca=new Scanner(System.in);
		System.out.println("����������");
		int age=sca.nextInt();
		if (age>18){
			System.out.println("���������18���ѳ��꣬Ҫ���Լ�����Ϊ����");
		}
		else System.out.println("δ����");
	
	}
}