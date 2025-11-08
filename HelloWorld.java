import java.util.*;
public class HelloWorld {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name=sc.nextLine();
        System.out.println("Hello "+name+"! JDK setup successful.");
        sc.close();
    }
    
}
