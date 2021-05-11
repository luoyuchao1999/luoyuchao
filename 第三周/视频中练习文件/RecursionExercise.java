
class T{
	public int fibonacci(int n){
		if(n>=1){
			if(n==1||n==2){
				return 1;
			}
			else{
				return fibonacci(n-1)+fibonacci(n-2);
			}
		}
		else{
			System.out.println("要求n大于1");
			return -1;
		}
	}
}
public class RecursionExercise{
	public static void main(String[] args){
		T t1=new T();
		System.out.println(t1.fibonacci(7));
	}
}