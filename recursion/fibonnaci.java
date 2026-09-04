import java.util.*;
class fibonnaci{
    public void fib(int a,int b, int n){
        if (n==0) return;
        System.out.print(a+" ");
        fib(b,a+b,n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         System.out.println(fib(0,1,n));
    }
}