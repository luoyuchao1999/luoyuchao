
public class z4Homework01{
	public static void main(String[] args){
		/* ĳ����100,000Ԫ��ÿ����һ��·�ڣ���Ҫ�ɷѣ���������
			�ֽ�>=50,000ʱ��ÿ�ν�5%
			�ֽ�<50,000ʱ��ÿ�ν�1,000
			��̼�����˿��Ծ������ٴ�·�ڣ���while break���
		*/
		double money = 100000.0;
		int count = 0;
		while(true){
			if(money >= 50000.0){
				money *= 0.95;
				count++;
			}else if (money >= 1000){
				money -= 1000;
				count++;
			}else{
				break;
			}
		}
		System.out.println("���˹�ͬ��·��" + count + "�Σ�ʣ���ֽ�" + money);
	}
}