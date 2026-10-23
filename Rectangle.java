import java.util.Scanner;

public class Rectangle {
    public static void main (String[] args){
        double width;
        double height;
        
        System.out.print("Enter the width in cm :");
        Scanner sc = new Scanner(System.in);
        width = sc.nextDouble();
        
        System.out.print("Enter the height in cm :");
        height = sc.nextDouble();
        
        double area = width * height;
        
        double perimeter = 2 * (width + height);
        
        System.out.println("Area of rectangle is :" +  area);
        System.out.println("Perimeter of rectangle is :" +  perimeter);

        
    }
    
    
}