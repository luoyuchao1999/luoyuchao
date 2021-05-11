
class T{
	public int fact(int n){
		if(n==1){
			return 1;
		}
		else{
			return n*fact(n-1);
		}
	}
}
public class factorial{
	public static void main(String[] args){
		T t1=new T();
		System.out.println(t1.fact(4));
	}
}