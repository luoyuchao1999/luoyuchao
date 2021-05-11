import java.util.Scanner;
public class Diamond{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		System.out.print("请输入菱形总层数：");
		// totalLevel接收菱形总层数
		int totalLevel = myScanner.nextInt();
		for(int i=1;i<=totalLevel;i++){
			for(int j=1;j<=totalLevel-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				if(k==1||k==2*i-1){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=totalLevel-1;i>0;i--){
			for(int j=1;j<=totalLevel-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++){
				if(k==1||k==2*i-1){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}