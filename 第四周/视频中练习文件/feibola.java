
package jieduan1;
class T{
    int a=-1;
    int arr[];
    public T(int n){
        arr=new int[n];
    }
    public int sum(int n){
            if(n>=1){
                if(n==1||n==2){
                    this.a=1;
                }
                else this.a=sum(n-1)+sum(n-2);
            }
            else{
                System.out.println("输入的数要求大于1");
                return this.a;
                }
        arr[n-1]=this.a;
        return this.a;
    }
}
public class feibola {
    public static void main(String[] args) {
        int n=7;
        T t=new T(n);
        t.sum(n);
        for(int i=0;i<n;i++){
           System.out.println(t.arr[i]);
        }
    }
}
