public class z5HomeWork06{
	public static void main(String[] args){
	// 6.��д�����´���Ĵ�ӡ���
		
		char[] arr1 = {'a','z','b','c'};
	    char[] arr2 = arr1;
		
		arr1[2] = '��';    // a z �� c
		for(int i = 0;i < arr2.length;i++){
			System.out.println(arr1[i] + "," + arr2[i]); 
		}
		// a,a z,z ��,�� c,c
	}
}