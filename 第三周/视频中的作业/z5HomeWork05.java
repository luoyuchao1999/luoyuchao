public class z5HomeWork05{
	public static void main(String[] args){
		//随机生成10个整数(1-100的范围)保存到数组
		//并倒序打印以及求平均值、求最大值和最大值的下标、并查找里面是否有8 
		// 随机生成  (int)Math.random()*100 + 1
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
			System.out.println("有8");
		}
		else System.out.println("无8");
		System.out.println("平均值："+sum/10.0);
		System.out.println("最大值"+max);
		System.out.println("最大值下标"+low);
	}
		
}

