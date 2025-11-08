import java.util.*;
public class DigitCounter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int num=sc.nextInt();
        int count=0;
        int temp=num;
        while(temp!=0){
            temp/=10;
            count++;
        }
        System.out.println("Total digits in "+num+" = "+count);
        sc.close();
    }
    
}
