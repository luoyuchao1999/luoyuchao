public class TestPerson{
	public static void main(String[] args){
		Person p1 = new Person("jack",13);
		Person p2 = new Person("jack",13);
		System.out.println("���˵ıȽϽ��Ϊ" + p1.compareTo(p2));
	}
}
class Person{
	String name;
	int age;
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}
	public boolean compareTo(Person p){
		if((this.name).equals(p.name) && this.age == p.age){//���ֺ�������ȫһ��
			return true;
		} else {
			return false;
		}
	}
}