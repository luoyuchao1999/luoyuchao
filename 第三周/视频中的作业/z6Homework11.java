import java.util.*;
public class z6Homework11{
	public static void main(String[] args){
		Tom t = new Tom();
		int winTimes = 0;//���Ӯ�Ĵ���
		
		//������ά���飬���վ�����tom��ȭ����Լ����Գ�ȭ���
		int[][] arr1 = new int [3][3];
		int j = 0;
		String[] arr2 = new String[3];//������Ӯ���
		
		Scanner myScanner = new Scanner(System.in);
		for(int i = 0;i < 3;i++){
			System.out.println("������ĸ���0-ʯͷ��1-������2-��");
			int num = myScanner.nextInt();
			t.setTomGuessNum(num);
			int tomGuessNum = t.getTomGuessNum();
			arr1[i][j+1] = tomGuessNum;
			
			int comGuessNum = t.computerNum();
			arr1[i][j+2] = comGuessNum;
			arr1[i][j] = t.guess;
			String res = t.vsComputer();
			arr2[i] = res;
			
			//ÿ�ֵ�����������
			System.out.println("==========================");
			System.out.println("����\ttom��ȭ\t���Գ�ȭ\t���");
			System.out.println(t.guess + "\t" + tomGuessNum + "\t\t" + comGuessNum + "\t\t" + res);
			System.out.println("==========================");
			winTimes = t.winTimes(res);
			
		}
		
		//��ӡ�嵥
		System.out.println("����\ttom��ȭ\t���Գ�ȭ\t���");
		for(int i = 0;i < arr1.length;i++){
			for(int k = 0;k < arr1[i].length;k++){
				System.out.print(arr1[i][k] + "\t");
			}
			System.out.print(arr2[i]);
			System.out.println();
		}
		System.out.println("tomӮ��" + winTimes + "��");
		
	}
}
class Tom{
	int tomGuessNum;//tom��ȭ
	int comGuessNum;//���Գ�ȭ
	int winTimes = 0;//Ӯ�Ĵ���
	int guess = 1;//����
	public int computerNum(){
		Random r = new Random();
		comGuessNum = r.nextInt(3);
		return comGuessNum;//����0-2������
	}
	public void setTomGuessNum(int tomGuessNum){
		if(tomGuessNum < 0 || tomGuessNum > 2){
			throw new IllegalArgumentException("������������");//�׳��쳣
		}
		this.tomGuessNum = tomGuessNum;
	}
	public int getTomGuessNum(){
		return tomGuessNum;
	}
	public String vsComputer(){
		if(tomGuessNum == 0 && comGuessNum == 1){
			return "tomӮ";
		} else if(tomGuessNum == 1 && comGuessNum == 2){
			return "tomӮ";
		}else if(tomGuessNum == 2 && comGuessNum == 0){
			return "tomӮ";
		}else if(tomGuessNum == comGuessNum){
			return "ƽ��";
		} else {
			return "tom��";
		}
	}
	
	public int winTimes(String s){
		guess++;
		if(s.equals("tomӮ")){
			winTimes++;
		}
		return winTimes;
	}

}
