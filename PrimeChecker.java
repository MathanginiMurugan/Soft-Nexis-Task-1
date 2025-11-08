import java.util.*;
public class PrimeChecker {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=sc.nextInt();
        boolean isPrime=n>1;
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        System.out.println(n+(isPrime ? " is Prime Number" : "is not Prime Number"));
        sc.close();
    }
}
