// Switch���
public class SwitchDetail{
	public static void main(String[] args){
		char c = 'b';
		switch(c){
			case 'a':
			System.out.println("ok1");
			break;
			case 98: // ϸ��1�����ʽ�������ͣ�Ҫ��case�����������һ�£����߿����Զ�ת�ɿ��ԱȽϵ�����
			System.out.println("ok2");
			break;
			case 'b'://ϸ��2��case����ĳ��������ظ�
			System.out.println("ok3");
			break;
			default:
			System.out.println("ok4");
		}
	}
}