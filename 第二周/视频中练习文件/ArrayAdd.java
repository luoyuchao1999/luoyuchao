/* ����̽���ʵ���������*/
import java.util.Scanner;
public class ArrayAdd{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		char answer; //�����û������y/n
		int add; // �����û�������ӵ�Ԫ��
		int arr[] = {11, 22, 33};
		// ��ӡ��ǰarr�ڵ�ֵ
		System.out.print("Ŀǰarr��ֵΪ��");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		// ѯ���û��Ƿ���Ӳ�����
		System.out.println("\n�Ƿ�Ҫ����µ�ֵ��y/n");
		answer = myScanner.next().charAt(0);
		// ���Ϊy��ִ����Ӳ���
		while(answer == 'y'){
			// �����µ���ʱ����ռ䳤�ȱ�Ŀǰarr��1��Ҫʵ����Ӳ�����
			int tempArr[] = new int[arr.length+1];
			// ѭ��������Ŀǰarr��ֵ����tempArr
			for(int i = 0; i < arr.length; i++){
				tempArr[i] = arr[i];
			}
			// ��ʾ�û����������
			System.out.println("�������µ�ֵ��");
			// �����û�������ֵ
			add = myScanner.nextInt();
			// ���û������ֵ����tempArr�����һ���ռ�
			tempArr[arr.length] = add;
			// ����arr����ָ��tempArr�ռ䣬ԭ����arr����ռ䱻������������
			arr = tempArr;
			// ѭ��������ӡ��Ӻ��arr��ֵ
			System.out.print("���º�arr��ֵΪ��");
			for(int i = 0; i < arr.length; i++){
				System.out.print(arr[i] + " ");
			}
			// ���½�����һ�ε��û�����ѯ��
			System.out.println("\n�Ƿ�Ҫ����µ�ֵ��y/n");
			answer = myScanner.next().charAt(0);
		}
		// ����ӡ���º��arr��ֵ
		System.out.print("��Ӻ�arr��ֵΪ��");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}