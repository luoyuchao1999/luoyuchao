//����̫������ֻèè:һֻ���ֽ�С��,����3��,��ɫ��
//����һֻ��С��,����100��,��ɫ��
//���дһ������,���û�����Сè������ʱ,����ʾ��è�����֣����䣬��ɫ��
//����û������Сè����������ʾ����̫û����ֻèè��


//  ������������� =�����������ݵĹ���һֻè����Ϣ����ˣ�
import java.util.Scanner;
public class Cat{
	public static void main(String[] args){
		String cat1 = "С��";
		int age1 = 3;
		String color1 = "��ɫ";
		
		String cat2 = "С��";
		int age2 = 100;
		String color2 = "��ɫ";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("������Сè������");
		String name = scanner.next();
		if(name.equals(cat1)){
			System.out.println(cat1 + "����" + age1 + "���ˣ���һֻ" 
								+ color1 + "��Сè");
			
		}else if(name.equals(cat2)){
			System.out.println(cat2 + "����" + age2 + "���ˣ���һֻ" 
								+ color2 + "��Сè");
		}else{
			System.out.println("����̫û����ֻСè");
		}
	
	}
}



// ����=====> 1�� �����������ֲ�����   2)ֻ��ͨ���±��ȡ��Ϣ����ɱ������ֺ����ݵ�
			//                           ��Ӧ��ϵ����ȷ
			// 3) ��������è�ı仯

// ��һֻè��Ϣ
//  String[] cat1 = {"С��","3","��ɫ"};  cat[1]