class Circle {
    int r;
    
    // Changed return type to float and used 22.0f / 7.0f
    public float area(){
        return (22.0f / 7.0f) * (r*r);
    }
    
    // Changed return type to float
    public float perimeterc(){
       return 2 * (22.0f / 7.0f) * r; 
    }
}

class Square{
    int S ;
    
    public int area() {
        return (S*S);
    }
}

public class object { // Note: Changed class name from 'object' to avoid built-in keyword confusion
    public static void main(String[] args) {
         Circle c = new Circle();
         Square s = new Square();
         
         c.r = 5; // Fixed: Removed the 'int' keyword here
         s.S = 5;
         // Fixed: Called the method perimeterc() instead of accessing a variable
         System.out.println("Perimeter of circle is: " + c.perimeterc());
         System.out.println("Area of circle is: " + c.area());
         System.out.println("Area of square is: " + s.area());
    }
}
