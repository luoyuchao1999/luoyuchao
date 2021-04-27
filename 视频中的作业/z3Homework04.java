public class z3Homework04{
	
	public static void main(String[] args){
	//试写出将String转换成double类型的语句,以及将char类型转换成String的语句
	//举例说明即可I
		String str = "34.6";
		double d = Double.parseDouble(str);
		System.out.println(d);
		
		char c1 = '罗';
		System.out.println(c1);
		String str1 = c1 + "钰超";
		System.out.println(str1);
	}
}