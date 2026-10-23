import java.util.Scanner;



public class practice {
    public static void main(String[] args) {
    
        int number;
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt()
;
         for(int i=1; i<5; i++){
        System.out.printf("%d x %d = %d\n", number, i , number * i);   
        }     
        }
    }