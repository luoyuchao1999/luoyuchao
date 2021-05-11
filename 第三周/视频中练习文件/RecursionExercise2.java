
class T{
	public int peach(int n){
		if(n==10){
			return 1;
		}
		else if(n>=1&&n<=9){
			return (peach(n+1)+1)*2;
		}
		else{
			System.out.println("ÊäÈëÓÐÎó");
			return -1;
		}
	}
}
public class RecursionExercise2{
	public static void main(String[] args){
		T t1=new T();
		System.out.println(t1.peach(8));
	}
}