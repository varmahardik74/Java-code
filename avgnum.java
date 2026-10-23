import java.util.Scanner;

public class avgnum {
 public static void main (String[] args){
     
     int count;
     System.out.print("Enter the count of number: ");
     Scanner sc = new Scanner(System.in);
     count = sc.nextInt();
     
     int numbers ; int sum = 0; float avg = 0;
     System.out.print("Enter the " + count + " numbers :");
     for( int i=0;i<count;i++){
         numbers = sc.nextInt();
         sum = sum + numbers;}
      avg = sum / count; 
      System.out.println("The avg of "+ count + " number you entered is :" + avg );
 }
}
