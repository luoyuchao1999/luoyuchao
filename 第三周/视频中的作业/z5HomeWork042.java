public class z5HomeWork042{
	public static void main(String[] args){
		// 1��������ȷ�������Ӧ�ò��뵽�ĸ�����
		// 2��Ȼ������

		//�ȶ���ԭ����
		int[]arr = {10,12,45,21};

		int insertNum = 23;
		int index = -1; //index����Ҫ�����λ��
		//����arr���飬������� insertNum<=arr[i]��˵��i ����Ҫ�����λ��
		//ʹ��index����index = i;
		//����������û�з��� insertNum<=arr[i],˵��index = arr.length
		//���U��ӵ�arr�����
		for(int i = 0; i < arr.length;i++){
			if(insertNum <= arr[i]){
				index = i;
				break; //�ҵ�λ�ú󣬾��˳�
			}
		}
		//�ж�index��ֵ�����Կ����Ƿ��ҵ�λ��
		if(index == -1){
			index = arr.length;
		}
		
		// ����
		//�ȴ���һ���µ�����,��Сarr.length + 1
		
		int[]arrNew = new int[arr. length + 1];
		
		//��arr��Ԫ�ؿ�����arrNew ,����Ҫ����indexλ��
		/*
		����:
		int[]arr = {10��12��45,90};
		arrNew = {           }
		*/
		
		for(int i = 0, j = 0; i < arrNew.length; i++){
			if(i != index){  //˵�����԰�arr��Ԫ�ؿ�����arrNew
				arrNew[i]= arr[j];
				j++;
			}else{  //���λ�þ���Ҫ�������
				arrNew[i] = insertNum;
			}

		}
		
		// ��arrָ��araNew��ԭ�������飬�ͳ�Ϊ�����������١�
		arr = arrNew;
		
		System.out.println("=======================================");
		for(int i = 0;i< arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}