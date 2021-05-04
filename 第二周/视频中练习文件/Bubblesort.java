//ц╟ещеепР
public class Bubblesort{
	public static void main(String[] args){
		int s[]={24,69,87,57,13,22,55,44,20,66,55,22,44};
		int temp;
		for(int i=1;i<s.length;i++){
			for(int j=0;j<s.length-i;j++){
				if(s[j]>s[j+1]){
					temp=s[j];
					s[j]=s[j+1];
					s[j+1]=temp;
				}
			}
		}
		for(int i=0;i<s.length;i++){
			System.out.print(s[i]+"\t");
		}
	}
}