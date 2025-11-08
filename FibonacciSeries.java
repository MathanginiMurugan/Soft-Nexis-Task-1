import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Terms: ");
        int n=sc.nextInt();
        int a=0,b=1;
        System.out.print("Fibonacci Series: ");
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");
            int sum=a+b;
            a=b;
            b=sum;
        }
        sc.close();
    }
    
}
