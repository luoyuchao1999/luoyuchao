
public class ArrayExercise02{
	public static void main(String[] args){
		/* �����������ֵ�Ͷ�Ӧ���±�
		*/
		// ����1. ����һ��char���飬��С26
		double array[] = {102.2, -310.3, -239.4, 237, -282.3}; 
		// ����2. ����index��max
		double max = array[0];
		int flag = 0;
		// ����3. �Ƚ����ֵ
		for(int i = 1; i < array.length; i++){
			if(array[i] > max){
				max = array[i];
				flag = i;
			}
		}
		System.out.println("�������ֵΪ" + max + "����Ӧ�±�Ϊ" + (flag+1));
	}
}