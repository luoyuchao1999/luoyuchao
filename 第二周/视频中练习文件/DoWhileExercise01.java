// do whileѭ����ϰ
public class DoWhileExercise01{
	public static void main(String[] args){
		// ��ӡ1-200���ܱ�5���������ܱ�3��������
		int i = 1;
		int count = 0;
		do{
			if (i%5 == 0 && i%3 != 0){
				System.out.print(i + " ");
				count++;
			}
			i++;
		}while(i <= 200);
		System.out.println("�ܹ���5���������ܱ�3��������һ��"+count);
	}
}