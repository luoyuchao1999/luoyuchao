
public class z4Homework02{
	public static void main(String[] args){
		/* �ж������Ƿ�Ϊˮ�ɻ��� ���100-999�����е�ˮ�ɻ���
		ˮ�ɻ�������λ���������λ�������������뱾�����
		*/
		int a;
		int b;
		int c;
		for(int i = 100; i <= 999; i++){
			a = i / 100;
			b = i / 10 % 10;
			c = i % 10;
			// System.out.println(i + " = " + a + " " + b + " " + c);
			if(a*a*a + b*b*b + c*c*c == i){
				System.out.print(i + " ");
			}
		}
		System.out.print("\n");
	}
}