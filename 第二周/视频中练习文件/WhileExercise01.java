// whileѭ����ϰ
public class WhileExercise01{
	public static void main(String[] args){
		// ��ӡ1-100���ܱ�3��������
		System.out.print("��ӡ1-100���ܱ�3��������:");
		int i = 1;
		while(i <= 100){
			if(i%3 == 0){
				System.out.print(i + "\n");
			}
			i++;
		}

		System.out.println();

		// ��ӡ40-200֮�����е�ż��
		System.out.print("��ӡ40-200֮�����е�ż��:");
		int j = 40;
		while(j <= 200){
			if(j%2 == 0){
				System.out.print(j + " ");
			}
			j++;
		}
		System.out.println();
	}
}