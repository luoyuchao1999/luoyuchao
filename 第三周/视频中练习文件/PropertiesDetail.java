public class PropertiesDetail{
	public static void main(String[] args){
		// p1 �Ƕ��������������ã�
		// new Person���������Ķ���ռ䣨���ݣ����������Ķ���
		Person p1 = new Person();
		
		// ���������Ĭ��ֵ�������������
		System.out.println("������" + p1.age);
		System.out.println("������" + p1.name);
		System.out.println("нˮ��" + p1.sal);
		System.out.println(p1.isPass);
		
	}
}

class Person{
	int age;
	String name;
	double sal;
	boolean isPass;
	
}

