public class Object01{
	public static void main(String[] args){
	
	//����̫������ֻèè:һֻ���ֽ�С��,����3��,��ɫ��
	//����һֻ��С��,����100��,��ɫ��
	//���дһ������,���û�����Сè������ʱ,����ʾ��è�����֣����䣬��ɫ��
	//����û������Сè����������ʾ����̫û����ֻèè��
	
	// �����������ķ�ʽ�������è����
	
	
	// 2. ʹ��oop���������
	// ʵ����һֻè 
	   Cat cat1 = new Cat();
	   cat1.name = "С��";
	   cat1.age = 3;
	   cat1.color = "��ɫ";
	// �����ڶ�ֻè
	   Cat cat2 = new Cat();
	   cat2.name = "С��";
	   cat2.age = 100;
	   cat2.color = "��ɫ";
	
	
	// 3. ���ʶ��������
	System.out.println("��1ֻè��Ϣ" + cat1.name + " " + cat1.age + " " + cat1.color);
	System.out.println("��2ֻè��Ϣ" + cat2.name + " " + cat2.age + " " + cat2.color);
	
	}
}
	// 1.����һ��è��Cat -> �Զ������������
class Cat{
		String name;
		int age;
		String color;
	}