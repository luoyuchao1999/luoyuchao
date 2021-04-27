
public class StringtoBasic{
	public static void main(String[] args){
		// String -> 基本类型
		// 使用基本类型对应的包装类的相应方法，得到基本数据类型
		String s6 = "123";

		int f = Integer.parseInt(s6);
		short g = Short.parseShort(s6);
		float h = Float.parseFloat(s6);
		double i = Double.parseDouble(s6);
		long j = Long.parseLong(s6);
		byte k = Byte.parseByte(s6);
		boolean l = Boolean.parseBoolean("false");

		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		System.out.println();

		// 把字符串转换成字符char -> 含义：把字符串分装成字符
		// 得到s6字符串的第一个字符（第0号索引）'a'
		System.out.println(s6.charAt(0));
	}
}