
public class ArrayReverse{
	public static void main(String[] args){
		/* ����Ե�
		*/
		int arr[] = {11, 22, 33, 44, 55, 66};
		System.out.print("��תǰarr��ֵΪ��");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		int temp;
		for(int i = 0; i < arr.length/2; i++){
			temp = arr[arr.length-1-i];
			arr[arr.length-1-i] = arr[i];
			arr[i] = temp;
		}
		System.out.print("\n��ת��arr��ֵΪ��");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.print("\n");
	}
}