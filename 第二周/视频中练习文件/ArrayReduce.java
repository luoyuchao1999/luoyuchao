/* ����̽���ʵ���������*/
import java.util.Scanner;
public class ArrayReduce{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		char answer; //�����û������y/n
		int arr[] = {11, 22, 33,44,55,66};
		// ��ӡ��ǰarr�ڵ�ֵ
		System.out.print("Ŀǰarr��ֵΪ��");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		// ѯ���û��Ƿ�����
		System.out.println("\n�Ƿ�Ҫ����µ�ֵ��y/n");
		answer = myScanner.next().charAt(0);
		// ���Ϊy��ִ����Ӳ���
		while(answer == 'y'){
			// �����µ���ʱ����ռ䳤�ȱ�Ŀǰarr��1��Ҫʵ����Ӳ�����
			int tempArr[] = new int[arr.length-1];
			// ѭ��������Ŀǰarr��ֵ����tempArr
			for(int i = 0; i < tempArr.length; i++){
				tempArr[i] = arr[i];
			}
			// ����arr����ָ��tempArr�ռ䣬ԭ����arr����ռ䱻������������
			arr = tempArr;
			// ѭ��������ӡ��Ӻ��arr��ֵ
			System.out.print("���º�arr��ֵΪ��");
			for(int i = 0; i < arr.length; i++){
				System.out.print(arr[i] + " ");
			}
			if(arr.length==1){break;}
			// ���½�����һ�ε��û�����ѯ��
			System.out.println("\n�Ƿ�Ҫ������y/n");
			answer = myScanner.next().charAt(0);
		}
		// ����ӡ���º��arr��ֵ
		System.out.print("������arr��ֵΪ��");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}