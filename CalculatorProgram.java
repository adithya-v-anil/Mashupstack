import java.util.Scanner;

class Calculator {
    
    public int add(int a, int b) {
          return a+b;
    }

    public int subtract(int a, int b) {
          return a-b;
    }
 
    public int multiply(int a,int b) {
        return a*b;
    }

    public double divide(int a, int b) {
        if (b==0) {
            System.out.println("Division by zero is not allowed!");
            return 0;
        } 
          return (double)a/b;
    }
}

public class CalculatorProgram {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Enter the two numbers to perform operations ");
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("\nSelect the operation you want to perform ");
                System.out.println("Choose 1 for ADDITION");
                System.out.println("Choose 2 for SUBTRACTION");
                System.out.println("Choose 3 for MULTIPLICATION");
                System.out.println("Choose 4 for DIVISION");
                System.out.println("Choose 5 for EXIT");
                System.out.print("Enter your choice: ");
                int n = sc.nextInt();

                switch(n) {
                    case 1:
                     System.out.println("Result: " +calc.add(a,b));
                     break;

                    case 2:
                     System.out.println("Result: " +calc.subtract(a,b));
                     break;

                    case 3:
                      System.out.println("Result: " +calc.multiply(a,b));
                      break;

                    case 4:
                      System.out.println("Result: " +calc.divide(a,b));
                      break;

                    case 5:
                       System.exit(0);
                       break;

                    default:
                       System.out.println("Invalid Operation!");
                }
                
        sc.close();
    }
}

