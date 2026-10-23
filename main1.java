import java.util.Scanner;
 class Circle {
int radius;
Circle(int radius) {
this.radius = radius; // Assign the parameter to the instance variable using &#39;this&#39;
}

public class main1 {
// Declare a separate class named Circle
public static void main(String[] args) {
    System.out.println("Enter the radius: ");
Scanner sc = new Scanner(System.in);
// Read radius value from user
int r = sc.nextInt();
// Create an object of Circle class using constructor
Circle c = new Circle(r);
// Print the radius using object member
System.out.println("Radius of the circle is: " + c.radius);
sc.close();
}
}
}
