public class z5HomeWork02{
	public static void main(String[] args){
		String foo = "blue";
		boolean[] bar = new boolean[2];
		if(bar[0]){
			foo = "green";
		}
		System.out.println(foo);
	}
}

// 输出blue ，因为默认值是false