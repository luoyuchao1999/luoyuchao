
public class z2Homework04{
	// 编写一个main方法
	public static void main(String[] args){
		/* 题目
		姓名	性别	年龄	成绩 爱好
		xx	xx	xx	xx	xx

		要求：
		1）用变量将姓名性别年龄成绩爱好存储
		2）使用+
		3）添加适当的注释
		4）添加转义字符，使用一条语句输出
		*/
		// 用变量将姓名性别年龄成绩爱好存储
		String name = "jack";
		char gender = '男';
		int age = 20;
		double score = 88.5;
		String hobby = "打篮球";
		// 使用一条语句输出
		System.out.println("姓名\t性别\t年龄\t成绩\t爱好\n"+ name + '\t' + gender + '\t' + age + '\t' + score + '\t' + hobby);
	}
}