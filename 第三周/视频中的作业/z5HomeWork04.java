public class z5HomeWork04{
	public static void main(String[] args){
		//4.��֪�и���������飬Ҫ�����һ��Ԫ�أ�������˳����Ȼ������
		// ��:[10��12��45��90]�����23��,����Ϊ[10��12��23��45��90]
		
		// ˼·������������Ҫ���ݣ���Σ���Ҫ��������
		
		int[] arr = {10,12,45,90};
		
		int[] arrAdd = new int[arr.length+1];
		for(int i = 0;i < arr.length;i++){
			arrAdd[i] = arr[i];
		}
		arrAdd[arr.length] = 23;
		arr = arrAdd;
	
		int temp = 0;
		for(int i = arr.length-1;i > 0;i--){
			if(arr[i] < arr[i-1]){
				temp = arr[i];
				arr[i] = arr[i-1];
				arr[i-1] = temp;
			}
			
		}
		System.out.println("===============���Ԫ�غ��������������===============");
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		
	}
}