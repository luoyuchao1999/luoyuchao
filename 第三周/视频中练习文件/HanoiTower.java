public class HanoiTower{
	public static void main(String[] args){
		Tower t = new Tower();
		t.move(3,'A','B','C');
	}
}

class Tower{
	/*
	num��ʾҪ�ƶ��ĸ�����a��b��c�ֱ��ʾA��B��C��
	*/
	public void move(int num,char a,char b,char c){
		if(num == 1){
			System.out.println(a + "->" + c);
		} else {
			//����ж���̣����Կ���������������ĺ�������������̣�num-1��
			//���ƶ��������е��̵�b������c
			move(num - 1,a,c,b);
			//���������������ƶ���c
			System.out.println(a + "->" + c);
			//�ٰ�b�������е����ƶ���c������a
			move(num - 1,b,a,c);
			
		}
	}
}