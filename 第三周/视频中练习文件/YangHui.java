
public class YangHui{
	// ��дһ��main����
	public static void main(String[] args){
		/* ��ӡ
		1
		1 1
		1 2 1
		1 3 3 1
		1 4 6 4 1
		*/

		int[][] arr = new int[10][];

		// ����arr����ֵ
		for(int i=0;i<arr.length;i++){
			arr[i]=new int[i+1];
			arr[i][0]=1;
			arr[i][arr[i].length-1]=1;
			for(int j=1;j<arr[i].length;j++){
				if(j!=0&&j!=arr[i].length-1){
					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
				}
			}
		}
		// ���ͼ��
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}