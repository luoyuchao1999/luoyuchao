// if-else�����ϰ
import java.util.Scanner;
public class IfExercise03{
	public static void main(String[] args){
		// �ж�һ������Ƿ�������
		// ����ܱ�4����������100�ı������ܱ�400����
		int year = 2023;
		if(year % 400 == 0||(year%4==0 && year%100!=0)){
			System.out.println(year + "��������");
		}
		else{
			
				System.out.println(year + "�겻������");
			}
			
		}
	}
