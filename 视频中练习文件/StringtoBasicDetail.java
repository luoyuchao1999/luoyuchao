// 字符串和基本类型转换细节
public class StringtoBasicDetail{
	// 编写一个main方法
	public static void main(String[] args){
		String str = "hello";
		int f = Integer.parseInt(str);
		short g = Short.parseShort(str);
		float h = Float.parseFloat(str);
		double i = Double.parseDouble(str);
		long j = Long.parseLong(str);
		byte k = Byte.parseByte(str);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
	}
}