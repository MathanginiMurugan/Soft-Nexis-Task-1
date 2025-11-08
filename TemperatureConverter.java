import java.util.*;
public class TemperatureConverter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        double fahrenheit=sc.nextDouble();
        double celsius=(fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit+ "°F = "+String.format("%.2f",celsius)+"°C");
        sc.close();
    }
    
}
