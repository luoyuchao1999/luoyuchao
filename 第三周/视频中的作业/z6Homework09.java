public class z6Homework09{
	public static void main(String[] args){
		//Employee employee = new Employee();
	}
}
class Employee{
	String name;
	char gender;
	int age;
	String job;
	double salary;
	public Employee(String job,double salary){
		this.job = job;
		this.salary = salary;
	}
	public Employee(String name,char gender,int age){
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	public Employee(String name,char gender,int age,String job,double salary){//���ù�����
		this(name,gender,age);//ֻ�ܸ���һ��������
		//this(job,salary);
		this.job = job;
		this.salary = salary;
	}
}
