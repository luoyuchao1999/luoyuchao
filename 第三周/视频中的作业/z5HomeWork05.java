public class z5HomeWork05{
	public static void main(String[] args){
		//�������10������(1-100�ķ�Χ)���浽����
		//�������ӡ�Լ���ƽ��ֵ�������ֵ�����ֵ���±ꡢ�����������Ƿ���8 
		// �������  (int)Math.random()*100 + 1
		int arr[]=new int[10];
		
		for(int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*100)+1;
			System.out.print(arr[i]+"\t");
		}
			System.out.println();
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]+"\t");
		}
			System.out.println();
		int max=arr[0];
		double sum=0;
		int low=-1;
		boolean flag=false;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
			if(arr[i]>max){
				max=arr[i];
				low=i;
			}
			if(arr[i]==8){
				flag=true;
			}
		}
		if(flag){
			System.out.println("��8");
		}
		else System.out.println("��8");
		System.out.println("ƽ��ֵ��"+sum/10.0);
		System.out.println("���ֵ"+max);
		System.out.println("���ֵ�±�"+low);
	}
		
}

