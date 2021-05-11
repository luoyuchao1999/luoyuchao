public class PropertiesDetail{
	public static void main(String[] args){
		// p1 是对象名（对象引用）
		// new Person（）创建的对象空间（数据）才是真正的对象
		Person p1 = new Person();
		
		// 对象的属性默认值，遵守数组规则
		System.out.println("年龄是" + p1.age);
		System.out.println("名字是" + p1.name);
		System.out.println("薪水是" + p1.sal);
		System.out.println(p1.isPass);
		
	}
}

class Person{
	int age;
	String name;
	double sal;
	boolean isPass;
	
}

