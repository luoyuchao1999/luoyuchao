// Break��ʹ��
import java.util.Scanner;
public class Break01{
	public static void main(String[] args){
		// �û���������
		Scanner myScanner = new Scanner(System.in);
		String name = "";
		String password = "";
		int chance = 3;
		for(int i = 1; i <= 3; i++){
			System.out.println("���������֣�");
			name = myScanner.next();
			System.out.println("���������룺");
			password = myScanner.next();
			// ʹ��"����".equals(name)������name.equals("����")���Ա����ָ������
			if("����".equals(name) && "666".equals(password)){ // String�Ƚ��Ƿ�һ����equals
				System.out.println("��ϲ����¼�ɹ���");
				break;
			}
			else{chance--;
			System.out.println("��������㻹��" + chance + "�λ���");
			}
		}
	}
}