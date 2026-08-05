// Program to demonstrate control structures in Java
public class ControlStructuresDemo {
    public static void main(String[] args) {
        
        // Sequential execution
        System.out.println("=== Sequential Execution ===");
        int number = 10;
        System.out.println("Number is: " + number);

        // Decision making (if-else, if-else-if)
        System.out.println("\n=== Decision Making ===");
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Switch statement
        System.out.println("\n=== Switch Case ===");
        int day = 3;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            default: System.out.println("Other Day");
        }

        // Looping structures
        System.out.println("\n=== For Loop ===");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        System.out.println("\n=== While Loop ===");
        int count = 1;
        while (count <= 3) {
            System.out.println("Count is: " + count);
            count++;
        }

        System.out.println("\n=== Do-While Loop ===");
        int j = 1;
        do {
            System.out.println("j = " + j);
            j++;
        } while (j <= 3);

        // Jump statements
        System.out.println("\n=== Break and Continue ===");
        for (int k = 1; k <= 5; k++) {
            if (k == 3) {
                System.out.println("Skipping 3 using continue");
                continue;
            }
            if (k == 5) {
                System.out.println("Breaking the loop at 5");
                break;
            }
            System.out.println("k = " + k);
        }

        // Return statement
        System.out.println("\n=== Return Statement ===");
        System.out.println("Program will return now.");
        return; // End of program
    }
}
