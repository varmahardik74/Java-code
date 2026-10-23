import java.util.Scanner;

public class sumofdig {
    public static void main(String[] args) {
        
        // number =  xyz;
        // sum of xyz
        // xzy % 10 
        // remainder then % (ldigit) add in sum 
        
        int number; 
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        
        int sum = 0;
        while(number > 0){
            int lastdig = number % 10;
            number = number / 10;
            sum += lastdig; 
        }  
        
        System.out.println("The sum of numbers is :" + sum);
        
        
        
    }
}










v = pi * (r*r) * h;


number * 1 = number 
("%d x %d = %d" , number, i , number * i)