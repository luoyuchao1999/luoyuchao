public class MiGong{
	public static void main(String[] args){
		//�����Թ� ��ά����
		int[][] map = new int[8][7];//8��7�� 
		//�涨����Ԫ�أ�0��ʾ�����ߣ�1��ʾ���ϰ�
		//������һ�к�������һ����Ϊ1
		for(int i = 0;i < 7;i++){
			map[0][i] = 1;
			map[7][i] = 1;
		}
		//��1�к����1��ȫ����Ϊ1
		for(int i = 0;i < 8;i++){
			map[i][0] = 1;
			map[i][6] = 1;
		}
		map[3][1] = 1;
		map[3][2] = 1;
		map[2][2] = 1;//����
		T t = new T();
		System.out.println(t.findWay1(map,1,1));
		for(int i = 0;i < map.length;i++){
			for(int j = 0;j < map[i].length;j++){
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}

class T{
	//ʹ�õݹ���ݵ�˼�������������Թ�
	/*
	findWay������ר�������ҳ��Թ���·��
	������ҵ��ͷ���true�����򷵻�false
	map��ʾ�Թ���i��j�������λ�ã���ʼ��λ�ã�1��1��
	�ȹ涨map�������ֵ�ĺ���
	0��ʾ���ϰ���1��ʾ���ϰ���2��ʾ����ͨ��3��ʾ�߹����߲�ͨ����·
	��map[6][5]=2��˵���ҵ�ͨ·�����Խ��������������
	ȷ��������·���� ��-��-��-��
	*/
	public boolean findWay1(int[][] map,int i,int j){
		if(map[6][5] == 2){
			return true;
		} else {
			if(map[i][j] == 0){
				//���������ͨ
				map[i][j] = 2;
				if(findWay1(map,i + 1,j)){//��
					return true;
				} else if(findWay1(map,i,j + 1)){//��
					return true;
				} else if(findWay1(map,i - 1,j)){//��
					return true;
				} else if(findWay1(map,i,j - 1)){//��
					return true;
				} else {
					map[i][j] = 3;
					return false;
				}
			} else {
				return false;
			}
		}
	}
	
	
	//�²��� ��-��-��-��
	public boolean findWay2(int[][] map,int i,int j){
		if(map[6][5] == 2){
			return true;
		} else {
			if(map[i][j] == 0){
				//���������ͨ
				map[i][j] = 2;
				if(findWay2(map,i - 1,j)){//��
					return true;
				} else if(findWay2(map,i,j + 1)){//��
					return true;
				} else if(findWay2(map,i + 1,j)){//��
					return true;
				} else if(findWay2(map,i,j - 1)){//��
					return true;
				} else {
					map[i][j] = 3;
					return false;
				}
			} else {
				return false;
			}
		}
	}
	
}