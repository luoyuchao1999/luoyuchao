
public class ArrayExercise01{
	public static void main(String[] args){
		/* ����һ��char���͵�26���飬�ֱ����'A'-'Z'����ʹ��forѭ����ӡ
		*/
		// ����1. ����һ��char���飬��С26
		char array[]; 
		array = new char[26]; 
		// ����2. ѭ����ֵ
		for(char i = 0; i < array.length; i++){
			array[i] = (char)('A' + i);
		}

		// ����3. ѭ����ӡ
		System.out.println("====�����Ԫ��ֵ���������====");
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}