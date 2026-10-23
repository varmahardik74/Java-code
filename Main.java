import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Numerator: ");
            int n = sc.nextInt();
            System.out.print("Enter Denominator: ");
            int d = sc.nextInt();
            if(n < d){
                System.out.println("Nymerateor cannot be smaller than deniminator");}
            else{
                   int t = n / d;
            System.out.println("Result = " + t);
            System.out.println("Lets fuckinggg goooo!!!!");
            
            }

                        }
         
                
         
         catch (ArithmeticException ae) {
            System.out.println("You should not use zero !");
             System.out.println("Caught ArithmeticException: " + ae.getMessage());
         }
         
    }
}


















